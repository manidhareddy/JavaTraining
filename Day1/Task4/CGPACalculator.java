package Day1.Task4;

import java.util.Scanner;
class Subject {
    private String subjectName;
    private double marks;
    public Subject(){}
    public Subject(String name,double marks){
        this.subjectName = name;
        this.marks = marks;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public static double getCGPA(Subject[] subjects) {
        double sumOfGradeMarks = 0;
        for (Subject subject : subjects) {
            sumOfGradeMarks += subject.getMarks() / 10;
        }
        return sumOfGradeMarks / 6;
    }
}
public class CGPACalculator {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[6];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<6;i++){
            subjects[i] = new Subject();
            subjects[i].setSubjectName(sc.next());
            subjects[i].setMarks(sc.nextDouble());
        }
        System.out.println("CGPA: "+Subject.getCGPA(subjects));
    }
}
