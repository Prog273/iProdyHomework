package homework11.secondTask;

public class Treadmill implements Obstacle {
    private String name;
    private double length;

    public Treadmill(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    @Override
    public double overcome() {
        return this.length;
    }
}
