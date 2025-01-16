package com.akshay.basedomains.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;

//    public String getOrderId() {
//        return orderId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getQty() {
//        return qty;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setQty(int qty) {
//        this.qty = qty;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
}
