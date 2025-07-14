package testingSystem_Assignment_1;

public class Position {
    private int positionID;     
    private PositionName positionName; // Tên chức vụ (Dev, Test, Scrum Master, PM)

    public Position(int positionID, PositionName positionName) {
    	this.positionID = positionID;
        this.positionName = positionName;
    }
    public String toString() {
        return "Position [ID=" + positionID + ", Name=" + positionName + "]";
    }
}

