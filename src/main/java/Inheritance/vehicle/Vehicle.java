package Inheritance.vehicle;

public class Vehicle {

   protected int numberofWheels;
   protected int tankCapacity;
   protected int maxSpeed;
   protected int capacity;


    Vehicle (int numberofWheels, int tankCapacity, int maxSpeed, int capacity){

        this.numberofWheels = numberofWheels;
        this.tankCapacity=tankCapacity;
        this.maxSpeed=maxSpeed;
        this.capacity=capacity;
    }
    public int getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(int numberofWheels) {
        this.numberofWheels = numberofWheels;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
