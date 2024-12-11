package com.ashokit.singleton;

public class Test {
	public static void main(String[] args) {
		
	
	
	SingletonClassExample s=SingletonClassExample.getInstance();
	System.out.println(s.hashCode());
	s.getInstance();
	
	SingletonClassExample s1= SingletonClassExample.getInstance();
	System.out.println(s1.hashCode());
	s.getInstance();
//	
//	SingletonClassExample s2=new SingletonClassExample();
//	System.out.println(s2.hashCode());
//	
	

}
}