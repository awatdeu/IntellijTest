package Inheritance.vehicle;

public class Car extends Vehicle {
    protected boolean sunroof;

public Car(int numberofWheels, int tankCapacity, int maxSpeed, int capacity, boolean sunroof){

super( numberofWheels,  tankCapacity,  maxSpeed,  capacity); //Send to MotherClass
    this.sunroof=sunroof;
}

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
