package edu.espritCs.rakzaClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote;

public class TestdisplayClaimByUserId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Context context = new InitialContext();
			ClaimReportingServicesRemote claimReportingServicesRemote = (ClaimReportingServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/ClaimReportingServices!edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote");

			claimReportingServicesRemote.displayClaimByUserId(1);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
