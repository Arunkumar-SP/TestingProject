package com.lti.fullstack.functional;

public class EmailGreeting implements Greeting {

	@Override
	public void sendGreeting(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email : " + message);
	}

}