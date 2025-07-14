package testingSystem_Assignment_1;

import java.time.LocalDate;

public class Program{
	public static void main(String[] args) {
		// ===== Table 1: Department =====
        Department dep1 = new Department(1, "Sale");
        Department dep2 = new Department(2, "Marketing");
        Department dep3 = new Department(3, "IT");

        // ===== Table 2: Position =====
        Position pos1 = new Position(1, PositionName.DEV);
        Position pos2 = new Position(2, PositionName.TEST);
        Position pos3 = new Position(3, PositionName.PM);

        // ===== Table 3: Account =====
        Account acc1 = new Account(1, "a@gmail.com", "userA", "Nguyen Van A", dep1, pos1, LocalDate.now());
        Account acc2 = new Account(2, "b@gmail.com", "userB", "Tran Thi B", dep2, pos2, LocalDate.now());
        Account acc3 = new Account(3, "c@gmail.com", "userC", "Le Van C", dep3, pos3, LocalDate.now());

        // ===== Table 4: Group =====
        Group group1 = new Group(1, "Group 1", acc1, LocalDate.now());
        Group group2 = new Group(2, "Group 2", acc2, LocalDate.now());
        Group group3 = new Group(3, "Group 3", acc3, LocalDate.now());

        // ===== Table 5: GroupAccount =====
        GroupAccount ga1 = new GroupAccount(group1, acc1, LocalDate.now());
        GroupAccount ga2 = new GroupAccount(group2, acc2, LocalDate.now());
        GroupAccount ga3 = new GroupAccount(group3, acc3, LocalDate.now());

        // ===== Table 6: TypeQuestion =====
        TypeQuestion tq1 = new TypeQuestion(1, TypeName.ESSAY);
        TypeQuestion tq2 = new TypeQuestion(2, TypeName.MULTIPLE_CHOICE);
        TypeQuestion tq3 = new TypeQuestion(3, TypeName.ESSAY);

        // ===== Table 7: CategoryQuestion =====
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        // ===== Table 8: Question =====
        Question q1 = new Question(1, "What is Java?", cq1, tq1, acc1, LocalDate.now());
        Question q2 = new Question(2, "Explain SQL JOIN", cq3, tq2, acc2, LocalDate.now());
        Question q3 = new Question(3, "What is OOP?", cq1, tq1, acc3, LocalDate.now());

        // ===== Table 9: Answer =====
        Answer ans1 = new Answer(1, "Java is a programming language", q1, true);
        Answer ans2 = new Answer(2, "SQL JOIN combines tables", q2, true);
        Answer ans3 = new Answer(3, "OOP is Object-Oriented Programming", q3, true);

        // ===== Table 10: Exam =====
        Exam exam1 = new Exam(1, "E001", "Java Basics", cq1, 60, acc1, LocalDate.now());
        Exam exam2 = new Exam(2, "E002", "SQL Fundamentals", cq3, 45, acc2, LocalDate.now());
        Exam exam3 = new Exam(3, "E003", ".NET Overview", cq2, 50, acc3, LocalDate.now());

        // ===== Table 11: ExamQuestion =====
        ExamQuestion eq1 = new ExamQuestion(exam1, q1);
        ExamQuestion eq2 = new ExamQuestion(exam2, q2);
        ExamQuestion eq3 = new ExamQuestion(exam3, q3);

        // ===== In ra 1 giá trị mẫu của mỗi bảng =====
        System.out.println("Department: " + dep1);
        System.out.println("Position: " + pos1);
        System.out.println("Account: " + acc1);
        System.out.println("Group: " + group1);
        System.out.println("GroupAccount JoinDate: " + ga1);
        System.out.println("TypeQuestion: " + tq1);
        System.out.println("CategoryQuestion: " + cq1);
        System.out.println("Question: " + q1);
        System.out.println("Answer: " + ans1);
        System.out.println("Exam: " + exam1);
        System.out.println("ExamQuestion ExamID: " + eq1);
    }
}