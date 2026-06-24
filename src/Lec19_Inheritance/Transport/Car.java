package Lec19_Inheritance.Transport;

public class Car extends Vehicle{
    public int noOfDoors;

    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name,model,noOfTyres);

    }
}
