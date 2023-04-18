package org.example.controller;

import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    private List<Customer>getCustomer(){
        return customerService.getCustomer;
    }
    @PostMapping("/customer")
    private Customer saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }
}