package net.mofed.reportracking.app.model;

public enum UserRole {
	ADMIN("ADMIN"),
    USER("USER"),
	AUDIT("AUDIT"),
	INSPECTION("INSPECTION"),
	PROPERTY("PROPERTY"),
    BUDGET("BUDGET"),
    ACCOUNT("ACCOUNT"),
	CASH("CASH");
     
    String userRole;

	private UserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	
	
    
    
}
