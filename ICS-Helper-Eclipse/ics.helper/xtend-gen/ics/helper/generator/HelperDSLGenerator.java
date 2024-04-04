/**
 * generated by Xtext 2.34.0
 */
package ics.helper.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import ics.helper.helperDSL.CreateCommand;
import ics.helper.helperDSL.DaysOfWeek;
import ics.helper.helperDSL.Event;
import ics.helper.helperDSL.Person;
import ics.helper.helperDSL.RecurRule;
import ics.helper.helperDSL.Reminder;
import ics.helper.helperDSL.WEEKDAY;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates ICS files from your model files on save.
 */
@SuppressWarnings("all")
public class HelperDSLGenerator extends AbstractGenerator {
  private final DateTimeFormatter userInputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

  private final DateTimeFormatter icsFormatter = DateTimeFormatter.ofPattern("yyyyMMdd\'T\'HHmmss\'Z\'").withZone(ZoneId.of("UTC"));

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<CreateCommand> _filter = Iterables.<CreateCommand>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), CreateCommand.class);
    for (final CreateCommand e : _filter) {
      this.generateICSFile(e, fsa);
    }
  }

  public void generateICSFile(final CreateCommand command, final IFileSystemAccess2 fsa) {
    final StringBuilder icsContent = new StringBuilder();
    icsContent.append("BEGIN:VCALENDAR\n");
    icsContent.append("VERSION:2.0\n");
    icsContent.append("PRODID:-//hacksw/handcal//NONSGML v1.0//EN\n");
    EList<Event> _events = command.getEvents();
    for (final Event event : _events) {
      {
        icsContent.append("BEGIN:VEVENT\n");
        String _name = event.getName();
        String _plus = ("SUMMARY:" + _name);
        String _plus_1 = (_plus + "\n");
        icsContent.append(_plus_1);
        String _convertToICSTimeFormat = this.convertToICSTimeFormat(event.getStartTime());
        String _plus_2 = ("DTSTART:" + _convertToICSTimeFormat);
        String _plus_3 = (_plus_2 + "\n");
        icsContent.append(_plus_3);
        String _convertToICSTimeFormat_1 = this.convertToICSTimeFormat(event.getEndTime());
        String _plus_4 = ("DTEND:" + _convertToICSTimeFormat_1);
        String _plus_5 = (_plus_4 + "\n");
        icsContent.append(_plus_5);
        String _location = event.getLocation();
        boolean _tripleNotEquals = (_location != null);
        if (_tripleNotEquals) {
          String _location_1 = event.getLocation();
          String _plus_6 = ("LOCATION:" + _location_1);
          String _plus_7 = (_plus_6 + "\n");
          icsContent.append(_plus_7);
        }
        String _description = event.getDescription();
        boolean _tripleNotEquals_1 = (_description != null);
        if (_tripleNotEquals_1) {
          String _description_1 = event.getDescription();
          String _plus_8 = ("DESCRIPTION:" + _description_1);
          String _plus_9 = (_plus_8 + "\n");
          icsContent.append(_plus_9);
        }
        String _link = event.getLink();
        boolean _tripleNotEquals_2 = (_link != null);
        if (_tripleNotEquals_2) {
          String _link_1 = event.getLink();
          String _plus_10 = ("URI:" + _link_1);
          String _plus_11 = (_plus_10 + "\n");
          icsContent.append(_plus_11);
        }
        Person _organizer = event.getOrganizer();
        boolean _tripleNotEquals_3 = (_organizer != null);
        if (_tripleNotEquals_3) {
          String _name_1 = event.getOrganizer().getName();
          String _plus_12 = ("ORGANIZER;CN=" + _name_1);
          String _plus_13 = (_plus_12 + ":mailto:");
          String _email = event.getOrganizer().getEmail();
          String _plus_14 = (_plus_13 + _email);
          String _plus_15 = (_plus_14 + "\n");
          icsContent.append(_plus_15);
        }
        EList<Person> _invitees = event.getInvitees();
        boolean _tripleNotEquals_4 = (_invitees != null);
        if (_tripleNotEquals_4) {
          EList<Person> _invitees_1 = event.getInvitees();
          for (final Person person : _invitees_1) {
            String _generateAttendeeField = this.generateAttendeeField(person);
            String _plus_16 = (_generateAttendeeField + "\n");
            icsContent.append(_plus_16);
          }
        }
        RecurRule _recur = event.getRecur();
        boolean _tripleNotEquals_5 = (_recur != null);
        if (_tripleNotEquals_5) {
          String _generateRecurRule = this.generateRecurRule(event);
          String _plus_17 = (_generateRecurRule + "\n");
          icsContent.append(_plus_17);
        }
        Reminder _reminder = event.getReminder();
        boolean _notEquals = (!Objects.equal(_reminder, Integer.valueOf(0)));
        if (_notEquals) {
          icsContent.append("BEGIN:VALARM\n");
          int _time = event.getReminder().getTime();
          String _plus_18 = ("TRIGGER:-PT" + Integer.valueOf(_time));
          String _plus_19 = (_plus_18 + "M\n");
          icsContent.append(_plus_19);
          icsContent.append("ACTION:DISPLAY\n");
          String _title = event.getReminder().getTitle();
          boolean _tripleNotEquals_6 = (_title != null);
          if (_tripleNotEquals_6) {
            String _title_1 = event.getReminder().getTitle();
            String _plus_20 = ("DESCRIPTION:" + _title_1);
            String _plus_21 = (_plus_20 + "\n");
            icsContent.append(_plus_21);
          } else {
            String _name_2 = event.getName();
            String _plus_22 = ("DESCRIPTION: Reminder about " + _name_2);
            String _plus_23 = (_plus_22 + "\n");
            icsContent.append(_plus_23);
          }
          icsContent.append("END:VALARM\n");
        }
        icsContent.append("END:VEVENT\n");
      }
    }
    icsContent.append("END:VCALENDAR");
    String _name = command.getName();
    String _plus = ("ics-gen/" + _name);
    final String fileName = (_plus + ".ics");
    fsa.generateFile(fileName, icsContent.toString());
  }

  public String generateAttendeeField(final Person person) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ATTENDEE;CN=\"");
    String _name = person.getName();
    _builder.append(_name);
    _builder.append("\":MAILTO:");
    String _email = person.getEmail();
    _builder.append(_email);
    return _builder.toString();
  }

  public String generateRecurRule(final Event event) {
    String _switchResult = null;
    RecurRule _recur = event.getRecur();
    if (_recur != null) {
      switch (_recur) {
        case DAILY:
          _switchResult = "RRULE:FREQ=DAILY";
          break;
        case WEEKLY:
          _switchResult = "RRULE:FREQ=WEEKLY";
          break;
        case MONTHLY:
          _switchResult = "RRULE:FREQ=MONTHLY";
          break;
        case YEARLY:
          _switchResult = "RRULE:FREQ=YEARLY";
          break;
        case BYDAY:
          DaysOfWeek _daysOfWeek = event.getDaysOfWeek();
          boolean _tripleNotEquals = (_daysOfWeek != null);
          if (_tripleNotEquals) {
            final Function1<WEEKDAY, String> _function = (WEEKDAY day) -> {
              String _switchResult_1 = null;
              if (day != null) {
                switch (day) {
                  case MO:
                    _switchResult_1 = "MO";
                    break;
                  case TU:
                    _switchResult_1 = "TU";
                    break;
                  case WE:
                    _switchResult_1 = "WE";
                    break;
                  case TH:
                    _switchResult_1 = "TH";
                    break;
                  case FR:
                    _switchResult_1 = "FR";
                    break;
                  case SA:
                    _switchResult_1 = "SA";
                    break;
                  case SU:
                    _switchResult_1 = "SU";
                    break;
                  default:
                    _switchResult_1 = "";
                    break;
                }
              } else {
                _switchResult_1 = "";
              }
              return _switchResult_1;
            };
            final String days = IterableExtensions.join(ListExtensions.<WEEKDAY, String>map(event.getDaysOfWeek().getDays(), _function), ",");
            return ("RRULE:FREQ=WEEKLY;BYDAY=" + days);
          } else {
            return "";
          }
        default:
          _switchResult = "";
          break;
      }
    } else {
      _switchResult = "";
    }
    return _switchResult;
  }

  public String convertToICSTimeFormat(final String userInputTime) {
    try {
      final LocalDateTime dateTime = LocalDateTime.parse(userInputTime, this.userInputFormatter);
      return this.icsFormatter.format(dateTime);
    } catch (final Throwable _t) {
      if (_t instanceof DateTimeParseException) {
        System.err.println(("Failed to parse date time: " + userInputTime));
        return "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
