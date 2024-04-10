# ICS helper 

## Introduction:
An ICS file is a calendar file saved in a universal calendar format used by mainstream email and calendar apps, including Microsoft Outlook, Google Calendar, and Apple Calendar. By importing ICS file into calendar apps, a new schedule(composed of one or more events) can be added. People can subscribe to schedules by url. Right now the only way to manipulate ICS files (other than writing the protocol by hand) is to edit schedules inside calendar apps / helpers, and then export.

## Features
1) easy creation of schedules outside the app environment
2) mass operation (e.g. delay 100 events by an hour) 
3) programmable access (e.g. work flow automation)
4) granular control(e.g. split and merge of events across schedules)

We propose the idea of `ICS Helper`, which is a DSL dealing with ICS files. It offers:

1) human-friendly syntax for ICS creation (write in plain text & compile to ICS)
2) flexible operations such as split, merge and modification of schedules using imperative syntax
3) (advanced) programmable interface (as CLI or libraries) 
4) (advanced) subscriber list control

## Dependencies and Prerequisites

1) Java Development Kit (JDK): A recent version of JDK (such as OpenJDK or Oracle JDK) is required to compile and run Java applications.
2) Xtext Framework: Used for developing the DSL. Xtext is a framework for development of programming languages and domain-specific languages.
3) Eclipse IDE: Typically, Xtext is used within the Eclipse IDE, which provides tools and integration for DSL development.
4) Gradle or Maven: These are build automation tools used for managing dependencies and building Java projects. Xtext supports integration with both.
5) Git: For version control.
6) Basic Java and DSL Knowledge: Users should have a basic understanding of Java programming and familiarity with domain-specific languages.

## DSL Usage: Creating Schedules and Events

## SYNTAX:
CreateCommand:
    'create' 'schedule' name=ID '{'
        events+=Event*
    '}';

Event:
    'event' name=ID 
    'start' startTime=STRING 
    'end' endTime=STRING 
    ('location' location=STRING)?
    ('description' description=STRING)?
    ('recur' recur=RecurRule (daysOfWeek=DaysOfWeek)?)?
    ('link' link=STRING)?
    ('organizer' organizer=Person)?
    ('invitees' '{' invitees+=Person+ '}')?
    ('reminder' reminder=Reminder)?;

Reminder:
	'time' time=INT
	('title' title=STRING)?
;

Person:
	'name' name=STRING
	'email' email=STRING
;
enum RecurRule:
    DAILY = 'daily' |
    WEEKLY = 'weekly' |
    MONTHLY = 'monthly' |
    YEARLY = 'yearly'|
    BYDAY = 'weekly on';

DaysOfWeek: days+=WEEKDAY (',' days+=WEEKDAY)*; // Example: "on Monday,Wednesday,Friday"

enum WEEKDAY:
	MO = 'Monday' |
	TU = 'Tuesday' |
	WE = 'Wednesday' |
	TH = 'Thursday' |
	FR = 'Friday' |

# Syntax Explaination

Imagine you have this magical notebook, a little like a personal assistant, that helps you plan and remember special events.

# Creating a Schedule:
Think of this as starting a new chapter in your book. For example, if you write "create schedule: My Fun Week", it's like you're dedicating a section of your notebook just for the fun activities you have planned for a week.

# Drawing an Event: 
Whenever you want to note down an event, you begin with "event" and name it. Let's say "event: Birthday Party". It's like adding a new story to your chapter.

# Timing Details: 
Just like in a diary, you specify when things start and end. Writing "start: 10 AM, end: 1 PM" tells your magic notebook exactly when your birthday party will be happening.

# Location: 
Adding a "location" is like drawing a small map in your notebook. So, if your event is "at the park", your notebook knows exactly where it’s set.

# Describing the Event: 
With "description", you add details to your story. "Sam's 6th Birthday" gives your notebook a bit more about what this event is all about.

# Recurring Events: 
Using "recur", you can tell your notebook about events that happen regularly. It's like setting up a repeating reminder, for example, "soccer game every Saturday".

# Web Link: 
If you have any online meeting link for a long-distance relative who is not able to attend the party they can attend the party using this link.

# Drawing People:
For the organizer and invitees, you can write their names. It's your way of showing who's hosting the event and who's invited.

# Setting Reminders:
Lastly, you can set reminders for each event. It's like your notebook gently nudging you, so you don't forget the important stuff.
















