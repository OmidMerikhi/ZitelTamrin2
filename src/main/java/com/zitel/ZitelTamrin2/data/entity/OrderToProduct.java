package com.zitel.ZitelTamrin2.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orderToProduct_tbl")
@Data
public class OrderToProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderToProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public OrderToProduct() {
    }

    @Override
    public String toString() {
        return "OrderToProduct{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
