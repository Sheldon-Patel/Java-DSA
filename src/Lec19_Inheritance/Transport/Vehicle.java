package Lec19_Inheritance.Transport;

public class Vehicle {
     String name;
     // nothing written so its

    public String model;

    public int noOfTyres;

   public Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres ){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.printf("engine is starting %s %s\n",name , model);
    }

    void stopEngine(){
        System.out.printf("engine is stoping %s %s\n",name , model);

    }

}
