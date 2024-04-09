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
