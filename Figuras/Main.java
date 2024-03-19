package Figuras;

public class Main {
    public static void main(String[] args) {
        //Creating Rectangle
        Rectangle rectangulo = new Rectangle(4, 3);
        Triangle triangulo = new Triangle(2, 3);

        // Area and Perimeter
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.getPerimeter() + "\n");

        System.out.println("El area del triangulo es: " + triangulo.getArea());
        System.out.println("El perimetro del triangulo es: " + triangulo.getPerimeter() + "\n");

        // Resize by multiply by x
        rectangulo.resize(3);

        // Print everything
        System.out.println("Área del rectángulo después de redimensionar: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo después de redimensionar: " + rectangulo.getPerimeter());

        
    }
}
