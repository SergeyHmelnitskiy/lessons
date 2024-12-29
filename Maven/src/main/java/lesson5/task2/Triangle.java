package lesson5.task2;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override public double calculatePerimeter() {
        return calculateTrianglePerimeter(side1, side2, side3);
    }

    @Override
    public double calculateArea() {
        return calculateTriangleArea(side1, side2, side3);
    }

    public void printCharacteristics() {
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет линии границы: " + getBorderColor());
    }
}
