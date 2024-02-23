package com.te.java.reflection;

public class Test {
	
	private final String name;
	private String age;
	
	public Test(String name ,String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	private void thisIsPrivate() {
		System.out.println("Hlw Im a Private Method");
	}
	
	public void cat() {
		System.out.println("Meow");
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}

}
