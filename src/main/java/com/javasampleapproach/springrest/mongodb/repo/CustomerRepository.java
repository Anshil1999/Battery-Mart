package com.javasampleapproach.springrest.mongodb.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>
{
	List<Customer> findByPhone(String phone);
}
