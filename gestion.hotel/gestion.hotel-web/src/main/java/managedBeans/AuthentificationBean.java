package managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.NoResultException;

import business.IManageClientLocal;
import business.IManageEmployeeLocal;
import persistence.Administrateur;
import persistence.Client;
import persistence.Employee;

@ManagedBean
@SessionScoped
public class AuthentificationBean {

	private String login;
	private String password;
	private Employee employeAuthentifie;
	private Client clientAuthentifie;

	@EJB
	IManageEmployeeLocal employeeLocal;
	@EJB
	IManageClientLocal clientLocal;

	public String authentifier() {
		if (employeeLocal.authentification(login, password) instanceof Administrateur) {
			return "/admin/home";
		} else if (clientLocal.authentifierClient(login, password) instanceof Client) {
			return "/client/home";
		} else
			return "/login";

	}

	public String logOut() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployeAuthentifie() {
		return employeAuthentifie;
	}

	public void setEmployeAuthentifie(Employee employeAuthentifie) {
		this.employeAuthentifie = employeAuthentifie;
	}

	public Client getClientAuthentifie() {
		return clientAuthentifie;
	}

	public void setClientAuthentifie(Client clientAuthentifie) {
		this.clientAuthentifie = clientAuthentifie;
	}

}
