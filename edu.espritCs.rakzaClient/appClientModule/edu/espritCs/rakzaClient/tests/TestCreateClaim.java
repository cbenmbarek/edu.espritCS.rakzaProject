package edu.espritCs.rakzaClient.tests;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote;
import edu.espritCs.rakzaEJB.entities.Claim;

public class TestCreateClaim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			LifeCycleServicesRemote lifeCycleServicesRemote = (LifeCycleServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/LifeCycleServices!edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote");

			Claim claim = new Claim();
			claim.setDescriptionClaim("7ofra 9oddem Dar Jarti");
			claim.setPostingDate(new Date());
			claim.setRefClaim("1CGT003");

			lifeCycleServicesRemote.createClaim(claim);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
