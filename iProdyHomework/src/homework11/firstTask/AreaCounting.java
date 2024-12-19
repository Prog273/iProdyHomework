package homework11.firstTask;

public class AreaCounting {
    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure quadrate = new Quadrate(5.2);
        Figure triangle = new Triangle(32, 5.6);
        Figure[] figures = {circle, quadrate, triangle};
        System.out.println(sumAreas(figures));
    }

    public static double sumAreas(Figure[] figures) {
        double sumOfAreas = 0;
        for (var figure : figures) {
            double area = figure.countArea();
            sumOfAreas += area;
        }
        return sumOfAreas;
    }
}
