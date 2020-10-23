package ch.hslu.sw_06;

import ch.hslu.sw_06.chemicalElement.ChemicalElement;
import ch.hslu.sw_06.chemicalElement.Mercury;
import ch.hslu.sw_06.chemicalElement.Temperature;
import ch.hslu.sw_05.named.Named;
import ch.hslu.sw_05.shape.Circle;
import ch.hslu.sw_05.shape.Rectangle;
import ch.hslu.sw_05.shape.Shape;
import ch.hslu.sw_05.switchable.Vehicle;

public class Main {
    public static void main(String[] args) {

        //// Some tests regarding Polymorphism while inheriting from (abstract) classes-------------------------
        //Circle circle = new Circle(30, 30, 50);
        //
        //System.out.println("Circle: " + circle.getArea());
        //
        //Shape shape = circle;
        //
        //System.out.println("Shape: " + shape.getArea());
        //Circle circle_ref = (Circle)shape;
        //
        //System.out.println("Circle_ref: " + circle_ref.getArea());
        //
        //Rectangle rectangle = new Rectangle(50, 50, 20, 40);
        //Shape shape_2 = rectangle;
        // //crashes! Not castable, because origin of shape_2 is not of type "Circle"
        ////Circle rectangle_ref = (Circle)shape_2;

        // some tests regarding Polymorphism while implementing interfaces---------------------------------------

        //Circle circle = new Circle(20, 20, 50);
        //circle.setName("HappyCircle");
        //
        //ChemicalElement chemicalElement = new Mercury(new Temperature(295.15f));
        //chemicalElement.setName("EvilElement");
        //
        //Vehicle vehicle = new Vehicle();
        //vehicle.setName("SuperDuperVehicle");
        //
        //Named[] namedElements = new Named[3];
        //namedElements[0] = circle;
        //namedElements[1] = chemicalElement;
        //namedElements[2] = vehicle;
        //
        //
        //for (int x = 0; x < namedElements.length; x ++) {
        //    Named element = namedElements[x];
        //    element.setName(element.getName() + "_" + x);
        //    System.out.println(element.getName());
        //}


        ChemicalElement chemicalElement = new ChemicalElement("N", new Temperature(295.15f), new Temperature(200.00f), new Temperature(400.00f));
        ChemicalElement mercury = new Mercury(new Temperature(295.15f));

        System.out.println(chemicalElement.toString());
        System.out.println(mercury.toString());

    }
}
