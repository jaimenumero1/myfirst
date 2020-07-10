package sessions.abstraction.animal;
//Now this class is an abstract class.
//Abstract classes can have both implimented methods
//and abstract methods.
//We cannot create an object from abstract classes
//so Animal s = new Animal();
public abstract class Animal {



    //public abstract void eat(){
    // abstract methods can not have a body}

    public abstract void eat();

    public int getAge(){
        return 2;
    }


}
