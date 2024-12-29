package homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AttandanceLogger {
    private String timestamp;
    private String user_id;

    public AttandanceLogger(String timestamp, String user_id) {
        this.timestamp = timestamp;
        this.user_id = user_id;
    }

    public void registerAttendance(Map<String, String> attendanceLogger) {
        String timestamp = this.timestamp;
        String user_id = this.user_id;
        //в качестве ключа помещаем время, а в качестве значения - id, так как, если сделать
        //наоборот, будут перезаписываться значения (для одного посетителя не получится сохранить
        //несколько записей времени
        attendanceLogger.put(timestamp, user_id);
    }

    public static TreeMap<String, Integer> countAttendance(Map<String, String> attendanceLogger) {
        //используем TreeMap, чтобы пользователи были отсортированы
        TreeMap<String, Integer> attendanceCounter = new TreeMap<>();
        //записываем в качестве ключей всех посетителей
        for (var user_id : attendanceLogger.values()) {
            attendanceCounter.put(user_id, 0);
        }
        //записываем количество посещений для каждого посетителя
        for (var user_id : attendanceCounter.keySet()) {
            int count = 0;
            for (var value : attendanceLogger.values()) {
                if (user_id.equals(value)) count++;
            }
            attendanceCounter.put(user_id, count);
        }
        return attendanceCounter;
    }

    public static String countPopularHour(Map<String, String> attendanceLogger) {
        //сохраняем часы в коллекцию
        List<String> hours = new ArrayList<>();
        for (var hour : attendanceLogger.keySet()) {
            hours.add(hour.substring(0, 2));
        }
        //и сохраняем уникальные значения с сортировкой
        List<String> uniqueHours = new ArrayList<>(new HashSet<>(hours));

        //считаем, сколько раз на каждый час приходится посещений
        Map<String, Integer> hourCounter = new HashMap<>();
        for (var uniqueHour : uniqueHours) {
            int count = 0;
            for (var hour : hours) {
                if (hour.equals(uniqueHour)) count++;
            }
            hourCounter.put(uniqueHour, count);
        }

        //находим самый популярный час
        int maxTimes = Collections.max(hourCounter.values());
        String mostPopularHour = null;
        for (var entry : hourCounter.entrySet()) {
            if (entry.getValue().equals(maxTimes)) {
                mostPopularHour = entry.getKey();
            }
        }
        //конкатенируем строку с ответом, для сортировки создаём TreeMap
        String answer = mostPopularHour + ":00 (Посещения - " + maxTimes + ": ";
        TreeMap<String, String> sortedLogger = new TreeMap<>(attendanceLogger);
        for (var log : sortedLogger.keySet()) {
            if (log.substring(0, 2).equals(mostPopularHour)) {
                answer = answer + log + ", ";
            }
        }
        answer = answer.substring(0, answer.length() - 2) + ")";
        return answer;
    }


}
