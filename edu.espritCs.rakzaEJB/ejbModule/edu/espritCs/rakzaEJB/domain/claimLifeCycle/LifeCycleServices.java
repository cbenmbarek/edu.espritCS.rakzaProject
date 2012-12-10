package edu.espritCs.rakzaEJB.domain.claimLifeCycle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.rakzaEJB.entities.Claim;
import edu.espritCs.rakzaEJB.entities.User;

/**
 * Session Bean implementation class LifeCycleServices
 */
@Stateless
public class LifeCycleServices implements LifeCycleServicesRemote,
		LifeCycleServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	public LifeCycleServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createClaimByUser(Claim claim, User user) {
		claim.setUser(user);
		entityManager.persist(claim);

	}

	@Override
	public Boolean operationOnClaim(String refClaim, String newStatus) {
		Claim claim = entityManager.find(Claim.class, refClaim);
		claim.setStatus(newStatus);
		try {
			entityManager.merge(claim);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public void createClaim(Claim claim) {
		entityManager.persist(claim);
		
	}

	@Override
	public void deleteClaimByRef(String refClaim) {
		entityManager.remove(entityManager.find(Claim.class, refClaim));
		
	}

	@Override
	public void updateClaim(Claim claim) {
		entityManager.merge(claim);
		
	}

	

}
