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
2) (anticipated) flexible operations such as split, merge and modification of schedules using imperative syntax
3) (anticipated) programmable interface (as CLI or libraries) 
4) (anticipated) subscriber list control

## Dependencies

1) Eclipse IDE
2) Xtext Framework


## DSL Guide: Creating Schedules and Events

`ICS Helper` allows users to define schedules, which are collections of events. Each event can have various properties, including a start and end time, location, description, recurrence rules, and associated people like organizers and invitees. Additionally, reminders can be set for events.

Each `schedule` defined will be transformed into an ics file, named <schedule_name>.ics.

### Syntax

#### Create Command

To define a new `schedule`:

```
create schedule [name] {
    [event]
    [event]
    ...
}
```

* [name]: The identifier for the schedule. Must be unique within scope.
* [event]: event definitions. See below `event` section.

#### event

To define an `event` within a `schedule`:

```
event [name] 
start [startTime] 
end [endTime] 
[optional properties]
```

* [name]: The identifier for the event.
* [startTime], [endTime]: Start and end times for the event, specified as strings. Should follow `YYYY-MM-DD HH-MM-SS` format.
* [optional properties]: Zero or more of the following optional properties:

```
location [location]
description [description]
recur [recurRule]
link [link]
organizer [person]
invitees { [person]... }
reminder [reminder]
```

* [description]: A text description of the event.
* [recurRule]: The recurrence rule for the event. See below section `recurRule`.
* [person]: See section `person`.
* [reminder]: See section `reminder`.

#### RecurRule

Defines the recurrence pattern for an event:

```
daily | weekly | monthly | yearly | 'weekly on' [day]
```

* [day]: One or more days of the week, separated by commas. 
For example, defining recurring rules happening weekly on Monday and Thursday would be:
```
recur weekly on Monday,Thursday
```

#### person

To represent a `person` involved in an event (`organizer` or `invitee`):

```
name [name] email [email]
```

* [name]: The person's name.
* [email]: The person's email address.

#### reminder

To define a reminder for an event:

```
time [minutes ahead] 
(optional) title [title]
```
* [minutes ahead]: Time before the event (in minutes) when the reminder should occur. Default is 30 if not specified.
* [title]: An optional title for the reminder.



### Example

```
create schedule picnic {
	event pickup 
	start '2024-03-30 14:30' 
	end '2024-03-30 15:00' 
	location '417 Heaven St'
	recur weekly
	link 'https://github.com/Gudauu/ICS-Helper/'
	organizer name 'Wild Cranberry' email 'WildCran@gmail.com'
	invitees {
		name 'berry' email 'berryBean@gmail.com'
		name 'potato' email 'potatoSoup@gmail.com'
		name 'tomato' email 'tomatodoge@gmail.com'
	}
	reminder time 100 title 'Someone is picking u up!'
	
	
	event cleanup 
	start '2024-03-31 15:10' 
	end '2024-03-31 16:00' 
	description 'cleanup the mess you made!'
	recur weekly on Wednesday,Sunday,Monday
	link '12345'
	organizer name 'Alice' email "alicePaul@gmail.com"
}
```
This will create an ics file `picnic.ics` with the below content:
```
BEGIN:VCALENDAR
VERSION:2.0
PRODID:-//hacksw/handcal//NONSGML v1.0//EN
BEGIN:VEVENT
SUMMARY:pickup
DTSTART:20240330T143000Z
DTEND:20240330T150000Z
LOCATION:417 Heaven St
URI:https://github.com/Gudauu/ICS-Helper/
ORGANIZER;CN=Wild Cranberry:mailto:WildCran@gmail.com
ATTENDEE;CN="berry":MAILTO:berryBean@gmail.com
ATTENDEE;CN="potato":MAILTO:potatoSoup@gmail.com
ATTENDEE;CN="tomato":MAILTO:tomatodoge@gmail.com
RRULE:FREQ=WEEKLY
BEGIN:VALARM
TRIGGER:-PT100M
ACTION:DISPLAY
DESCRIPTION:Someone is picking u up!
END:VALARM
END:VEVENT
BEGIN:VEVENT
SUMMARY:cleanup
DTSTART:20240331T151000Z
DTEND:20240331T160000Z
DESCRIPTION:cleanup the mess you made!
ORGANIZER;CN=Alice:mailto:alicePaul@gmail.com
RRULE:FREQ=WEEKLY;BYDAY=WE,SU,MO
END:VEVENT
END:VCALENDAR
```


















