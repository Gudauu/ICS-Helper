import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.property.CalScale;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.Version;
import net.fortuna.ical4j.data.CalendarOutputter;
import java.io.FileOutputStream;

public class ICSFileCreator {

    public void createICSFile(String filename, CreateCommand createCommand) {
        Calendar calendar = new Calendar();
        calendar.getProperties().add(new ProdId("-//My ICS Helper//iCal4j 1.0//EN"));
        calendar.getProperties().add(Version.VERSION_2_0);
        calendar.getProperties().add(CalScale.GREGORIAN);

        // Assuming you have methods to convert startTime and endTime Strings to Date objects
        for (Event event : createCommand.getEvents()) {
            VEvent vEvent = new VEvent(/* startDate */, /* endDate */, event.getName());
            // Optionally set location if provided
            if (event.getLocation() != null) {
                vEvent.getProperties().add(new Location(event.getLocation()));
            }
            calendar.getComponents().add(vEvent);
        }

        // Write calendar to file
        try (FileOutputStream fout = new FileOutputStream(filename + ".ics")) {
            CalendarOutputter outputter = new CalendarOutputter();
            outputter.output(calendar, fout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
