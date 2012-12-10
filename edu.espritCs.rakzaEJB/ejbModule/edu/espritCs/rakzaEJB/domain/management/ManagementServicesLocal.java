package edu.espritCs.rakzaEJB.domain.management;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.rakzaEJB.entities.User;

@Local
public interface ManagementServicesLocal {
	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserbyId(int id);

	public List<User> getAllUserbyId();

	public String checkin(String login, String password);
}
