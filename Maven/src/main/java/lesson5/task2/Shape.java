package lesson5.task2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    default double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    default double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
