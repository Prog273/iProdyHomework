package homework14;

import java.time.LocalTime;
import java.util.UUID;

public record TimeRecord(UUID userId, LocalTime localTime) {
}
