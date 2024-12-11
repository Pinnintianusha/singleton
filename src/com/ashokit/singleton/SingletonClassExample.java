package com.ashokit.singleton;

public class SingletonClassExample {
	static SingletonClassExample  s=new SingletonClassExample ();
	private SingletonClassExample(){
		
	}
	
	static SingletonClassExample  getInstance(){
		if(s==null) {
			s=new SingletonClassExample();
		}
		return s;
		
	}
	
void m1() {
	System.out.println("m1.instance");
}
}
