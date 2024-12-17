package homework10;

public class Dog extends Animal {

    @Override
    public void run(int distance) {
        if (distance < 0 || distance > 500) {
            System.out.println("Некорректно введена дистанция бега");
        } else {
            System.out.println("Собака пробежала " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 0 || distance > 10) {
            System.out.println("Некорректно введена дистанция плавания");
        } else {
            System.out.println("Собака проплыла " + distance + " м.");
        }
    }
}
