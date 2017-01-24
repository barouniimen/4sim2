package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business.IHelloRemote;

public class TestHello {
	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			IHelloRemote helloInterface= (IHelloRemote) context.lookup("hello/Hello!business.IHelloRemote");
			helloInterface.sayHello();
			System.out.println("proxy: "+helloInterface.hashCode());
			System.out.println("session bean: "+helloInterface.returnHashcode());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
