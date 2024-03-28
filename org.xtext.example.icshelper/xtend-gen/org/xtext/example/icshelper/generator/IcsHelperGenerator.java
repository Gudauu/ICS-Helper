package org.xtext.example.icshelper.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.icshelper.icsHelper.CreateCommand;
import org.xtext.example.icshelper.icsHelper.Event;

/**
 * Generates ICS files from your model files on save.
 */
@SuppressWarnings("all")
public class IcsHelperGenerator extends AbstractGenerator {
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
        String _startTime = event.getStartTime();
        String _plus_2 = ("DTSTART:" + _startTime);
        String _plus_3 = (_plus_2 + "\n");
        icsContent.append(_plus_3);
        String _endTime = event.getEndTime();
        String _plus_4 = ("DTEND:" + _endTime);
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
        icsContent.append("END:VEVENT\n");
      }
    }
    icsContent.append("END:VCALENDAR");
    String _name = command.getName();
    String _plus = ("ics-gen/" + _name);
    final String fileName = (_plus + ".ics");
    fsa.generateFile(fileName, icsContent.toString());
  }
}
