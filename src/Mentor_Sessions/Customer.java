package Mentor_Sessions;


public class Customer {
    String name;
    String last_name;
    int age;
    public Customer(String name, String last_name, int age){
        this.age = age;
        this.last_name = last_name;
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name + " : " + this.last_name;
    }
    @Override
    public int hashCode(){
        return 0;
    };
}