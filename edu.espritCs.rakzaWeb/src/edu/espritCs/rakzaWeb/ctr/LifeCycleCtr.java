package edu.espritCs.rakzaWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesLocal;
import edu.espritCs.rakzaEJB.entities.Claim;

@ManagedBean
@SessionScoped
public class LifeCycleCtr {
	//model
	private Claim claim=new Claim();

	//injection of the proxy
	@EJB
	private LifeCycleServicesLocal lifeCycleServicesLocal;
	
	//methods
	public String doCreateClaim(){
		lifeCycleServicesLocal.createClaim(claim);
		return"list";
	}
	
	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

}
