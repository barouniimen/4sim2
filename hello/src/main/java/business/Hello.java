package business;

import javax.ejb.Stateless;

@Stateless
public class Hello implements IHelloRemote{

	
	public void sayHello(){
		System.out.println("hello 4SIM2!");
	}
	
	

	@Override
	public int returnHashcode() {
		// TODO Auto-generated method stub
		return this.hashCode();
	}
}
