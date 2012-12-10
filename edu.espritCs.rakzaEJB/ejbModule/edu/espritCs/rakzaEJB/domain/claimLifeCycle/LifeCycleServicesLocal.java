package edu.espritCs.rakzaEJB.domain.claimLifeCycle;

import javax.ejb.Local;

import edu.espritCs.rakzaEJB.entities.Claim;
import edu.espritCs.rakzaEJB.entities.User;

@Local
public interface LifeCycleServicesLocal {
	void createClaimByUser(Claim claim, User user);

	Boolean operationOnClaim(String refClaim, String newStatus);

	void createClaim(Claim claim);

	void deleteClaimByRef(String refClaim);

	void updateClaim(Claim claim);

}
