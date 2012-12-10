package edu.espritCs.rakzaClient.tests;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote;
import edu.espritCs.rakzaEJB.entities.Claim;
import edu.espritCs.rakzaEJB.entities.User;

public class TestCreateClaimByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			LifeCycleServicesRemote lifeCycleServicesRemote = (LifeCycleServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/LifeCycleServices!edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote");

			User user = new User();
			user.setIdUser(2);
			user.setNameUser("sala7");

			Claim claim = new Claim();
			claim.setDescriptionClaim("7ofra 9oddem Dar Jarti");
			claim.setPostingDate(new Date());
			claim.setRefClaim("1CGT002");
			claim.setUser(user);

			lifeCycleServicesRemote.createClaimByUser(claim, user);
			
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
