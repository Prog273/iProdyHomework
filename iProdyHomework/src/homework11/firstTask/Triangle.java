package homework11.firstTask;

public class Triangle implements Figure{
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }


    @Override
    public double countArea() {
        return (0.5 * side * height);
    }
}
