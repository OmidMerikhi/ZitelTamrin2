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
}
