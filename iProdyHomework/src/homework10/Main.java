package homework10;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal.printAnimalsCount();
        Dog dog = new Dog();
        Animal.printAnimalsCount();

        Cat cat2 = new Cat();
        Animal.printAnimalsCount();
        Dog dog2 = new Dog();
        Animal.printAnimalsCount();
    }
}
