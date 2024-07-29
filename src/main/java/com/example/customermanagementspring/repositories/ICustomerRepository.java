package com.example.customermanagementspring.repositories;

import com.example.customermanagementspring.models.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}
