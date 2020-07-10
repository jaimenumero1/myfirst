package sessions.classes_objects.student;
//for payment process.
public class Student {
    private String name;
    private int rollNo;
    //grades is a property specific to high performing students
    //private List<String> grades;
    //default constructor exists in a class when there are no other constructors declared
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    //modify student such that when I create an object providing name only, my object's rollNo becomes 1 + the previous
    //students rollNo.
    //Hint: make sure to start the rollNo for all students from 0;
    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int solveMultiplication(int num1, int num2) {
        return num1 * num2;
    }
}
