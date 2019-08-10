package com.nguyenanhtu;

import javax.ejb.Stateless;

@Stateless
public class HelloBean implements Hello {

	public void HelloBean() {
	}
	
	@Override
	public String sayHello() {
		return "Hello Boss Welcome to EJB";
	}
	
}
