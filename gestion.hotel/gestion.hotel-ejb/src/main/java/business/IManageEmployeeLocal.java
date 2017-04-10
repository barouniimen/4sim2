package business;

import javax.ejb.Local;
import javax.ejb.Remote;

import persistence.Employee;
@Local
public interface IManageEmployeeLocal {
	Employee authentification(String login, String pwd);
}
