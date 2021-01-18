package main;

import solution.*;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {


        // solution.Square test
        double side = 5;
        Shape square = new Square(side);
        System.out.println(square.toString());
        System.out.println(square.equals(new Square(5)));

        // solution.Circle test
        double diameter = 5;
        Shape circle = new Circle(diameter);
        System.out.println(circle.toString());
        System.out.println(square.equals(new Square(5)));

        // solution.Rectangle test
        double length = 5;
        double breadth = 6;
        Shape rectangle = new Rectangle(length,breadth);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.equals(new Rectangle(5,6)));

    }
}
