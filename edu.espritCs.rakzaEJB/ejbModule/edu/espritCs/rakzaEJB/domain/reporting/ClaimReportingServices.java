package edu.espritCs.rakzaEJB.domain.reporting;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.rakzaEJB.entities.Claim;

/**
 * Session Bean implementation class ClaimReportingServices
 */
@Stateless
public class ClaimReportingServices implements ClaimReportingServicesRemote,
		ClaimReportingServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	public ClaimReportingServices() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Claim> findAllClaimsByUserId(int idUser) {
		Query query = entityManager
				.createQuery("select c from Claim c where c.user.idUser=:iduser");
		query.setParameter("iduser", idUser);

		return query.getResultList();
	}

	@Override
	public void displayClaimByUserId(int idUser) {
		List<Claim> claims = findAllClaimsByUserId(idUser);

		for (Claim c : claims) {

			System.out.println(c.getDescriptionClaim());

		}
	}

	@Override
	public Claim findClaimByRef(String refClaim) {
		return entityManager.find(Claim.class, refClaim);
	}

	@Override
	public List<Claim> findAllClaims() {
		return entityManager.createQuery("select c from Claim c")
				.getResultList();
	}

}
