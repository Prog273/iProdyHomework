package homework11.firstTask;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
