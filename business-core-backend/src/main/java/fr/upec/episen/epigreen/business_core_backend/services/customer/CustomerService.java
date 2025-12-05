package fr.upec.episen.epigreen.business_core_backend.services.customer;

import fr.upec.episen.epigreen.business_core_backend.models.customer.Customer;
import fr.upec.episen.epigreen.business_core_backend.repositories.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public Customer findByIdCustomer(Long idCustomer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(idCustomer);
        return optionalCustomer.orElse(null);
    }

    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }
}