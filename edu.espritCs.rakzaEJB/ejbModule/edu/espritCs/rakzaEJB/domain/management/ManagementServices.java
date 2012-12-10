package edu.espritCs.rakzaEJB.domain.management;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.rakzaEJB.entities.User;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
@LocalBean
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagementServices() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void createUser(User user) {

		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {

		entityManager.merge(user);
	}

	@Override
	public void deleteUser(User user) {

		entityManager.remove(user);
	}

	@Override
	public User getUserbyId(int id) {

		// entityManager.find(arg0, arg1)
		return null;
	}

	@Override
	public List<User> getAllUserbyId() {

		return null;
	}

	@Override
	public String checkin(String login, String password) {
		String result = "";
		String jpql = "select u from User u where u.login=:param1 and u.pwd=:param2";

		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", password);
		try {
			Object object = query.getSingleResult();
			result = "OK";
		} catch (Exception e) {
			result = "KO";
		}

		return result;
	}

}
