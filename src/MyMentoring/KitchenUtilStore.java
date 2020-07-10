package MyMentoring;
public class KitchenUtilStore {


    public static void main(String[] args) {
//       Plate plate = new Plate();
//       plate.size = 9;
//        plate.color = "Pink";
//        plate.material = "Porcelain";
//
//       MakeCup sorinsCup = new MakeCup("color","Material",30);
//
//        System.out.println(plate);
//
//        Plate newPlate = new Plate("Glass","Clear",5);
//        System.out.println(newPlate);
      Plate plastiPlate = new Plate("Plastic", "yellow",10);

//        newPlate.breakThePlate();
//
//        plate.breakThePlate(plate.material);

        //plastiPlate.breakThePlate(plastiPlate.material);

        plastiPlate.breakThePlate(plastiPlate.material);

        Plate samarasPlate = new Plate("Glass","White",4);

        Plate.sellSamarasPlate(samarasPlate);

        samarasPlate.breakThePlate(samarasPlate.material);







    }

}
