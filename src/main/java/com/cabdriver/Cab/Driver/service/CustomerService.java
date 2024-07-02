package com.cabdriver.Cab.Driver.service;

import com.cabdriver.Cab.Driver.exceptions.UserNotFound;
import com.cabdriver.Cab.Driver.models.Customer;
import com.cabdriver.Cab.Driver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    public Customer getCustomerById(int customerID){
        return customerRepository.findById(customerID).orElse(null);
    }

    public void registerAccount(Customer customer){
        customerRepository.save(customer);
    }

    public String authenticateCustomer(String email, String password){
        Customer customer = customerRepository.findByEmail(email);
        if(customer == null){
            throw new UserNotFound(String.format("User with email %s does not exist", email));
        }
        String orginalPassword = customer.getPassword();
        if(orginalPassword.equals(password)){
            return "Authentication Successfull";
        }
        return "Authentication Failed";
    }


    public Customer getCustomerByEmail(String emailID){
        return customerRepository.findByEmail(emailID);
    }
}
