package Lab_1_2;

public class Rectangle {
    private double x1, y1;
    private double x2, y2;

    public Rectangle(double x1, double y1, double x2, double y2) {

        this.x1 = Math.min(x1, x2);
        this.x2 = Math.max(x1, x2);
        this.y1 = Math.max(y1, y2);
        this.y2 = Math.min(y1, y2);
    }

    public double getPerimeter() {
        double width = x2 - x1;
        double height = y1 - y2;
        return 2 * (width + height);
    }

    public double getArea() {
        double width = x2 - x1;
        double height = y1 - y2;
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Прямокутник[(%.1f, %.1f), (%.1f, %.1f)]", x1, y1, x2, y2);
    }
}