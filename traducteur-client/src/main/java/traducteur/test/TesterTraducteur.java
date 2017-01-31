package traducteur.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business.layer.ITraducteurRemote;

public class TesterTraducteur {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ITraducteurRemote traducteurRemote = (ITraducteurRemote) context.lookup("traducteur/Traducteur!business.layer.ITraducteurRemote");
		traducteurRemote.ajouterMot("tester", "test");
		System.out.println(traducteurRemote.traduire("tester"));
	}
}
