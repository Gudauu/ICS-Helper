/*
 * generated by Xtext 2.34.0
 */
package ics.helper.validation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import ics.helper.helperDSL.Event;
import ics.helper.helperDSL.HelperDSLPackage;
import ics.helper.helperDSL.Person;
import ics.helper.helperDSL.Reminder;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HelperDSLValidator extends AbstractHelperDSLValidator {
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    // check email pattern
    @Check
    public void checkPersonEmail(Person person) {
        String email = person.getEmail();
        // email should not be empty and should match the regex pattern
        if (email == null || email.isEmpty()) {
            error("The email address cannot be null or empty.", 
                  HelperDSLPackage.Literals.PERSON__EMAIL, 
                  ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "empty-email");
        } else if (!EMAIL_PATTERN.matcher(email).matches()) {
            error("The email address is invalid.", 
                  HelperDSLPackage.Literals.PERSON__EMAIL, 
                  ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "invalid-email");
        }
    }
    
    // check uniqueness of email 
    @Check
    public void checkInviteesEmailUniqueness(Event event) {
        // Track unique emails for the current event's invitees
        Set<String> uniqueEmails = new HashSet<>();

        if (event.getInvitees() != null) {
            for (Person invitee : event.getInvitees()) {
                String email = invitee.getEmail();
                // if the email is already in the set, it's not unique
                if (!uniqueEmails.add(email)) {
                    // If the email cannot be added to the set
                    error("Invitee email addresses must be unique.", 
                          HelperDSLPackage.Literals.EVENT__INVITEES, 
                          ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "duplicate-invitee-email");
                }
            }
        }
    }
    
    // Link should look like url
    @Check
    public void checkEventLink(Event event) {
        if (event.getLink() != null && !isValidLink(event.getLink())) {
            error("The event link is invalid.", 
                  HelperDSLPackage.Literals.EVENT__LINK, 
                  ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "invalid-event-link");
        }
    }
    private boolean isValidLink(String link) {
        return link != null && link.contains("://");
    }
    
	// start time <= end time
	@Check
	public void checkEventTimes(Event event) {
        if (event.getStartTime() != null && event.getEndTime() != null) {
            // Convert STRING to LocalDateTime
            LocalDateTime startTime = LocalDateTime.parse(event.getStartTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            LocalDateTime endTime = LocalDateTime.parse(event.getEndTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            
            if (startTime.isAfter(endTime) || startTime.isEqual(endTime)) {
                error("The event start time must be before the end time.", 
                      HelperDSLPackage.Literals.EVENT__START_TIME, 
                      ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "invalid-event-time");
            }
        }
    }
	//reminder time > 0 mins
	@Check
	public void checkReminderTimePositive(Reminder reminder) {
	    if (reminder.getTime() <= 0) {
	        error("The reminder time must be greater than 0.",
	              HelperDSLPackage.Literals.REMINDER__TIME, // Adjust this to match the actual EAttribute of your Reminder time
	              ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "invalid-reminder-time");
	    }
	}
}
