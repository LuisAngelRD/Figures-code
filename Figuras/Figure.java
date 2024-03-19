package Figuras;
public abstract class Figure{

    public int numOfSides;

    //Constructor
    public Figure(int numOfSides){
        this.numOfSides = numOfSides;
    }

    public int numOfSides(){
        return numOfSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}