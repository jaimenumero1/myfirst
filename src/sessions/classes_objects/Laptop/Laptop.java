package sessions.classes_objects.Laptop;

public class Laptop {
    //HomeWork =>
    //Create a class for Laptop;
    //Laptop must have brand
    //year
    //OS(name, version)
    //Specs(ram(memory), hd(memory), processor(iNumber, Ghz, numOfCores)
    //Classes
    //Laptop
    //OS
    //Specs
    //Processor

    private String year;
    private String brand;

    public Laptop(String year,String brand){
        this.brand = brand;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
