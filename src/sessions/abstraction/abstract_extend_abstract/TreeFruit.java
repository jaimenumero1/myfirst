package sessions.abstraction.abstract_extend_abstract;
// if an abstract class is extending another abstract class
// the sub abstract class doesnt have to implement abstract methods
//from parent abstract class.
//but it has an option to give an implementation
public abstract class TreeFruit extends Fruit_Highest_Parent {

    private boolean isSingleSeeded;

    public abstract boolean isSingleSeeded();
//    public abstract double calculateSugarPerOunce();
//    no need to declare here
    //since it's taking place in the background(implicitly)
}
