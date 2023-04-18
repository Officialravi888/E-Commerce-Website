package org.example.service;

import org.example.entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    public List<Customer> getCustomer;
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer>getCustomer(){
        return customerRepository.findAll();
    }
    public void save(Customer customer){
        customerRepository.save(customer);
    }
    public Customer findById(Integer id){
        Optional<Customer>customerResult=customerRepository.findById(id);
        Customer customer=null;
        if (customerResult.isPresent()){
            customer=customerResult.get();
        }
        return customer;
    }
    public void delete(Customer customer){
        customerRepository.save(customer);
    }

}
