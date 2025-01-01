package iprody.coffeshot;

import java.util.TreeSet;

import static iprody.coffeshot.CoffeeOrderBoard.add;
import static iprody.coffeshot.CoffeeOrderBoard.deliver;
import static iprody.coffeshot.CoffeeOrderBoard.draw;

public class Main {
    public static void main(String[] args) {
        TreeSet<Order> orders = CoffeeOrderBoard.getOrders();

        Order order1 = new Order(45, "Dima");
        Order order2 = new Order(23, "Fsdfkh");
        Order order3 = new Order(455, "fsdg");
        Order order4 = new Order(26, "iosdufg");
        add(order1);
        add(order2);
        add(order3);
        add(order4);
        System.out.println(orders);
        System.out.println(deliver());
        System.out.println(orders);
        System.out.println("_____________");
        add(order1);
        System.out.println(orders);
        System.out.println("_______________");
        System.out.println(deliver(78));
        System.out.println("_______________");
        System.out.println(deliver(3));
        System.out.println(orders);
        System.out.println("_______________");
        draw();
    }
}
