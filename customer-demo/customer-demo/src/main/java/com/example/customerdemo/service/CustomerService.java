package com.example.customerdemo.service;

import com.example.customerdemo.data.Customer;
import com.example.customerdemo.data.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomers(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        }
        return null;
    }

    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping(path = "/customers", params = "name")
    public Customer getCustomersByName(@RequestParam String name) {
        return customerRepository.getCustomersByName(name);
    }

    public List<Customer> findCustomersByNameAndAge(String name, int age) {
        return customerRepository.findCustomersByNameAndAge(name, age);
    }
}


