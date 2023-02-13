package ca.vanier.customersapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.addresses.entity.*;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
