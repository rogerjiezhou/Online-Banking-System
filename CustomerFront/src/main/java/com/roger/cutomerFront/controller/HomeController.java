package com.roger.cutomerFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.roger.cutomerFront.domain.Customer;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "signup";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public void signupPost(@ModelAttribute("customer") Customer customer, Model model) {
		
//		if(customerService.checkCustomerExists(customer.getUsername(), customer.getEmail())) {
//			
//			if(customerService.checkEmailExists(customer.getEmail())) {
//				model.addAttribute("emailExists", true);
//			}
//			if(customerService.checkUsernameExists(customer.getUsername())) {
//				model.addAttribute("usernameExists", true);
//			}
//			
//			return "signup";
//		} else {
//			
//		}
	}
	
}
