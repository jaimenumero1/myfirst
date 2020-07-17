package MyMentoring;

public class Plate extends UtensilsParent {

   public String material ;
    public String color;
     public   int size;

    public Plate(){};


    public Plate(String material, String color, int size){
        this.material = material;
        this.color = color;
        this. size = size;

    }
    public void saySomething(){
        System.out.println("crack!!!!!");
    }
    public void breakThePlate (){
        System.out.println("Your Plate is broken ");
        System.out.println("And it was an Ugly color");
    }
    public void breakThePlate(String str){
        if((str).equals("Glass") || (str).equals("Porcelain")){
        System.out.println("Your Plate is broken");
        System.out.println("And it was a ugly color");}
        else{
            System.out.println("This plate cannot break it is plastic");
        }
    }
    public static void sellSamarasPlate(Plate plate){
        System.out.println("Samara's Plate is Sold");
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
