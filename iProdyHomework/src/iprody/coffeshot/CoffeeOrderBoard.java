package iprody.coffeshot;

import java.util.TreeSet;

public class CoffeeOrderBoard {
    //Использую TreeSet в качестве поля, т.к. по условию нужна сортировка элементов по номеру заказа
    //не написал Set<Order> orders = new TreeSet<>(), т.к. в таком случае метод last() из TreeSet становится недоступен
    private static TreeSet<Order> orders = new TreeSet<>();

    public static TreeSet<Order> getOrders() {
        return orders;
    }

    public static void add(Order order) {
        int newOrderNumber = orders.isEmpty() ? 1 : orders.last().getOrderNumber() + 1;
        orders.add(new Order(newOrderNumber, order.getName()));
    }

    public static Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("Заказов нет!");
            return null;
        }
        Order firstOrder = orders.first();
        orders.remove(firstOrder);
        return firstOrder;
    }

    public static Order deliver(int orderNumber) {
        if (orders.isEmpty()) {
            System.out.println("Заказов нет!");
            return null;
        }
        for (var order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                Order necessaryOrder = order;
                orders.remove(necessaryOrder);
                return necessaryOrder;
            }
        }
        System.out.println("Заказа с подходящим номером нет!");
        return null;
    }

    public static void draw() {
        System.out.println("Num | Name");
        for (var order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getName());
        }
    }
}
