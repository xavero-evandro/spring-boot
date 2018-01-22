package com.xavero.repository;

import com.xavero.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {


    public Customer findByName(String name);
}
