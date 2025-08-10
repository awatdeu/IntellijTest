package Inheritance.vehicle;

public class Ship extends Vehicle {

  protected String shipType;

  public Ship (int numberofWheels, int tankCapacity, int maxSpeed, int capacity,String shipType){

    super( numberofWheels,  tankCapacity,  maxSpeed,  capacity);
    this.shipType=shipType;
     }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
}
