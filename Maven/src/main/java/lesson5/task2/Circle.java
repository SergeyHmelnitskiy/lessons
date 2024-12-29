package lesson5.task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
        return calculateCirclePerimeter(radius);
    }

    @Override
    public double calculateArea() {
        return calculateCircleArea(radius);
    }

    public void printCharacteristics() {
        System.out.println("Круг:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет линии границы: " + getBorderColor());
    }
}
