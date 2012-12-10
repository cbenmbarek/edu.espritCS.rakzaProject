package edu.espritCs.rakzaWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.rakzaEJB.domain.management.ManagementServicesLocal;
import edu.espritCs.rakzaEJB.entities.User;

@ManagedBean
@SessionScoped
public class CheckinCtr {
	private User user = new User();
	private String myLogin;
	private String myPwd;
	@EJB
	private ManagementServicesLocal managementServicesLocal;

	public String doCheckin() {
		return managementServicesLocal.checkin(myLogin, myPwd);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMyLogin() {
		return myLogin;
	}

	public void setMyLogin(String myLogin) {
		this.myLogin = myLogin;
	}

	public String getMyPwd() {
		return myPwd;
	}

	public void setMyPwd(String myPwd) {
		this.myPwd = myPwd;
	}

}
