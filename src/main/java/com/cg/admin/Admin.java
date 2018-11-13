package com.cg.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Admin {
	
	
	
	@Size(min=2,max=20, message="Username must be greater than one")
	String username;
	@Size(min=2,max=20, message="Password must be greater than one")
	String password;
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
	
	
	
	
}
