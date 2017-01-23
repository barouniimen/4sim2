package hello;

import javax.ejb.Stateless;

@Stateless
public class Hello implements IHelloRemote{

	
	public void sayHello(){
		System.out.println("hello 4SIM2!");
	}
}
