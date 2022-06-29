package com.veer.twilio.repository;

import com.veer.twilio.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {
}
