package sessions.abstraction.abstract_extend_abstract;
//first non abstract class that extends an abstract class
//is called concrete class
public class Apple extends TreeFruit {


    public static void main(String[] args) {

        Fruit_Highest_Parent alsoApple = new Apple();

        // alsoApple.fallFromTree();  ===>>> does not work because of security created in abstract and interface classes

        //alsoApple does not have access to the method fallFromTree because when declaring this object
        // We used the reference of the parent, so now this obj only has access to the methods inherited from abstract
        //class, this inherited methods body is made in child class but the method was inherited from abstract class as
        // a abstract method
        Apple apple = new Apple();
        String str = apple.fallFromTRee();

        System.out.println(str);
        System.out.println();

        System.out.println("alsoApple however does have access to inherited method");
        System.out.println("So lets print out amount of Sugar " + alsoApple.calculateSugarPerOunce());


    }


    public String fallFromTRee(){
        String str = "Boom!";

        return str;
    }

    public  boolean isSingleSeeded(){
        return false;
    }
    public double calculateSugarPerOunce(){
        return 22;
    }
}

// not regular but Concrete class can have one abstract class?
// one abstract class can have.
