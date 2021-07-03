package com.example.rpcfxdemoprovider;


import com.example.rpcfxdemoapi.Order;
import com.example.rpcfxdemoapi.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order findOrderById(int id) {
        return new Order(id, "order-" + System.currentTimeMillis(), 9.9f);
    }
}
