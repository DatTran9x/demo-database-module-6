package com.example.demofirebase.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double priceOfHour;
    private Date dateOfOrder;
    private double hoursOfService;
    private double totalPrice;
    private int status;

    @ManyToOne
    private User nccdv;

    @ManyToOne
    private User customer;
}
