package business;

import javax.ejb.Remote;

@Remote
public interface IHelloRemote {

	public void sayHello();
	public int returnHashcode();
}
