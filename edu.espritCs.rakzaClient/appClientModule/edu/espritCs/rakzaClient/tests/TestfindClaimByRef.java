package edu.espritCs.rakzaClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote;
import edu.espritCs.rakzaEJB.entities.Claim;

public class TestfindClaimByRef {

	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			ClaimReportingServicesRemote claimReportingServicesRemote = (ClaimReportingServicesRemote) context
					.lookup("ejb:edu.espritCs.rakza/edu.espritCs.rakzaEJB/ClaimReportingServices!edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesRemote");
			Claim claim = claimReportingServicesRemote
					.findClaimByRef("1CGT002");
			System.out.println("reference: " + claim.getDescriptionClaim()
					+ " status:" + claim.getStatus() + " userid: "
					+ claim.getUser().getIdUser());

		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
