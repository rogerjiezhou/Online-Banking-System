package com.roger.cutomerFront.domain;

import java.util.List;

public class Customer {
	
	private Long userId;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private boolean enabled = true;
	
	private PrimaryAccount primaryAccount;
	
	private SavingAcount sabingsAccount;
	
	private List<Appointment> appointmentList;
	
	private List<Recipient> recipientList;
}
