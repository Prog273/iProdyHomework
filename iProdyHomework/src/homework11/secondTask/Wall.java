package homework11.secondTask;

public class Wall implements Obstacle {
    private String name;
    private double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    @Override
    public double overcome() {
        return this.height;
    }
}
