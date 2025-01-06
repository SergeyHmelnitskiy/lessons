package lesson5.task2;

public abstract class Figure implements Shape, Fillable, Borderable {
    protected String fillColor;
    protected String borderColor;

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

    public abstract void printCharacteristics();
}
