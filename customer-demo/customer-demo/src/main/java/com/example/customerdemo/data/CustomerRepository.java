package com.example.customerdemo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository
extends JpaRepository<Customer,Integer> {
    @Query("select c from Customer u where c.name=?1")
    Customer getCustomersByName(String name);


    @Query("select c from customer c where c.name=?1 and c.age=?2")
    List<Customer> findCustomersByNameAndAge(String name, int age);

}
