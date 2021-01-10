package ch.hslu.sw_04;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.switchOn();
        System.out.println(vehicle.isSwitchedOn());
    }
}
