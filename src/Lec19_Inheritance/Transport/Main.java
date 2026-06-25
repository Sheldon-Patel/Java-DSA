package Lec19_Inheritance.Transport;

public class Main {
    static void main(String[] args) {
        Car c = new Car("Maruti","800",4,4,"Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();
        System.out.println(c.name);

        MotorCycle m = new MotorCycle("splendor","Xline",2,"U","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
