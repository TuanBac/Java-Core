package testingSystem_Assignment_1;

import java.time.LocalDate;

public class Exam {
	private int examID;
    private String code;
    private String title;
    private CategoryQuestion category;
    private int duration;
    private Account creator;
    private LocalDate createDate;

    public Exam(int examID, String code, String title, CategoryQuestion category, int duration, Account creator, LocalDate createDate) {
    	this.examID = examID;
        this.code = code;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }
    public String toString() {
    	return "Exam [\n\tID=" + examID +", \n\tCode=" + code +", \n\tTitle=" + title +", \n\tCategory=" + category +
    			", \n\tDuration=" + duration +", \n\tCreator=" + creator +", \n\tCreateDate=" + createDate + "]";
    }
}
