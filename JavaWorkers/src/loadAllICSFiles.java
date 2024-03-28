public void loadAllICSFiles() {
    File currentDir = new File("."); // Current directory
    File[] filesList = currentDir.listFiles((dir, name) -> name.endsWith(".ics"));
    if (filesList != null) {
        for (File file : filesList) {
            String id = file.getName().replaceAll(".ics$", ""); // Use filename as ID, removing ".ics"
            // Assuming a method to load or parse the ICS file into a Schedule object
            Schedule schedule = loadICStoSchedule(file);
            registry.put(id, schedule);
        }
    }
}