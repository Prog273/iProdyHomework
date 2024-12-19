package homework11.secondTask;

import org.w3c.dom.ls.LSOutput;

public class Competition {
    public static void main(String[] args) {
        start();
    }
    public static void start() {
        Participant human = new Human("Dima", 10000, 2.3);
        Participant cat = new Cat("Barsik", 2000, 3.9);
        Participant robot = new Robot("T800", 99000, 6.3);
        Participant[] participants = {human, cat, robot};
        Obstacle wall = new Wall("стена", 2.4);
        Obstacle treadmill = new Treadmill("беговая дорожка", 9500);
        Obstacle[] obstacles = {wall, treadmill};

        for (int i = 0; i < participants.length; i++) {
            //вводим переменные для дальнейшего сравнения и выведения в консоль
            String nameOfParticipant = participants[i].getName();
            double maxJumpDistance = participants[i].getMaxJumpDistance();
            double maxRunDistance = participants[i].getMaxRunDistance();
            String firstObstacle = obstacles[0].getName();
            String secondObstacle = obstacles[1].getName();
            double jumpDistance = obstacles[0].overcome();
            double runDistance = obstacles[1].overcome();
            double sumDistance = 0;

            //проверяем, перепрыгнет ли участник стену
            if (maxJumpDistance >= jumpDistance) {
                System.out.println("Участник " + nameOfParticipant + " прошёл препятствие " +
                        firstObstacle + " на дистанции " + jumpDistance + " м.");
                sumDistance += jumpDistance;
            } else {
                System.out.println("Участник " + nameOfParticipant + " не прошёл препятствие " +
                        firstObstacle + " на дистанции " + jumpDistance + " м.");
                System.out.println("Пройдено " + sumDistance + " м.");
                System.out.println("___________________________");
                continue;
            }

            //проверяем, пробежит ли участник дистанцию
            if (maxRunDistance >= runDistance) {
                System.out.println("Участник " + nameOfParticipant + " прошёл препятствие " +
                        secondObstacle + " на дистанции " + runDistance + " м.");
                sumDistance += runDistance;
            } else {
                System.out.println("Участник " + nameOfParticipant + " не прошёл препятствие " +
                        secondObstacle + " на дистанции " + runDistance + " м.");
            }
            System.out.println("Пройдено " + sumDistance + " м.");
            System.out.println("___________________________");
        }
    }
}
