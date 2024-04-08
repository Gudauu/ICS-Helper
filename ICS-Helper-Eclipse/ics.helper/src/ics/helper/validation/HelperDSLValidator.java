/*
 * generated by Xtext 2.34.0
 */
package ics.helper.validation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import ics.helper.helperDSL.Event;
import ics.helper.helperDSL.HelperDSLPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class HelperDSLValidator extends AbstractHelperDSLValidator {
    @Check
    public void checkEventTimes(Event event) {
        if (event.getStartTime() != null && event.getEndTime() != null) {
            // Convert STRING to LocalDateTime, assuming your DSL stores times as strings
            LocalDateTime startTime = LocalDateTime.parse(event.getStartTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            LocalDateTime endTime = LocalDateTime.parse(event.getEndTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            
            if (startTime.isAfter(endTime) || startTime.isEqual(endTime)) {
                error("The event start time must be before the end time.", 
                      HelperDSLPackage.Literals.EVENT__START_TIME, 
                      ValidationMessageAcceptor.INSIGNIFICANT_INDEX, "invalid-event-time");
            }
        }
    }
}
/*
 * //	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					HelperDSLPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}
 */
 
