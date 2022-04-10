package com.spring.first.beans.basicinjection;

public class Bar {
	private String name;
	private int age;
	private Foo foo;
	
	public Bar() {
		super();
	}

	public Bar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void processFooName() {
		System.out.println("Name in injected Foo is: " + foo.getName());
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", age=" + age + ", foo=" + foo + "]";
	}
}
