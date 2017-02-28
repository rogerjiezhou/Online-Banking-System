package com.roger.customerFront.services;

import java.util.Set;

import com.roger.customerFront.domain.Customer;
import com.roger.customerFront.domain.security.UserRole;

public interface CustomerService {

    public Customer findByUsername(String username);

    public Customer findByEmail(String email);
    
    public Customer createUser(Customer user, Set<UserRole> userRoles); 
    
    public boolean checkCustomerExists(String username, String email);

	public boolean checkEmailExists(String email);

	public boolean checkUsernameExists(String username);
}
