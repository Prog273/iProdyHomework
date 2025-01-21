package homework11.secondTask;

public class Robot implements Participant {
    private String name;
    private double maxRunDistance;
    private double maxJumpDistance;

    public Robot(String name, double maxRunDistance, double maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    public String getName() {
        return name;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpDistance() {
        return maxJumpDistance;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
