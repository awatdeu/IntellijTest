package Inheritance.vehicle;

public class Airplane extends Vehicle{

    protected int numberofEngines;
    protected int maxAltitude;

    public Airplane(int numberofWheels, int tankCapacity, int maxSpeed, int capacity, int numberofEngines,int maxAltitude){
        super( numberofWheels,  tankCapacity,  maxSpeed,  capacity);
        this.numberofEngines=numberofEngines;
        this.maxAltitude=maxAltitude;
    }
}
