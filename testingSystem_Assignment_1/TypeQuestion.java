package testingSystem_Assignment_1;

public class TypeQuestion {
	private int typeID;
    private TypeName typeName;
    
    public TypeQuestion(int typeID, TypeName typeName) {
    	this.typeID = typeID;
        this.typeName = typeName;
    }
    public String toString() {
    	return "TypeQuestion [\n\tID=" + typeID + ",\n\tName=" + typeName + "]";
    }
}
