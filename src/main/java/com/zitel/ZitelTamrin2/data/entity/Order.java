package com.zitel.ZitelTamrin2.data.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "order_tbl")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int trackNumber;
    private double totalPrice;
    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order(int trackNumber, double totalPrice, LocalDateTime orderDate, Customer customer) {
        this.trackNumber = trackNumber;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", trackNumber=" + trackNumber +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                '}';
    }
}
