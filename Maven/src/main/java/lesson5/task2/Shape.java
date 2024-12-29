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

    default double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    default double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    default double calculateTriangleArea(double side1, double side2, double side3) {
        double halfPerimeter = calculateTrianglePerimeter(side1, side2, side3) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) *
                (halfPerimeter - side2) * (halfPerimeter - side3));
    }
}
