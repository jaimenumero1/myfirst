package sessions.classes_objects.covariant;

import java.time.LocalDate;
public class RegisteredVehicle extends Vehicle {
    private String registrationNumber;
    private LocalDate registrationDate;
    private LocalDate expirationDate;
    public RegisteredVehicle(int numOfWheels, String color, long vin, boolean isGas, String registrationNumber, LocalDate registrationDate, LocalDate expirationDate) {
        super(numOfWheels, color, vin, isGas);
        this.registrationNumber = registrationNumber;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }
    public RegisteredVehicle() {
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
    @Override
    public Double sum(int a, int x) {
        return (double)a+x;
    }
}
