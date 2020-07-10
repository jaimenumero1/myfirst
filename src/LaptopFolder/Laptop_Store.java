package LaptopFolder;

public class Laptop_Store {
    public static void main(String[] args) {

        OS os = new OS("High Sierra", "10.13.6");
        Processor processor = new Processor(3.2, "Intel Core", "i3");
        Specs specification = new Specs(16, 500, processor);

        Laptop laptop = new Laptop("Apple", 2020, os, specification );

        System.out.println(laptop.getSpecs().getProcessor().getSpecsProcessorGhz());

        laptop.getOs().setNameOs("Catalina");
        System.out.println(laptop.getOs().getNameOs());

        os.setNameOs("High Sierra");

        OS newDell = new OS("Windows", "10");
        Processor processorDell = new Processor(2.8, "AMD", "T5");
        Specs specificationDell = new Specs(8, 250, processorDell);

        Laptop laptop2 = new Laptop("Dell", 2010, newDell, specificationDell);
//
//        System.out.println(laptop2.getBrand() + "\n" + laptop2.getYear() + "\n" + laptop2.getOs().getNameOs() +
//                "\n" + laptop2.getOs().getOsVersion() + "\n" + laptop2.getSpecs().getProcessor().getSpecsProcessorINumber() +
//                "\n" + laptop2.getSpecs().getProcessor().getSpecsProcessorIName() + "\n" + laptop2.getSpecs().getSpecsHd() +
//                laptop2.getSpecs().getSpecsRam());



        System.out.println(laptop2.toString());
        System.out.println(laptop2.getOs().toString());
        System.out.println(laptop2.getSpecs().toString());
        System.out.println(laptop2.getSpecs().getProcessor().toString());

        OS oldEmachines = new OS("Windows","windows 2000");
        Processor oldPro = new Processor(2,"Pentium", "III");
        Specs oldSpecs = new Specs(500,4,oldPro);



        System.out.println();
        System.out.println();
        Laptop laptop5 = new Laptop("Emachines",1996,oldEmachines,oldSpecs,oldPro);
        System.out.println(laptop5);
        System.out.println(laptop5.getOs());
        System.out.println(laptop5.getSpecs());
        System.out.println(laptop5.getProcessor());




    }
}