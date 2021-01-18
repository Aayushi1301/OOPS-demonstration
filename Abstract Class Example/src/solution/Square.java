package solution;

public class Square extends Shape {

    public Square(double side) throws NegativeNumberException {
        super(side);
    }

    @Override
    public double getArea() {

        return (height*width);
    }

    @Override
    public double getPerimeter() {

        return (4*height);
    }

    @Override
    public String toString()
    {
        return "side of square = "+height+" Area of square = "+getArea()+" Perimeter of square = "+getPerimeter();
    }


}