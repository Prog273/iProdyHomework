package homework14;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        var logger = new AttandanceLogger();
        var user1 = UUID.randomUUID();
        var user2 = UUID.randomUUID();
        var user3 = UUID.randomUUID();
        var user4 = UUID.randomUUID();
        var user5 = UUID.randomUUID();
        var user6 = UUID.randomUUID();

        logger.registerAttendance(user1);
        logger.registerAttendance(user2);
        logger.registerAttendance(user2);
        logger.registerAttendance(user2);
        logger.registerAttendance(user3);
        logger.registerAttendance(user4);
        logger.registerAttendance(user4);
        logger.registerAttendance(user5);
        logger.registerAttendance(user6);
        logger.registerAttendance(user6);
        logger.registerAttendance(user6);
        logger.registerAttendance(user6);

        System.out.println(logger.countAttendance());
        System.out.println(logger.countPopularHour());
    }
}
