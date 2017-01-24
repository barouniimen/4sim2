package business;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import Entity.CompteBancaire;
@Stateful
public class GererCompteBancaire implements IGererCompteRemote {

	private CompteBancaire compte;

	public GererCompteBancaire() {
		compte = new CompteBancaire();
		compte.setSolde(0);
		System.out.println("je suis créé!!!!!!!!!");
	}

	@Override
	public int crediterCompte(int somme) {
		compte.setSolde(compte.getSolde() + somme);
		return compte.getSolde();
	}

	@Override
	public int debiterCompte(int somme) {
		compte.setSolde(compte.getSolde() - somme);
		return compte.getSolde();
	}

	public CompteBancaire getCompte() {
		return compte;
	}

	public void setCompte(CompteBancaire compte) {
		this.compte = compte;
	}

}
