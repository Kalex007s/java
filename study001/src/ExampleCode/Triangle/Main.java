package ExampleCode.Triangle;

import ExampleCode.Java0326.Circle;
import ExampleCode.Java0326.Rectangle;

public class Main {
    public static void main(String[]args){
        Triangle triangle = new Triangle(6,5);
        System.out.println("Area: "+triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
