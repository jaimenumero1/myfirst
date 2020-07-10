package Lambdas;

public class Lambdas101 {


    public static void main(String[] args) {
        Lambdas101 lambdas101 = new Lambdas101();
        lambdas101.Greet();
    }

    public void Greet (){
        System.out.println("Hello World!");
    }
    // In Lambdas Why do we need this access modifier if we are going to assign this behavior to
    // a variable then we dont need it lets remove it
    // void Greet
    // Now why do we need this return type, Cant Java jdk figure out what the method does?
    //In Java 8 yes it can

    // so we are now left with Greet(){sout}
    // now let's assign a variable name to this method/behavior
    // and we are left with actionGreet = greet(){}
    // now Lambda also says hey we dont need to names for this variable with a method
    // so let's get rid of this second name and we are left with -->    actionGreet = (){sout}
    // now the next thing is jdk says hey buddy you need to let me know its Lambda so
    // let's add this arrow so I know it's lambda
    // So we are left with actionGreet = () -> {sout}
    // ex...

//    actionGreet = () -> {
//        System.out.println("Hello World");
    }

