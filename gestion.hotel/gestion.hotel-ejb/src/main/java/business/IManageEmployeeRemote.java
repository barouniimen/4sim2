package business;

import javax.ejb.Remote;

import persistence.Employee;
@Remote
public interface IManageEmployeeRemote {
	Employee authentification(String login, String pwd);
}
