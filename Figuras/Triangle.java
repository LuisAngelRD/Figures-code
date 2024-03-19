package Figuras;

public class Triangle extends Figure{
    public double length;
    public double height;

    public Triangle(double length, double height) {
        super(3);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (length * height) / 2;
    }

    @Override
    public double getPerimeter() {
        // Suponiendo que es un triángulo cualquiera (no equilátero ni isósceles)
        return length + (2 * Math.sqrt((length * length) + (height * height)));
    }
}
