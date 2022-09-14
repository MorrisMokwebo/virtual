package com.adunaonline.virtual.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_number")
    private long orderNumber;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "amount")
    private double amount;

    @Column(name = "total")
    private double total;

    public Order(long orderNumber, Integer quantity, double amount, double total) {
        this.orderNumber = orderNumber;
        this.quantity = quantity;
        this.amount = amount;
        this.total = total;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
