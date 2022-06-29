package com.veer.twilio.controller;

import com.veer.twilio.model.Customer;
import com.veer.twilio.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("customer/add")
    public Customer insertCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable("id")String id){
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()){
            return customer.get();
        }
        return null;
    }

}
