package hackathon;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class IFridgeSmartApp {
    public static void main(String[] args) throws InterruptedException {

try {
    Calendar calendar = Calendar.getInstance();
    LocalDate today = LocalDate.now();
    Date oneYearFromNow = calendar.getTime();
    Date now = calendar.getTime();

    calendar.add(Calendar.DATE, 15);
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("This is your Smart iFridge");
    System.out.println();
    System.out.println("Today's Date is:\t\t" + now);
    System.out.println("First step");
    System.out.println("Please Log Inn");

//        String userName = JOptionPane.showInputDialog("This is your Smart Refrigerator Please Log Inn ");
//        String passWord = JOptionPane.showInputDialog("Password");
//
//
//        if (passWord != null && userName.equals("Elon Musk") && passWord.equals("hungry")) {
//            JOptionPane.showMessageDialog(null, "Refrigerator Access Granted");
//        } else {
//            JOptionPane.showMessageDialog(null, "Refrigerator Access Denied");
//            Thread.sleep(5800);
//            System.out.println();
//            System.err.println("Refrigerator is Locked, Please Refer to manual to unlock");
//            System.err.println("Or after veryfing Purchase, & serial # you can download at mysmartfridge@wix.com");
//            return;
//        }

    Thread.sleep(3000);

    System.out.println("Now that we know who you are...");
    System.out.println();
    String answer = "";

//        Date todayDate = calendar.getTime();
//        String today = todayDate + "";
    Map<String, String> meats = new HashMap<>();
    meats.put("Wed Jul 08 12:13:42 CDT 2020", "T-bone");
    meats.put("Wed Jul 13 12:13:42 CDT 2020","Eggs");
    Map<String, String> fish = new HashMap<>();
    fish.put("Wed Jul 05 12:13:42 CDT 2020","Sword Fish");
    Map<String, String> fruitAndVeggies = new HashMap<>();
    fruitAndVeggies.put("Wed Jul 22 12:13:42 CDT 2020","Kombucha Drink");
    System.out.println(" Welcome to iFridge the New generation of smart refrigerators!");
    System.out.println("Do you want to add some (Unscannable) product to your iFridge today? (Yes/No)...");
    answer = sc.next();
    sc.nextLine();
    answer.toLowerCase();

    while (!(answer).equals("yes") && !(answer).equals("no")) {
        Thread.sleep(2000);

        System.out.println(" +*****+");
        System.out.println("[| o o |]");
        System.out.println(" |     |" );
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        System.out.println();
        System.out.println("Input was incorect please input a valid input");
        System.out.println("Do you want to add some (Unscannable) product to your iFridge today? (Yes/No)...");
        answer = sc.next();
        answer.toLowerCase();
    }

    if (answer.equalsIgnoreCase("yes")) {
        System.out.println("How many products do you need to store...");
        int numPro = sc.nextInt();
        for (int i = 0; i < numPro; i++) {

            System.out.println("Please, choose a number of following product options:\n< 1 > --- Meat;\n< 2 > --- Fish;" +
                    "\n< 3 > --- Vegetables;\n< 4 > --- Fruit;");
            int product = sc.nextInt();//==1
            switch (product) {
                case 1:
                    System.out.println("Please, choose a number of following meat options:\n" +
                            "< 1 > --- Beef;\n< 2 > --- Lamb;\n< 3 > --- Chicken/Turkey;");
                    int meatNum = sc.nextInt();
                    switch (meatNum) {
                        case 1:
                            Calendar calendar0 = Calendar.getInstance();
                            calendar0.add(calendar0.DATE, 6);
                            Date beef = calendar0.getTime();
                            System.out.println("Your Beef expiration date is " + beef);
                            meats.put(beef + "", "Beef");
                            break;
                        case 2:
                            Calendar calendar1 = Calendar.getInstance();
                            calendar1.add(calendar1.DATE, 7);
                            Date lamb = calendar1.getTime();
                            System.out.println("Your Lamb expiration date is " + lamb);
                            meats.put(lamb + "", "Lamb");
                            break;
                        case 3:
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.add(calendar2.DATE, 5);
                            Date chickAndTur = calendar2.getTime();
                            System.out.println("Your chicken/turkey expiration date is " + chickAndTur);
                            meats.put(chickAndTur + "", "Chicken/Turkey");
                            break;
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }
                    break;
                case 2:
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.add(calendar3.DATE, 3);
                    Date fishes = calendar3.getTime();
                    System.out.println("Your fish expiration date is " + fishes);
                    fish.put(fishes + "", "Fish");
                    break;
                case 3:
                    System.out.println("Please, choose a number of following vegetables options:\n" +
                            "< 1 > --- Tomatoes/Cucumbers;\n< 2 > --- Carrots;\n< 3 > --- Peppers");
                    int vegNum = sc.nextInt();
                    switch (vegNum) {
                        case 1:
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.add(calendar4.DATE, 10);
                            Date tomatoAndCucumb = calendar4.getTime();
                            System.out.println("Your Tomatoes/Cucumbers expiration date is " + tomatoAndCucumb);
                            fruitAndVeggies.put("" + tomatoAndCucumb, "Your Tomatoes/Cucumbers");
                            break;
                        case 2:
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.add(calendar5.DATE, 21);
                            Date carrots = calendar5.getTime();
                            System.out.println("Your Carrots expiration date is " + carrots);
                            fruitAndVeggies.put("" + carrots, "Carrots");
                            break;
                        case 3:
                            Calendar calendar6 = Calendar.getInstance();
                            calendar6.add(calendar6.DATE, 14);
                            Date peppers = calendar6.getTime();
                            System.out.println("Your Peppers expiration date is " + peppers);
                            fruitAndVeggies.put("" + peppers, "Peppers");
                            break;
                        default:
                            System.out.println("Invalid input..");
                    }
                    break;
                case 4:
                    System.out.println("Please, choose a number of following fruit/berries options:\n" +
                            "< 1 > --- Apple/Watermelon;\n< 2 > --- Banana/Peaches/Strawberry\n< 3 > --- Grape/Raspberry/Blueberry;");
                    int fruitNum = sc.nextInt();
                    switch (fruitNum) {
                        case 1:
                            Calendar calendar7 = Calendar.getInstance();
                            calendar7.add(calendar7.DATE, 12);
                            Date appleWater = calendar7.getTime();
                            System.out.println("Your Apples/watermelon expiration date is " + appleWater);
                            fruitAndVeggies.put("" + appleWater, "Apple-Watermelon");
                            break;
                        case 2:
                            sc.nextLine();
                            Calendar calendar8 = Calendar.getInstance();
                            calendar8.add(calendar8.DATE, 7);
                            Date banPeachStraw = calendar8.getTime();
                            System.out.println("Your bannana/Peach/Strawberry expiration date is " + banPeachStraw);
                            String bananaPeaS = "bannana/Peach/Strawberry";
                            fruitAndVeggies.put(banPeachStraw + "", bananaPeaS);
                            break;
                        case 3:
                            Calendar calendar9 = Calendar.getInstance();
                            calendar9.add(calendar9.DATE, 5);
                            Date grapeRaspBlue = calendar9.getTime();
                            System.out.println("Your grape/Raspberries/blueberries expiration date is " + grapeRaspBlue);
                            fruitAndVeggies.put("" + grapeRaspBlue, "Grape/Raspberries/Blueberries");
                            break;
                        default:
                            System.out.println("Invalid input...");
                    }
            }
            Thread.sleep(1000);
        }
        System.out.println();

        Set<String> meatsSet = meats.keySet();
        Iterator<String> iterator = meatsSet.iterator();
        System.out.println("Your Refrigerator Contents are: ");

        while (iterator.hasNext()) {
            String codeKey = iterator.next();
            String values = meats.get(codeKey);
            System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
        }
        Set<String> fishSet = fish.keySet();
        Iterator<String> iterator2 = fishSet.iterator();

        while (iterator2.hasNext()) {
            String codeKey = iterator2.next();
            String values = fish.get(codeKey);
            System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
        }
        Set<String> fruitAndVeggieSet = fruitAndVeggies.keySet();
        Iterator<String> iterator3 = fruitAndVeggieSet.iterator();

        while (iterator3.hasNext()) {
            String codeKey = iterator3.next();
            String values = fruitAndVeggies.get(codeKey);
            System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
        }

        // System.out.println(allProdInFridge);
    } else if (answer.equalsIgnoreCase("no")) {
        System.out.println("Do you want to check contents already in fridge yes/no ");
        String answer2 = sc.next();
        if (answer2.equalsIgnoreCase("yes")) {
            Set<String> meatsSet = meats.keySet();
            Iterator<String> iterator = meatsSet.iterator();
            System.out.println("Your Refrigerator Contents are: ");

            while (iterator.hasNext()) {
                String codeKey = iterator.next();
                String values = meats.get(codeKey);
                System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
            }
            Set<String> fishSet = fish.keySet();
            Iterator<String> iterator2 = fishSet.iterator();

            while (iterator2.hasNext()) {
                String codeKey = iterator2.next();
                String values = fish.get(codeKey);
                System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
            }
            Set<String> fruitAndVeggieSet = fruitAndVeggies.keySet();
            Iterator<String> iterator3 = fruitAndVeggieSet.iterator();

            while (iterator3.hasNext()) {
                String codeKey = iterator3.next();
                String values = fruitAndVeggies.get(codeKey);
                System.out.println("Expiration Date " + codeKey + "\t==>>\t Food Description " + values);
            }
        } else if (answer2.equalsIgnoreCase("no")) {
            System.out.println(" +*****+");
            System.out.println("[| o o |]");
            System.out.println(" |     |" );
            System.out.println(" |  ^  |");
            System.out.println(" | '-' |");
            System.out.println(" +-----+");
            System.out.println("Come back later!\nThank you for using SmartFridge application!");
        }
        {
            System.out.println();
        }
    }
}catch (Exception e){
    System.out.println("Please Rerun Program and Input valid inputs");
}
}
}















