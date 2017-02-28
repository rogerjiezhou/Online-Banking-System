package com.roger.customerFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.roger.customerFront.domain.security.Role;

public interface RoleDAO extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
