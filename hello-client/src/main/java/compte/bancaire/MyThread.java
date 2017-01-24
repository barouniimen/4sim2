package compte.bancaire;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business.IGererCompteRemote;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Context context = new InitialContext();
			IGererCompteRemote compteRemote = (IGererCompteRemote) context
					.lookup("hello/GererCompteBancaire!business.IGererCompteRemote");
			System.out.println("je suis le thread num"+this.getId()+"  somme1= " + compteRemote.crediterCompte(100));
			System.out.println("je suis le thread num"+this.getId()+"  somme2= " + compteRemote.crediterCompte(100));
			System.out.println("je suis le thread num"+this.getId()+"  somme3= " + compteRemote.crediterCompte(100));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
