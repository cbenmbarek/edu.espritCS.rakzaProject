package edu.espritCs.rakzaEJB.domain.claimLifeCycle;



import javax.ejb.Remote;

import edu.espritCs.rakzaEJB.entities.Claim;
import edu.espritCs.rakzaEJB.entities.User;

@Remote
public interface LifeCycleServicesRemote {

	
	void createClaimByUser(Claim claim,User user);
	Boolean operationOnClaim(String refClaim,String newStatus);
	void createClaim(Claim claim);
	
}
