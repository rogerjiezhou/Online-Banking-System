package com.roger.customerFront.services;

import java.util.Set;

import com.roger.customerFront.domain.User;
import com.roger.customerFront.domain.security.UserRole;

public interface UserService {

    public User findByUsername(String username);

    public User findByEmail(String email);
    
    public User createUser(User user, Set<UserRole> userRoles); 
    
    public boolean checkUserExists(String username, String email);

	public boolean checkEmailExists(String email);

	public boolean checkUsernameExists(String username);
}
