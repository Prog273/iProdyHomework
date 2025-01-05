package homework14;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class AttandanceLogger {

    private final List<TimeRecord> records = new ArrayList<>();

    public void registerAttendance(UUID userId) {
        records.add(new TimeRecord(userId, LocalTime.now().truncatedTo(ChronoUnit.MINUTES)));
    }

    public Map<UUID, Integer> countAttendance() {
        Map<UUID, Integer> attendanceCounter = new HashMap<>();
        for (TimeRecord record : records) {
            if (attendanceCounter.containsKey(record.userId())) {
                attendanceCounter.put(record.userId(), attendanceCounter.get(record.userId()) + 1);
            } else {
                attendanceCounter.put(record.userId(), 1);
            }
        }
        return attendanceCounter;
    }

    public String countPopularHour() {
        //находим количество посещений для каждого часа
        Map<Integer, Integer> popularHoursCounter = new HashMap<>();
        for (var record : records) {
            if (popularHoursCounter.containsKey(record.localTime().getHour())) {
                popularHoursCounter.put(record.localTime().getHour(), popularHoursCounter.get(record.localTime().getHour()) + 1);
            } else {
                popularHoursCounter.put(record.localTime().getHour(), 1);
            }
        }
        //находим самый популярный час посещения
        Integer maxTimes = Collections.max(popularHoursCounter.values());
        Integer mostPopularHour = null;
        for (var entry : popularHoursCounter.entrySet()) {
            if (entry.getValue() == maxTimes) {
                mostPopularHour = entry.getKey();
            }
        }
        //генерируем ответ
        String answer = mostPopularHour + ": (количество посещений " + maxTimes + "---";
        StringBuilder stringBuilder = new StringBuilder(answer);
        for (var record : records) {
            if (record.localTime().getHour() == mostPopularHour)
                stringBuilder.append(record.localTime() + ", ");
        }
        answer = stringBuilder.toString();
        answer = answer.substring(0, answer.length() - 2) + ")";
        return answer;
    }
}
