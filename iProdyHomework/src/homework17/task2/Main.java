package homework17.task2;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> box1 = new Box<>();
        box1.add(new Orange());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Orange());
        box1.add(new Apple());
        System.out.println(box1.getFruits().toString());
        System.out.println(box1.getWeight());
        Box<Fruit> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println(box2.getWeight());
        System.out.println();
        System.out.println(box1.compare(box2));
        System.out.println();
        box1.transfer(box2);
        System.out.println(box2.getFruits().toString());

    }
}
