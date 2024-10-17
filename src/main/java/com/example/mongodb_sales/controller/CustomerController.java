package com.example.mongodb_sales.controller;


import com.example.mongodb_sales.dto.CustomerDTO;
import com.example.mongodb_sales.model.Customer;
import com.example.mongodb_sales.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody @Valid CustomerDTO customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/groupByCity")
    public Map<String,List<Customer>> groupByCustomerCity(){
        return customerService.groupByCity();
    }

    @GetMapping("/countByGender")
    public Map<String,Long> countCustomersByGender(){
        return customerService.countCustomerByGender();
    }
}
