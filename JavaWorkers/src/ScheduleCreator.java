public class ScheduleCreator {
    public void createSchedule(CreateCommand command) {
        // Use ical4j or similar library to create a new Calendar
        Calendar calendar = new Calendar();
        command.getEvents().forEach(event -> {
            // For each event, add it to the calendar
            VEvent vEvent = new VEvent(new DateTime(event.getFrom()), new DateTime(event.getTo()), event.getName());
            // Add location if specified
            if (event.getLocation() != null) {
                vEvent.getProperties().add(new Location(event.getLocation()));
            }
            calendar.getComponents().add(vEvent);
        });
        // Save the calendar to an .ics file
        // This step depends on the iCalendar library you're using
    }
}
