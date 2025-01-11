package iprody.coffeshot;

import java.util.*;

public class CoffeeOrderBoard {
    private static Queue<Order> orders = new PriorityQueue<>();

    public static Queue<Order> getOrders() {
        return orders;
    }

    public static void add(Order order) {
        //В предыдущем решении, где был TreeSet, на подобное ты сказал, что ненадёжно. Переделал для PriorityQueue.
        // Так надёжно, подскажи, пожалуйста?
        int newOrderNumber = orders.isEmpty() ? 1 : Collections.max(orders).getOrderNumber() + 1;
        orders.add(new Order(newOrderNumber, order.getName()));
    }

    public static Optional<Order> deliver() {
        if (orders.isEmpty()) {
            System.out.println("Заказов нет!");
            //В предыдущем решении метод возвращал Order и в этом случае был возврат null. Переделал на Optional.
            return Optional.empty();
        }
        Order firstOrder = orders.poll();
        return Optional.of(firstOrder);
    }

    public static Optional<Order> deliver(int orderNumber) {
        if (orders.isEmpty()) {
            System.out.println("Заказов нет!");
            return Optional.empty();
        }
        for (var order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                Order necessaryOrder = order;
                orders.remove(necessaryOrder);
                return Optional.of(necessaryOrder);
            }
        }
        System.out.println("Заказа с подходящим номером нет!");
        return Optional.empty();
    }

    public static void draw() {
        System.out.println("Num | Name");
        for (var order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getName());
        }
    }
}
