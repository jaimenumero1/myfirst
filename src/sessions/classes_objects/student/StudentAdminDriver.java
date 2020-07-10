package sessions.classes_objects.student;
public class StudentAdminDriver {
    public static void main(String[] args) {
        HighAchiever johnDoe = new HighAchiever("John Doe", 2, 4.0);
        System.out.println(johnDoe.getName());
        System.out.println(johnDoe.getRollNo());
        System.out.println(johnDoe.getGpa());
        System.out.println(johnDoe.solveMultiplication(2,5));
        //Student objects will not have gpa bc, student class doesnt extend anything, so it will only have what it has
        Student student = new Student("Elon", 1);
        System.out.println(student.getRollNo());
        Student student1 = new Student("Steve");
        System.out.println(student1.getRollNo());//2
        Student student2 = new Student("Elen");
        System.out.println(student2.getRollNo());//3
        System.out.println(student.toString());
    }
}
