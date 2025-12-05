package fr.upec.episen.epigreen.business_core_backend.controllers.customer;

import fr.upec.episen.epigreen.business_core_backend.models.customer.Customer;
import fr.upec.episen.epigreen.business_core_backend.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController{

    @Autowired
    private CustomerService customerService;
    @GetMapping("/{id}")
    public ResponseEntity<Customer> findByIdCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerService.findByIdCustomer(id), HttpStatus.OK);
    }

    @GetMapping("all")
    public ResponseEntity<List<Customer>> findAllCustomer(){
        return new ResponseEntity<>(customerService.findAllCustomer(), HttpStatus.OK);
    }
}