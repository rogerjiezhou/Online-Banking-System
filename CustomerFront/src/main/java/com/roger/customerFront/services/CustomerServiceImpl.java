package com.roger.customerFront.services;

import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.roger.customerFront.dao.CustomerDAO;
import com.roger.customerFront.dao.RoleDAO;
import com.roger.customerFront.domain.Customer;
import com.roger.customerFront.domain.security.UserRole;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
    private RoleDAO roleDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    private AccountService accountService;
	
	public void save(Customer customer) {
        customerDAO.save(customer);
    }

    public Customer findByUsername(String username) {
    	System.out.println("In Customer Service findbyname");
        return customerDAO.findByUsername(username);
    }

    public Customer findByEmail(String email) {
        return customerDAO.findByEmail(email);
    }
    
    public Customer createUser(Customer user, Set<UserRole> userRoles) {
    	Customer localUser = customerDAO.findByUsername(user.getUsername());

        if (localUser != null) {
            LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
        } else {
            String encryptedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encryptedPassword);

            for (UserRole ur : userRoles) {
                roleDao.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

            user.setPrimaryAccount(accountService.createCheckingAccount());
            user.setSavingsAccount(accountService.createSavingsAccount());

            localUser = customerDAO.save(user);
        }

        return localUser;
    }
    
    public boolean checkCustomerExists(String username, String email) {
    	if(checkUsernameExists(username) || checkEmailExists(email)) {
    		return true;
    	} else {
    		return false;
    	}
    }

	public boolean checkEmailExists(String email) {
		if(null != findByEmail(email)) {
			return true;
		}
		return false;
	}

	public boolean checkUsernameExists(String username) {
		if(null != findByUsername(username)) {
			return true;
		}
		return false;
	}
}
