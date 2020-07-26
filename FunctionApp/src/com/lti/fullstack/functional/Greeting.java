package com.lti.fullstack.functional;

@FunctionalInterface  // compile time
public interface Greeting {
	void sendGreeting(String message);
	default void fun() {
		
	}
}