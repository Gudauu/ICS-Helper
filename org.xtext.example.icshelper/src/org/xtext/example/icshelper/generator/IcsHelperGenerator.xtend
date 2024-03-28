package org.xtext.example.icshelper.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.icshelper.icsHelper.CreateCommand
import org.xtext.example.icshelper.icsHelper.Event

/**
 * Generates ICS files from your model files on save.
 */
class IcsHelperGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (e : resource.allContents.toIterable.filter(CreateCommand)) {
            generateICSFile(e, fsa)
        }
    }

    def generateICSFile(CreateCommand command, IFileSystemAccess2 fsa) {
        val StringBuilder icsContent = new StringBuilder()
        icsContent.append("BEGIN:VCALENDAR\n")
        icsContent.append("VERSION:2.0\n")
        icsContent.append("PRODID:-//hacksw/handcal//NONSGML v1.0//EN\n")
        
        for (event : command.events) {
            icsContent.append("BEGIN:VEVENT\n")
            icsContent.append("SUMMARY:" + event.name + "\n")
            icsContent.append("DTSTART:" + event.startTime + "\n")
            icsContent.append("DTEND:" + event.endTime + "\n")
            if (event.location !== null) {
                icsContent.append("LOCATION:" + event.location + "\n")
            }
            icsContent.append("END:VEVENT\n")
        }
        
        icsContent.append("END:VCALENDAR")
        
        // Generate the ICS file in the 'ics-gen' directory
        val fileName = "ics-gen/" + command.name + ".ics"
        fsa.generateFile(fileName, icsContent.toString)
    }
}
