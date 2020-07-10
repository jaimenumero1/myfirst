package sessions.classes_objects;

public class StaticInJava86 {

    // What is static in java?
    //optional specifier
    // static means property(variable, method, class) that doesn't belong to an object rather it belongs to a class.

    //variables, methods and class can be declared as static.
    // when the variable is declared as static it means that is an information that is that is not tied to a specific object, ra
    //ther it is a piece of common information for all objects that were created from the class.
    //or a piece of info that we don't want to tie to objects, rather some internal info that can be used for all objects equally.

    //Usage
    // static references can not be used in both static and no-static methods
    //instance variables can only be used
    // hav an ability to count how many instances (objects, have been created from one class?

    static int a = 0;
    int b = 0;

    public void print(){
        System.out.println(a);

    }
    public static void print2(){
        System.out.println();
    }

}
