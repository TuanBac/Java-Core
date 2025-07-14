package testingSystem_Assignment_1;

import java.time.LocalDate;

public class Group {
	private int groupID;
    private String groupName;
    private Account creator;
    private LocalDate createDate;
	
    public Group(int groupID, String groupName, Account creator, LocalDate createDate) {
    	this.groupID = groupID;
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
    }
    public String toString() {
    	return "Group [\n\tID=" + groupID + ",\n\tName=" + groupName +
    			", \n\tCreator=" + creator + ", \n\tCreateDate=" + createDate + "]";
    }
}
