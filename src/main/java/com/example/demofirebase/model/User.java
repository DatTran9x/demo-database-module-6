package com.example.demofirebase.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String username;
    @Size(min=8,max=16)
    private String password;
    @Email
    private String email;
    @NotBlank
    private String phoneNumber;
    @Min(18)
    private int age;
    private String gender;
    private String dateOfBirth;
    private String city;
    private String nationality;
    private String avatar;
    private int status;
    private String description;
    private String requirement;
    private Date startDate;
    private Date vipDate;
    private String facebookUrl;
    private Long countOfDate;
    private String cmtnd;

    // it nhat 3 anh
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Img> imgs;

    // Có 3 roles : Customer,Admin và nhà cung cấp dịch vụ (NCCDV)
    @OneToOne
    private Role role;

    //Nhung thuoc tinh ben duoi la cua ben cung cap dich vu
    //ko bat buoc nhap luc dang ky la customer
    private double price;

    //List dich vu
    @ManyToMany
    private Set<ServiceOfNCCDV> servicesOfNCCDV;

    //Danh gia cua khach hang
    @ManyToMany
    private Set<Review> reviews;


}
