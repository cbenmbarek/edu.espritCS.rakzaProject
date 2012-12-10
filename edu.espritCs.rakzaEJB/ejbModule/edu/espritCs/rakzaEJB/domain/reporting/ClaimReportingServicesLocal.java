package edu.espritCs.rakzaEJB.domain.reporting;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.rakzaEJB.entities.Claim;

@Local
public interface ClaimReportingServicesLocal {
	List<Claim> findAllClaimsByUserId(int idUser);

	void displayClaimByUserId(int idUser);

	Claim findClaimByRef(String refClaim);

	List<Claim> findAllClaims();

}
