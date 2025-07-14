package testingSystem_Assignment_1;

public class ExamQuestion {
	private Exam exam;
    private Question question;

    public ExamQuestion(Exam exam, Question question) {
    	this.exam = exam;
        this.question = question;
    }
    public String toString() {
    	return "ExamQuestion [\n\tExam=" + exam +", \n\tQuestion=" + question + "]";
    }
}
