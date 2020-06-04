package com.in28minutes.springboot.studentservices;



public class Contact {
    private String name;
    private String email;
    private String country;
 
    public Contact() {
        super();
    }
 
    public Contact(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getCountry() {
		return country;
	}

	protected void setCountry(String country) {
		this.country = country;
	}
 
    // getters and setters are excluded for brevity
 
}