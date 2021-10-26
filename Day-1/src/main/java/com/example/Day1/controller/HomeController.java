package com.example.Day1.controller;

import com.example.Day1.entity.Customer;
import com.example.Day1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HomeController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Customer add(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @RequestMapping("/get-all-customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @RequestMapping("/get-count")
    public long getCountOfCustomers(){
        return  customerService.getCount();
    }

}
