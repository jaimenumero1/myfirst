package sessions.classes_objects.covariant;

import java.time.LocalDate;
public class VehicleMainDriver {
    public static void main(String[] args) {
        //Create a vehicle object
        Vehicle vehicle = new Vehicle(4,"Black",12343443,true);
        Object vehicle2 = new Vehicle(4,"White",32343443,false);
        //Create RegisteredVehicle Object
        RegisteredVehicle registeredVehicle =
                new RegisteredVehicle(4,"Red",134345454,true,
                        "AN123", LocalDate.of(2020,5,2), LocalDate.of(2021, 5, 2));
        Vehicle registredVihicle2 = new RegisteredVehicle(4,"Blue",23322434,true,
                "ABC222", LocalDate.of(2020,4,22), LocalDate.of(2021, 4, 22));
        //Create Bike Object
        Bike bike =
                new Bike(2,"black",1213223,
                        "AC2323",LocalDate.of(2020,4,22),
                        LocalDate.of(2021, 4, 22),
                        "Sport", "Yamaha",1000);
        RegisteredVehicle bike2 =  new Bike(2,"blue",1213223,
                "Abb2323",LocalDate.of(2020,4,22),
                LocalDate.of(2021, 4, 22),
                "Sport", "BMW",1000);
        Vehicle bike3 =  new Bike(2,"Yellow",33434,
                "jjj222",LocalDate.of(2020,4,22),
                LocalDate.of(2021, 4, 22),
                "Sport", "Honda",1000);

        System.out.println("price for vehicle object " + VehicleShop.estimatePrice(vehicle));
        //vehicle2 is stored in Object class, which is larger than Vehicle class, so it Vehicle param cannot take it.
        //we can use casting in order to narrow down the variable data type
        System.out.println(vehicle2);//doesnt have access to any Vehicle members
        System.out.println("price for vehicle object " + VehicleShop.estimatePrice((Vehicle)vehicle2));//we are changing
        //the data type of vehicle2 to Vehicle from Object
        System.out.println(((Vehicle) vehicle2).getNumOfWheels());
        System.out.println(VehicleShop.estimatePrice(registeredVehicle));
        //polymorphism
        Vehicle vehicle1 = VehicleShop.createAnObject("vehicle");
        Bike bike1 = (Bike)VehicleShop.createAnObject("bike");//cast
        bike1.setBrand("Yamaha");
        System.out.println(bike1.getBrand());
//        Bike bike4 = (Bike)VehicleShop.createAnObject("registeredvehicle");//ClassCast Exception.
//        //which we get when the actual object that's stored in the Parent Class data type is not
//        //covariant to the object we try casting to.
//        bike4.setBrand("Honda");
//        System.out.println(bike4.getBrand());
        Vehicle vehicle3 = new Vehicle();//has info only about vehicle
        Vehicle v = new RegisteredVehicle();//has info about vehicle
        //by casting we can also get info about RegisteredVehicle.
        //RegisteredVehicle rg = (RegisteredVehicle)vehicle3;//class cast exception
        RegisteredVehicle rg = (RegisteredVehicle)v;   //which object v is pointing to?
        //the object v is pointing to should be same or narrower than what we are trying to cast to.
        RegisteredVehicle rv = new Bike();
        Bike b1 = (Bike)rv;
        System.out.println(vehicle3.sum(4,2));
        //if the method is overridden in subclass
        //and the variable is stored in the parent class DataType
        //but actual value(object is subclass) we call a method in subclass
        System.out.println(v.sum(4,2));
        //Casting
        int y = 100;
        short x = (short)y;//compile time error.
        sum((byte)y);
       // sum("Hello");cannot even be casted because they are not covariant.
    }
    public static void sum(byte a){
    }
}
