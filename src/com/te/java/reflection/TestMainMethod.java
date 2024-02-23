package com.te.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMainMethod {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Test test = new Test("Shyam", "20");
		
		Field[] field = test.getClass().getDeclaredFields();
		for (Field field2 : field) {
			System.out.println(field2.getName());
			if(field2.getName().equals("name")) {
			/*
			 * here my name field is private so i want to change the name of 
			 * using java reflection we can easily set the name field if it is private also 
			 */
			
			field2.setAccessible(true);
			/*
			 * field2.set(test, "Somnath");
			 * if i use this line only i will
			 * get IllegalAccessException exception
			 * 
			 * for this i make the field to accessible
			 * 
			 */
			field2.set(test, "Somnath");
			}
		}
		
//		test.setName("Joo");//this is not possible bcz our name field is final
		
		System.out.println(test.getName()); //Somnath
		
		Method[] declaredMethods = test.getClass().getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
			
			if(method.getName().equals("thisIsPrivate")) {
				method.setAccessible(true);
				method.invoke(test);
			}
			
		}
	/*
	 * 	test.thisIsPrivate();
	 * if i going to print this by using the object if the class 
	 * it will give this exception 
	 * The method thisIsPrivate() from the type Test is not visible
	 * 
	 * to prevent this im using reflection api
	 */
		
		
		
	}

}
