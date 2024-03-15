package com.example.customerdemo.controller;

import com.example.customerdemo.data.Customer;
import com.example.customerdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping(path = "/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomers(customer);
    }

    @GetMapping(path = "/customers/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping(path = "/customers/{id}")
    public void deleteCustomerById(@PathVariable int id) {
        customerService.deleteCustomer(id);
    }
    @PutMapping(path = "/customer")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }
    @GetMapping(path = "/customer" ,params = "name")
    public Customer getCustomersByName(String name){
        return customerService.getCustomersByName(name);
    }
    @GetMapping(path = "/customer" ,params = {"name","age"})
    public List <Customer> findCustomersByNameAndAge(@RequestParam String name, @RequestParam int age){
        return customerService.findCustomersByNameAndAge(name,age);
    }
}
