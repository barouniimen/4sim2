package hello;

import javax.ejb.Remote;

@Remote
public interface IHelloRemote {

	public void sayHello();
}
