package sessions.classes_objects.covariant;

public class VehicleShop {
    //calculate price for vehicle based on it's number of wheels
    //and gas or diesel
    public static double estimatePrice(Vehicle vehicle){//Vehicle param can take all data types that extend from Vehicle class.
        //polymorphism
        if (vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
            return 5000.00;
        }
        else if (!vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
            return 2000.00;
        }
        else {
            System.out.println("More features to come");
            return 0;
        }
    }
    //No need to create the same logic for each subclass bc all of them can be passed to Vehicle param
//    public static double estimatePrice(RegisteredVehicle vehicle){//Vehicle param can take all data types that extend from Vehicle class.
//        //polymorphism
//        if (vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
//            return 5000.00;
//        }
//        else if (!vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
//            return 2000.00;
//        }
//        else {
//            System.out.println("More features to come");
//            return 0;
//        }
//    }
//
//    public static double estimatePrice(Bike vehicle){//Vehicle param can take all data types that extend from Vehicle class.
//        //polymorphism
//        if (vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
//            return 5000.00;
//        }
//        else if (!vehicle.isGas() && vehicle.getNumOfWheels() >= 4){
//            return 2000.00;
//        }
//        else {
//            System.out.println("More features to come");
//            return 0;
//        }
//    }
    //polymorphism
    //flexibility and reusibility
    //Create a method and in Params put a Parent class
    //we dont have to recreate this method for every subclass
    //Create a method which will create and object which I will ask.
    //I can ask for Vehicle, Bike, RegisteredVehicle
    //polymorphism -->
    public static Vehicle createAnObject(String type) {
       switch (type.toLowerCase()){
           case "vehicle":
               return new Vehicle(4,"White",121323,false);
           case "bike":
               return new Bike();
           case "registeredvehicle":
               return new RegisteredVehicle();
           default:
               return null;
       }
    }
}
