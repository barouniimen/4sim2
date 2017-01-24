package business;

import javax.ejb.Remote;

@Remote
public interface IGererCompteRemote {
	int crediterCompte(int somme);

	int debiterCompte(int somme);
}
