package homework11.firstTask;

public class Quadrate implements Figure {
    private double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double countArea() {
        return (side * side);
    }
}
