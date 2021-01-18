package solution;

public class Rectangle extends Shape {

    public Rectangle(double length, double breadth) throws NegativeNumberException {
        super(length,breadth);
    }

    @Override
    public double getArea() {

        return (height*width);
    }

    @Override
    public double getPerimeter() {

        return (2*(height+width));
    }

    @Override
    public String toString()
    {
        return "length of rectangle = "+height+" breadth of rectangle = "+width+" Area of rectangle = "+getArea()+" Perimeter of rectangle = "+getPerimeter();
    }
}