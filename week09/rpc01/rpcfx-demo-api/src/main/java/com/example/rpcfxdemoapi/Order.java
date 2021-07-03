package com.example.rpcfxdemoapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private int id;

    private String name;

    private float amount;

}
