package sessions.arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop
        //use plural names for arrays
        String[] names = {"Elon", "Melanie", "Steve"};
        for (String name : names) {
            System.out.println(name);
        }
        int[] nums = {11, 20, 12};
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            sum+=num;
        }
        //Collections
        System.out.println(sum);
        //find all vowels in a String
//        String str = "Hello";
//        for (char c : str){
//
//        }
        //print all number between 0 and 100
        //for (int num : )
        //for each loop will be used only when u have collections.
        //regular for loop will solve any problem for each solves
        //but vice versa
        String[] products = {"Iphone phone", "Samsung phone", "Tea pot"};
        for (String product : products) {
            if (product.contains("phone")) { //product => products[i]
                System.out.println(product);
            }
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i].contains("phone")){
                System.out.println(products[i]);
            }
            }
        }
    }
