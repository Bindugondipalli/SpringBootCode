package com.cts.did.service;

public class GreetserviceEnhancedimpl implements GreetService {
	
private String greeting;



public String getGreeting() {
	return greeting;
}



public void setGreeting(String greeting) {
	this.greeting = greeting;
}



public String greet(String userName) {
	// TODO Auto-generated method stub
	return "greeting"+userName;
}




}