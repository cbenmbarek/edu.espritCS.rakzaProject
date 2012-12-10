package edu.espritCs.rakzaEJB.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity
public class Claim implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String refClaim;
	private String descriptionClaim;
	private Date postingDate;
	private String status;
	private User user;
	
	
	@Id
	public String getRefClaim() {
		return refClaim;
	}
public void setRefClaim(String refClaim) {
		this.refClaim = refClaim;
	}
	public String getDescriptionClaim() {
		return descriptionClaim;
	}
	public void setDescriptionClaim(String descriptionClaim) {
		this.descriptionClaim = descriptionClaim;
	}
	public Date getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
