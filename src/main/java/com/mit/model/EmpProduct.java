package com.mit.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Siddik
 *
 */

@Entity
@Table(name = "EmpProduct")
public class EmpProduct {
	
	private int eid;
	private String eed;
	private String eadr;
	private String ecode;
	
	
	public EmpProduct() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEed() {
		return eed;
	}
	public void setEed(String eed) {
		this.eed = eed;
	}
	public String getEadr() {
		return eadr;
	}
	public void setEadr(String eadr) {
		this.eadr = eadr;
	}
	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	

	@Override
	public String toString() {
		return "EmpProduct [eid=" + eid + ", eed=" + eed + ", eadr=" + eadr + ", ecode=" + ecode + "]";
	}

	
}
