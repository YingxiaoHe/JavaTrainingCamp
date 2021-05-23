package com.hyx.nettygateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

public class HeaderHttpRequestFilter implements HttpRequestFilter {

    @Override
    public void filter(FullHttpRequest fullHttpRequest, ChannelHandlerContext channelHandlerContext) {
        fullHttpRequest.headers().set("requestFilter", "requestFilter");
    }

}
