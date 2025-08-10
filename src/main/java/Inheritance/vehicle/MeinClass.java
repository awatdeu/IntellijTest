package Inheritance.vehicle;

public class MeinClass {
    public static void main(String[] args) {
        Airplane airplane=new Airplane(18,200,900,250,4,5000);
        System.out.println("Airplane Capacity: "+airplane.getCapacity());//
        System.out.println("Number of engines: "+airplane.getNumberofWheels());//

        Ship ship=new Ship(0,200,120,500,"F7");
        System.out.println(ship.getShipType());
        System.out.println(ship.getMaxSpeed());
    }
}
