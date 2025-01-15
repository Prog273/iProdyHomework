package homework17.task2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public void setFruits(List<T> fruits) {
        this.fruits = fruits;
    }

    public void add(T fruit) {
        if (fruits.isEmpty()) {
            fruits.add(fruit);
            return;
        }

        if (fruits.get(0) instanceof Apple && fruit instanceof Apple) {
            fruits.add(fruit);
        }

        if (fruits.get(0) instanceof Orange && fruit instanceof Orange) {
            fruits.add(fruit);
        }
    }

    public float getWeight() {
        if (fruits.isEmpty()) return 0;

        int numberOfFruits = fruits.size();
        return numberOfFruits * fruits.get(0).getWeight();
    }

    public boolean compare(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<T> box) {
        List<T> sourceBox = this.fruits;
        List<T> targetBox = box.fruits;
        if (sourceBox.isEmpty() || targetBox.isEmpty()) {
            targetBox.addAll(sourceBox);
        }
        if (sourceBox.get(0).getClass().getName()
                .equals(targetBox.get(0).getClass().getName())) {
            targetBox.addAll(sourceBox);
        }
        box.setFruits(targetBox);
    }
}


