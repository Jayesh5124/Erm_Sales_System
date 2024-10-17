package com.example.mongodb_sales.repository;

import com.example.mongodb_sales.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
