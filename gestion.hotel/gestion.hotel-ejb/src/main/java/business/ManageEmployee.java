package business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import persistence.Employee;

@Stateless
public class ManageEmployee implements IManageEmployeeRemote, IManageEmployeeLocal {

	@PersistenceContext
	EntityManager em;

	@Override
	public Employee authentification(String login, String pwd) {
		TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.login=:login AND e.password=:pwd",
				Employee.class);
		query.setParameter("login", login);
		query.setParameter("pwd", pwd);

		return query.getSingleResult();
	}

}
