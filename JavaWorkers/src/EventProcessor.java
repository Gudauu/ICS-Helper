import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EventProcessor {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void processEvent(String startTimeStr, String endTimeStr) {
        try {
            LocalDateTime startTime = LocalDateTime.parse(startTimeStr, formatter);
            LocalDateTime endTime = LocalDateTime.parse(endTimeStr, formatter);
            // Now startTime and endTime are LocalDateTime objects
        } catch (DateTimeParseException e) {
            // Handle parsing error
        }
    }
}
