package solution;

public abstract class Shape {
    public double width;
    public double height;

    /**
     * @param side
     * constructor overloading
     */
    public Shape(double side)throws NegativeNumberException{
        this(side,side);
    }

    /**
     *
     * @param width
     * @param height
     * constructor overloading
     */
    public Shape(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()) {
            try {
                if ((((Shape) o).getArea() == this.getArea()) && (((Shape) o).getPerimeter() == this.getPerimeter()))
                    return true;
            } catch (NegativeNumberException e) {
                e.printStackTrace();
            }
        } else
            return false;
        return false;
    }

    public abstract double getArea() throws NegativeNumberException;

    public abstract double getPerimeter() throws NegativeNumberException;
}