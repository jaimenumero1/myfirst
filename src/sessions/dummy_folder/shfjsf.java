package sessions.dummy_folder;

public class shfjsf {


    //Use this method to find the index of specific letter or word inside a String
    public static void main(String[] args) {
        String str = "Nursultan Musakunov"; //Elon Musk, Steve Jobs, Bill Gates. Nursultan Musakunov
        //makes easy so we dont have to count
        //plus it works for any names.
        System.out.println(str.indexOf(" "));
        int indexOfSpace = str.indexOf(" ");
        System.out.println(indexOfSpace);
        System.out.println(str.substring(indexOfSpace + 1));

        String address = "4444 irving park ave apt 4s";//""; --> we are not counting the number of spaces.

        int positionOfFirstLetterOfApp = address.indexOf("apt");//if u put empty it will return 0;
        System.out.println(positionOfFirstLetterOfApp);
        String address2 = "HelloWorld";
        System.out.println(address.substring(positionOfFirstLetterOfApp)); //dynamic programming.
        int positionOfFirstLetterOfPark = address.indexOf("park");
        System.out.println(positionOfFirstLetterOfPark);
        System.out.println(address.substring(positionOfFirstLetterOfPark,16));

        //4444 irving park ave apt 4s
        //123 main st apt 3e
        //Lake st apt 23
        System.out.println(address2.length());



                


    }


}


