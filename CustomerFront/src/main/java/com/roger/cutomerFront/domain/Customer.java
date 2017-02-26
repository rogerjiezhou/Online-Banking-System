package com.roger.cutomerFront.domain;

import java.util.List;

public class Customer {
	
	private Long userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private boolean enabled = true;
	
	private CheckingAccount primaryAccount;
	
	private SavingsAccount sabingsAccount;
	
	private List<Appointment> appointmentList;
	
	private List<Recipient> recipientList;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public CheckingAccount getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(CheckingAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	public SavingsAccount getSabingsAccount() {
		return sabingsAccount;
	}

	public void setSabingsAccount(SavingsAccount sabingsAccount) {
		this.sabingsAccount = sabingsAccount;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public List<Recipient> getRecipientList() {
		return recipientList;
	}

	public void setRecipientList(List<Recipient> recipientList) {
		this.recipientList = recipientList;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enabled="
				+ enabled + "]";
	}
	
	
}
