package Day1.Task4;
class Subject {
    private String subjectName;
    private double marks;
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
    public double getGradePoint(){
        return this.marks/10;
    }
}
public class CGPACalculator {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[6];
        subjects[0] = new Subject("DataStructures",90);
        subjects[1] = new Subject("Python",80);
        subjects[2] = new Subject("DBMA",60);
        subjects[3] = new Subject("Java",75);
        subjects[4] = new Subject("Computer Networks",63);
        subjects[5] = new Subject("Machine Learning",67);
        double cgpa;
        double sumOfGradePoints = 0;
        for(Subject subject : subjects){
            sumOfGradePoints += subject.getGradePoint();
        }
        System.out.println(sumOfGradePoints / 6);

    }
}
