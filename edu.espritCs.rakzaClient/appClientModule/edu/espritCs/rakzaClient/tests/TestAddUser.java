package edu.espritCs.rakzaClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.management.ManagementServicesRemote;
import edu.espritCs.rakzaEJB.entities.User;

public class TestAddUser {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();

			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/ManagementServices!edu.espritCs.rakzaEJB.domain.management.ManagementServicesRemote");

			User user = new User();
			user.setIdUser(12);
			user.setNameUser("foulen");

			managementServicesRemote.createUser(user);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
