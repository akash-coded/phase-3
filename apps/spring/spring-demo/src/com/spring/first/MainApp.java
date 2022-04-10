package com.spring.first;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.first.beans.basicinjection.Bar;
import com.spring.first.beans.basicinjection.Foo;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		context.start();
		
		Foo f = context.getBean("foo", Foo.class);
		System.out.println(f);
		System.out.println();
		
		Bar b = context.getBean("bar", Bar.class);
		System.out.println(b);
		System.out.println();
		
		context.stop();
		
		context.close();
	}

}
