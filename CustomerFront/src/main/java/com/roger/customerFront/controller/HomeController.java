package com.roger.customerFront.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.roger.customerFront.dao.RoleDAO;
import com.roger.customerFront.domain.Customer;
import com.roger.customerFront.domain.security.UserRole;
import com.roger.customerFront.services.CustomerService;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private RoleDAO roleDAO;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("Index mapping");
		return "index";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "signup";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public String signupPost(@ModelAttribute("customer") Customer customer, Model model) {
		
		if(customerService.checkCustomerExists(customer.getUsername(), customer.getEmail())) {
			
			if(customerService.checkEmailExists(customer.getEmail())) {
				model.addAttribute("emailExists", true);
			}
			if(customerService.checkUsernameExists(customer.getUsername())) {
				model.addAttribute("usernameExists", true);
			}
			
			return "signup";
			
		} else {
			Set<UserRole> userRoles = new HashSet<>();
			userRoles.add(new UserRole(customer, roleDAO.findByName("ROLE_USER")));
			
			customerService.createUser(customer, userRoles);
			
			return "redirect:/";
		}
	}
	
}
