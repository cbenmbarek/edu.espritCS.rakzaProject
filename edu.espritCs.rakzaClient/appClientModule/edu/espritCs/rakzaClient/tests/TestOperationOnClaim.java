package edu.espritCs.rakzaClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote;

public class TestOperationOnClaim {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			LifeCycleServicesRemote lifeCycleServicesRemote = (LifeCycleServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/LifeCycleServices!edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesRemote");

			boolean result = lifeCycleServicesRemote.operationOnClaim(
					"1CGT002", "done");
			
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
