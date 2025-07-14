package testingSystem_Assignment_1;

public class CategoryQuestion {
	 private int categoryID;
	 private String categoryName;
	    
	 public CategoryQuestion(int categoryID, String categoryName) {
		 this.categoryID = categoryID;
	     this.categoryName = categoryName;
	 }
	 public String toString() {
		 return "CategoryQuestion [\n\tID=" + categoryID +
				 ",\n\tName=" + categoryName + "]";
	 }
}
