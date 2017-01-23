package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import hello.IHelloRemote;

public class TestHello {
	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			IHelloRemote helloInterface= (IHelloRemote) context.lookup("hello/Hello!hello.IHelloRemote");
			helloInterface.sayHello();
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
