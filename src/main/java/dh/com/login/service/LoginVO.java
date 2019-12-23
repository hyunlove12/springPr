package dh.com.login.service;

import java.io.Serializable;

public class LoginVO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4839056361193990019L;
	
	private String deptId = "";
	
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
}
