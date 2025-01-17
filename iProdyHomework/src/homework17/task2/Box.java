package homework17.task2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    //Этот метод создал для себя, исключительно для проверок в методе Main
    public List<T> getFruits() {
        return fruits;
    }

    public void add(T fruit) {
            fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;
        return fruits.size() * fruits.get(0).getWeight();
    }

    public <V extends Fruit> boolean compare(Box<V> box) {
        return Float.compare(getWeight(), box.getWeight()) == 0;
    }

    public void transfer(Box<T> box) {
        List<T> sourceBox = fruits;
        List<T> targetBox = box.fruits;
        targetBox.addAll(sourceBox);
        sourceBox.clear();
    }
}


