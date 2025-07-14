package testingSystem_Assignment_1;

import java.time.LocalDate;

public class GroupAccount {
	private Group group;
    private Account account;
    private LocalDate joinDate;
	
    public GroupAccount(Group group, Account account, LocalDate joinDate) {
    	this.group = group;
        this.account = account;
        this.joinDate = joinDate;
    }     
    public String toString() {
    	return "GroupAccount [\n\tGroup=" + group + ",\n\tAccount=" + account + ",\n\tJoinDate=" + joinDate + "]";
    }
}
