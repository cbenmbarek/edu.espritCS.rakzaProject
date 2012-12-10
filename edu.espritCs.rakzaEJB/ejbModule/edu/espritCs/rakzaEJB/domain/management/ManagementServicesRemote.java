package edu.espritCs.rakzaEJB.domain.management;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.rakzaEJB.entities.User;

@Remote
public interface ManagementServicesRemote {

	public void createUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserbyId(int id);

	public List<User> getAllUserbyId();

	public String checkin(String login, String password);

}
