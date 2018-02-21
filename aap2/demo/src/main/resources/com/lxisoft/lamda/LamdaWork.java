package com.lxisoft.lamda;

public class LamdaWork {

	
	public static void main(String[] args) {
		 GreetingServices greet=new GreetingServicesimpl();
		 greet.sayHello("hello.... lamba");

	}


}
interface GreetingServices{
	
	
	public void sayHello(String message);
}
class GreetingServicesimpl implements GreetingServices{
	
	public void sayHello(String message){
		System.out.println(message);
	}
}