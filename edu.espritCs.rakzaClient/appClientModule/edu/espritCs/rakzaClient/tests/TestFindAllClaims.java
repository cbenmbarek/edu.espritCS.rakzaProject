package edu.espritCs.rakzaClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote;
import edu.espritCs.rakzaEJB.entities.Claim;

public class TestFindAllClaims {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ClaimReportingServicesRemote claimReportingServicesRemote = (ClaimReportingServicesRemote) context
					.lookup("edu.espritCs.rakza/edu.espritCs.rakzaEJB/ClaimReportingServices!edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote");

			List<Claim> claims = claimReportingServicesRemote.findAllClaims();
			System.out.println(claims.size());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
