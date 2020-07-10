package sessions.classes_objects;
//part of Animal shelter application
// we can adopt the animals
//we can give the animals to new facilities

// Objects are essentially information about specific entity(item,animal,person,part)
//In often cases we create information about the same entity millions of times.
//
//Objects help us maintatin information about specific entities in an elegant manner.


import java.time.LocalDateTime;

public class Animal1 {
    public String type;
    // if age is available store it otherwise assign -1
    public String breed;
    private int age;
    private int duration;

    public char gender;

    private double weight;

    private boolean isInjured;

    private LocalDateTime timeCreated = LocalDateTime.now();

    //there are two sides to the app
    //1. our employees internal app)
    //2. Our clients

    //Employees will add an animal to the stock
    //User will be searching for a specific animal in the stock

    //Employees will add an animal to the data for the dog

    //Clients can search by all or type, and gender

    //constructor must have the same name az class and no return type.
    public Animal1(String type, String breed, int age, int duration, char gender, double weight, boolean isInjured){
    this.age = age;
    this.setBreed(breed);
    this.duration = duration;
    this.gender = gender;
    this.isInjured = isInjured;
    this.setType(type);
    this.weight = weight;
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    private String getBreed() {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", duration=" + duration +
                ", gender=" + gender +
                ", weight=" + weight +
                ", isInjured=" + isInjured +
                '}';
    }

    public static class AccessModifierCheck2 {
        public static void main(String[] args) {
    //        Car car2 = new Car();
    //        String car2Model = car2.model;//accessible bc it's
        }
    }
}
