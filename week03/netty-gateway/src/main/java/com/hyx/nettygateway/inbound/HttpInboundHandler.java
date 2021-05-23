package com.hyx.nettygateway.inbound;

import com.hyx.nettygateway.filter.HeaderHttpRequestFilter;
import com.hyx.nettygateway.filter.HttpRequestFilter;
import com.hyx.nettygateway.outbound.httpclient4.HttpOutboundHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.util.ReferenceCountUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class HttpInboundHandler extends ChannelInboundHandlerAdapter {

    private final List<String> proxyServer;
    private HttpOutboundHandler handler;
    private HttpRequestFilter filter = new HeaderHttpRequestFilter();

    public HttpInboundHandler(List<String> proxyServer) {
        this.proxyServer = proxyServer;
        this.handler = new HttpOutboundHandler(this.proxyServer);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object msg) {
        try {
            log.info("channelRead流量接口请求开始，时间为 {}", System.currentTimeMillis());
            FullHttpRequest fullHttpRequest = (FullHttpRequest) msg;
            handler.handle(fullHttpRequest, channelHandlerContext, filter);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }
}
