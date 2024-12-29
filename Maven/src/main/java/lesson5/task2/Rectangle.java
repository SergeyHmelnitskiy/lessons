package lesson5.task2;

public class Rectangle implements Shape, Fillable, Borderable {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return calculateRectanglePerimeter(width, height);
    }

    @Override
    public double calculateArea() {
        return width * height;
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
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет линии границы: " + getBorderColor());
    }
}
