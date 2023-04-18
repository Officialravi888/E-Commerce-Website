package org.example.controller;

import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @GetMapping("/get")
    public List<Customer>getCustomer(){
        return customerService.getCustomer();
    }


    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return customerService.findById(id);
    }
}
