package MyMentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KitchenUtilStore {


    public static void main(String[] args) throws InterruptedException {
        Plate plate = new Plate();
////       plate.size = 9;
////        plate.color = "Pink";
////        plate.material = "Porcelain";
////
        MakeCup sorinsCup = new MakeCup("color", "Material", 30);
////
////        System.out.println(plate);
////
////        Plate newPlate = new Plate("Glass","Clear",5);
////        System.out.println(newPlate);
        Plate plastiPlate = new Plate("Plastic", "yellow", 10);
//
////        newPlate.breakThePlate();
////
////        plate.breakThePlate(plate.material);
//
//        //plastiPlate.breakThePlate(plastiPlate.material);
//
//        plastiPlate.breakThePlate(plastiPlate.material);
//
//        Plate samarasPlate = new Plate("Glass","White",4);
//
//        Plate.sellSamarasPlate(samarasPlate);
//
//        samarasPlate.breakThePlate(samarasPlate.material);
        Spork spork = new Spork();

        List<UtensilsParent> kitStuff = new ArrayList<>();
        kitStuff.add(plastiPlate);
        kitStuff.add(sorinsCup);
        kitStuff.add(spork);
        UtensilsParent spok = new Spork();
        UtensilsParent cup9 = new MakeCup();
        System.out.println(kitStuff);
        kitStuff.add(cup9);
        for (int i = 0; i < kitStuff.size(); i++) {

            kitStuff.get(i).saySomething();
        }




        Random random = new Random(1);
        double freq;

        for (int i = 0; i < 15; i++) {
            Thread.sleep(999);
            freq= random.nextDouble();
            if (freq < .3) {
                System.out.println();
                spork.saySomething();
            } else if(freq >.3 && freq < .6) {
                System.out.println();
                plastiPlate.saySomething();
            }else{
                System.out.println();
                sorinsCup.saySomething();
            }


        }
        UtensilsParent utensilsParent;

        utensilsParent = new MakeCup();
        utensilsParent.saySomething();
        utensilsParent = new Plate();
        utensilsParent.saySomething();
        utensilsParent= new Spork();
        utensilsParent.saySomething();
    }
}
