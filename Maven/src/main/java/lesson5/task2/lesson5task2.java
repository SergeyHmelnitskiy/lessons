package lesson5.task2;

public class lesson5task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.setFillColor("Красный");
        circle.setBorderColor("Зеленый");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Коричневый");
        rectangle.setBorderColor("Желтый");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Оранжевый");
        triangle.setBorderColor("Фиолетовый");
        triangle.printCharacteristics();
    }
}
