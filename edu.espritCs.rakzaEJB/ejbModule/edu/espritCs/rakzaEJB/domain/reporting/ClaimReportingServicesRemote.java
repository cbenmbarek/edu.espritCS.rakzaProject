package edu.espritCs.rakzaEJB.domain.reporting;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.rakzaEJB.entities.Claim;

@Remote
public interface ClaimReportingServicesRemote {

	List<Claim> findAllClaimsByUserId(int idUser);

	void displayClaimByUserId(int idUser);

	Claim findClaimByRef(String refClaim);

	List<Claim> findAllClaims();

}
