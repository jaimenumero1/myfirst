package Mentor_Sessions;

public class BMI {
    /* Create an app that would calculate the body mass index
    BMI - BODY
     */
     /* create an app that would calculate the body mass index
    BMI - body mass index
    variables:
    persons name
    weight
    height
    age
1 - constructor (name, age, height, weight)
2 - const(name, height, weight)---> make it call the first constructor
methods:
getBMI():double
getStatus: string*/

     private String name;
     private int age;
     public double weight;              // most of the time variables are private
     private double height;

     public BMI(String name, int age,double weight,double height){
         this.name =name;
         this.age = age;
         this.height = height;
         this.weight = weight;

     }
    public BMI(String name,double weight,double height) {
    this(name,20,weight,height); // must be on the first line
     }
     public double getBMI(){
         return Math.round(weight/Math.pow(height,2));
     }
     public String getStatus(){
         double bmi = getBMI();
         if(bmi< 18.5) return "Under fat";
         else if(bmi>= 18.5 && bmi < 25) return "Healthy";
         else if(bmi >= 25 && bmi < 30) return "Over fat";
         return "Obese";
     }
}
