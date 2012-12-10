package edu.espritCs.rakzaWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.espritCs.rakzaEJB.domain.claimLifeCycle.LifeCycleServicesLocal;
import edu.espritCs.rakzaEJB.domain.reporting.ClaimReportingServicesLocal;
import edu.espritCs.rakzaEJB.entities.Claim;

@ManagedBean
@SessionScoped
public class ClaimReportingCtr {
	public Claim claim = new Claim();
	private List<Claim> claims = new ArrayList<Claim>();
	private DataModel<Claim> dataModel = new ListDataModel<Claim>();

	@EJB
	private ClaimReportingServicesLocal claimReportingServicesLocal;
	@EJB
	private LifeCycleServicesLocal lifeCycleServicesLocal;

	public String doDeleteClaimByRef() {
		Claim claimTMP = dataModel.getRowData();
		lifeCycleServicesLocal.deleteClaimByRef(claimTMP.getRefClaim());
		return "";
	}

	public List<Claim> getClaims() {
		claims = claimReportingServicesLocal.findAllClaims();
		return claims;
	}

	public String doUpdateClaim() {
		//claim = dataModel.getRowData(); non sinon claim=null car dataModel.getRowData() est vide ici
		lifeCycleServicesLocal.updateClaim(claim);
		return "";
	}
	
	public String doGoToUpdatePage(){
		claim=dataModel.getRowData();
		return "update"; 
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	public DataModel<Claim> getDataModel() {
		dataModel.setWrappedData(claimReportingServicesLocal.findAllClaims());
		return dataModel;
	}

	public void setDataModel(DataModel<Claim> dataModel) {
		this.dataModel = dataModel;
	}

	public Claim getClaim() {
		//claim = dataModel.getRowData();  non sinon claim=null car dataModel.getRowData() est vide ici
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

}
