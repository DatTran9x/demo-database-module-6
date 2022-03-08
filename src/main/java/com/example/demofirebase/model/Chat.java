package com.example.demofirebase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    @ManyToOne
    User customer;

    @ManyToOne
    User nccdv;
}
