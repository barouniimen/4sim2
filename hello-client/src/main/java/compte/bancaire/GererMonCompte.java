package compte.bancaire;

import javax.naming.NamingException;

public class GererMonCompte {
	public static void main(String[] args) throws NamingException {
	for (int i = 0; i < 5; i++) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
		
	}
}
