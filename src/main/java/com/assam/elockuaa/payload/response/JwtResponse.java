package com.assam.elockuaa.payload.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String phone;
	private String email;
	private String firstname;
	private String lastname;
	private List<String> roles;
	
	
	public JwtResponse(){
		
	}
	
	public JwtResponse(String accessToken, Long id, String phone, String email, String firstname, String lastname, List<String> roles) {
		this.setToken(accessToken);
		this.setId(id);
		this.setPhone(phone);
		this.setEmail(email);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setRoles(roles);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
