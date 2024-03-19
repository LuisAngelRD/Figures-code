package Figuras;

public class Rectangle extends Figure implements Resize{
    public double length;
    public double height;

    // Constructor
    public Rectangle(double length, double height){
        super(4);
        this.length = length;
        this.height = height;
    }
    //Get and Set for Length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Get and Set for Height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return length * height;
    }

    @Override 
    public double getPerimeter() {
        return 2 * (height + length);
    }

    @Override
    public void resize(double factor){
        this.length *= factor;
        this.height *= factor;
    }
}
