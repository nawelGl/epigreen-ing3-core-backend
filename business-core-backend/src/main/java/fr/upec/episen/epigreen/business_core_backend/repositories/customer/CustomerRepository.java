package fr.upec.episen.epigreen.business_core_backend.repositories.customer;

import fr.upec.episen.epigreen.business_core_backend.models.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}