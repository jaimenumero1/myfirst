package LaptopFolder;

public class Laptop {
    //HomeWork =>
//
//    //Create a class for Laptop;
//    //Laptop must have brand
//    //year
//    //OS(name, version)
//    //Specs(ram(memory), hd(memory), processor(iNumber, Ghz, numOfCores)
//
//    //Classes
//    //Laptop
//    //OS//
//    //Specs
//    //Processor //


    private String brand;
    private int year;
    private OS os;
    private Specs specs;
    private Processor processor;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", year=" + year +

                '}';
    }


    public Laptop(String brand, int year, OS os, Specs specs) {
        this.brand = brand;
        this.year = year;
        this.os = os;
        this.specs = specs;

    }
    public Laptop(String brand,int year,OS os,Specs specs,Processor processor){
        this.brand = brand;
        this.year = year;
        this.os = os;
        this.processor = processor;
        this.specs = specs;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Specs getSpecs() {
        return specs;
    }

    public void setSpecs(Specs specs) {
        this.specs = specs;
    }


}
