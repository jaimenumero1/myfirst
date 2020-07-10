package sessions.classes_objects.bookstore;



public class Bookstore {


    public static void main(String[] args) {



        Author isaacson = new Author("Walter Isaacson", "Writes great bios about greats of the past like Franklin and Einstein", 70, ":)");

        //if you have classes defined in params -> in order to use the method or constructor
        //we need to create an object of that class and pass the reference to that object.


        Book bioOfFranklin = new Book("Creator of American Character", 1000, true, false, isaacson);

        System.out.println(isaacson.getName());
        System.out.println(bioOfFranklin.getTitle());
        System.out.println(bioOfFranklin.getAuthor().getName());

        //show me books by Walter Isaacson

        if (bioOfFranklin.getAuthor().getName().equalsIgnoreCase("Walter Isaacson")){
            System.out.println(bioOfFranklin.getTitle());
        }


        //HW

        //Write a method(happyBirthDay) in Author class it should increment the author's age.

        //Implement a logic where author has the number of books.
        //num of books should be defined by the usage of an author in Books info.
        //so when a book is created and author is used, the authors numOfBooks should be incremented.

        //Add a feature for Bookstore to give price for the books

        //create a static method that will take
        //Book authors:
        //if Issaccson -> $10
        //if

        //Books:
        //Creator of American Character -> $5
        //Enstein Bio -> $3

    }
}
