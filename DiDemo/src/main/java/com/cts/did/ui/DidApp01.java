package com.cts.did.ui;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceSimpleimpl;

public class DidApp01 {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		
		GreetService gs=(GreetService)context.getBean("g1");
		System.out.println(gs.greet("Bindu"));
		GreetService gs2=(GreetService)context.getBean("g2");
		System.out.println(gs2.greet("hi"));
	}

}
