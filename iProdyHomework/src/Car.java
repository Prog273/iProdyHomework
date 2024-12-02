public class Car {
    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private static void startElectricity() {
        System.out.println("Запуск электрической цепи");
    }
    private static void startCommand() {
        System.out.println("Запуск системы управления");
    }
    private static void startFuelSystem() {
        System.out.println("Запуск системы распределения топлива");
    }
}
