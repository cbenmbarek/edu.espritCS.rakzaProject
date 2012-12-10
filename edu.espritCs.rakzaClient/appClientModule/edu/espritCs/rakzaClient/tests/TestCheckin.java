package edu.espritCs.rakzaClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.espritCs.rakzaEJB.domain.management.ManagementServicesRemote;

public class TestCheckin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote) context
					.lookup("edu.espritCs.rakza/edu.espritCs.rakzaEJB/ManagementServices!edu.espritCs.rakzaEJB.domain.management.ManagementServicesRemote");
		
		System.out.println(managementServicesRemote.checkin("a","a"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
