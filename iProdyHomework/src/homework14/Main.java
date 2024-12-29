package homework14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> attendanceLogger = new HashMap();
        AttandanceLogger attandanceLog = new AttandanceLogger("09:00", "user1");
        AttandanceLogger attandanceLog2 = new AttandanceLogger("11:30", "user2");
        AttandanceLogger attandanceLog3 = new AttandanceLogger("18:30", "user3");
        AttandanceLogger attandanceLog4 = new AttandanceLogger("13:30", "user1");
        AttandanceLogger attandanceLog5 = new AttandanceLogger("01:30", "user4");
        AttandanceLogger attandanceLog6 = new AttandanceLogger("11:00", "user2");
        AttandanceLogger attandanceLog7 = new AttandanceLogger("11:15", "user5");

        attandanceLog.registerAttendance(attendanceLogger);
        attandanceLog2.registerAttendance(attendanceLogger);
        attandanceLog3.registerAttendance(attendanceLogger);
        attandanceLog4.registerAttendance(attendanceLogger);
        attandanceLog5.registerAttendance(attendanceLogger);
        attandanceLog6.registerAttendance(attendanceLogger);
        attandanceLog7.registerAttendance(attendanceLogger);
        System.out.println(attendanceLogger);
        System.out.println("________________");
        System.out.println(AttandanceLogger.countAttendance(attendanceLogger));
        System.out.println("________________");
        System.out.println(AttandanceLogger.countPopularHour(attendanceLogger));
    }
}
