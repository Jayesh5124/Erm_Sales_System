package com.example.mongodb_sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String state;
    private int pincode;
    private String address;
    private String gender;
    private long bankAccNo;
    private String dob;
    private String email;
    private String city;



}
