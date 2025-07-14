package testingSystem_Assignment_1;

public class Department {
    private int departmentID;
    private String departmentName;
    
    public Department(int departmentID, String departmentName) {
    	this.departmentID = departmentID;
        this.departmentName = departmentName;
    }
    public String toString() {
    	return "Department [ID=" + departmentID +", Name=" + departmentName + "]";
    }
}
