package com.example.customermanagementspring.services;

import com.example.customermanagementspring.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
