package Methods;

public class areaOfTheCylinder {

    public static void main(String[] args) {

        int r=3;
        int h=7;
 double area=areaCylinder(r);
        System.out.println("Area of the Cylinder: "+ area);
        double valume=cylinderValume(area,h);
        System.out.println("Valume of the Cylinder: "+ valume);

    }

    private static double cylinderValume(double area, int h) {

        double valume=area*h;
        return valume;
    }

    public static double areaCylinder(int r){

        double area=r*r*3.14;
        return area;
    }

}
