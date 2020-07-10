package sessions.classes_objects.employee;

//Every class in Java extend Object class implicitly.
// things that take play behind the scenes
public class SDET extends Employee {
//     public SDET(){
//         super();
//     }
    private String programmingLanguage;
    public SDET(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    //Override is an info that toString is also defined in the parent class wihch is
    //Object class in this case.
    @Override
    public String toString() {
        return getId() + " " + getName() + " " + programmingLanguage;
    }
    //when a class extends another, now it has to abide to certain rules.
    //specifically in using the same method names in super and sub classes
    //when a subclass wants to use the same method name with same params
    //this process is called method overriding.
//    public int celebrate(){
//        System.out.println(getId() + " Yaay");
//        return 2;
//    }
    //Method overriding -> is a specific implementation of a method for the subclass.
    //which basically means I dont want SDET to celebrate like all employees do,
    //I want to celebrate my own way.
    //keeping name there, but changing the logic.
    @Override
    protected void celebrate() {
        System.out.println(getName() + " I am a Java Geek");
    }
    public void print2(){
        super.celebrate();
    }
    //Override -> present
    //Overridden -> present perfect
    //Overloading
    private void print(){
    }
    public int print(String str) {
        return 1;
    }
}
