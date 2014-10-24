package com.myfirst.wsServer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SayHello {

	 private static final String SALUTATION = "Hello";
		
	 @WebMethod
	 public String getGreeting( String name ) {
	  return SALUTATION + " " + name;
	 }
	 
	 @WebMethod
	 public String sayHello() {
		 return "Hello Steve";
	 }
}
