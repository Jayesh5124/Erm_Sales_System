package com.example.mongodb_sales.service;

import com.example.mongodb_sales.dto.CustomerDTO;
import com.example.mongodb_sales.model.Customer;
import com.example.mongodb_sales.repository.CustomerRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepo;

    private final JPAStreamer jpaStreamer;

    @Autowired
    public CustomerService(final JPAStreamer jpaStreamer){
        this.jpaStreamer=jpaStreamer;
    }



    public Map<String, List<Customer>> groupByCity(){
        return jpaStreamer.stream(Customer.class).collect(Collectors.groupingBy(Customer::getCity));
    }

    public Customer saveCustomer(CustomerDTO cust){
        Customer customer=Customer.builder()
                .dob(cust.getDob())
                .firstName(cust.getFirstName())
                .address(cust.getAddress())
                .city(cust.getCity())
                .email(cust.getEmail())
                .bankAccNo(cust.getBankAccNo())
                .lastName(cust.getLastName())
                .gender(cust.getGender())
                .state(cust.getState())
                .pincode(cust.getPincode())
                .phoneNumber(cust.getPhoneNumber())
                .build();
        return customerRepo.save(customer);
    }

    public Map<String,Long> countCustomerByGender(){
        return jpaStreamer.stream(Customer.class).collect(Collectors.groupingBy(Customer::getGender,Collectors.counting()));
    }

}
