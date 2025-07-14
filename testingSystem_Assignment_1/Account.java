package testingSystem_Assignment_1;

import java.time.LocalDate;

public class Account {
	private int accountID;
    private String email;
    private String username;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;
    
    public Account(int accountID, String email, String username, String fullName, 
            Department department, Position position, LocalDate createDate) {
    	this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
    public String toString() {
    	return "Account [\n\tID=" + accountID +
    			", \n\tUserName=" + username + 
    			", \n\tFullName=" + fullName +
    			", \n\tEmail=" + email +
    			", \n\tDepartment=" + department +
    			", \n\tPosition=" + position +
    			", \n\tCreateDate=" + createDate + "]";
    	
    }
}
