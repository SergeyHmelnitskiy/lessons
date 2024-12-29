package lesson5.task2;

public class Circle implements Shape, Fillable, Borderable {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
        return calculateCirclePerimeter(radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public void printCharacteristics() {
        System.out.println("Круг:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет линии границы: " + getBorderColor());
    }
}
