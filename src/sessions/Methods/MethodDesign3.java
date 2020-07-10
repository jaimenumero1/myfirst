package sessions.Methods;

public class MethodDesign3 {

    //method must be called to be executed. if not called it is not going to be executed.
    public void printMessage() { //execute everything in the method and come back to where you entered method.
        System.out.println("My Method is Called");}

    public static void main(String[] args) { //main is the starting point of the program

        MethodDesign3 myobject = new MethodDesign3();

        System.out.println("About to run my method");
        myobject.printMessage(); // call to a method.
        System.out.println("Finished executing my method");

        System.out.println("now I am back in the main method");
    }

}


