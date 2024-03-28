import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;

public class ICSFileLoader {
    public ICSFileLoader() {
        super(); // Call to the super constructor
    }

    public Map<String, File> loadICSFiles(String directoryPath) {
        File dir = new File(directoryPath);
        File[] files = dir.listFiles((dir1, name) -> name.toLowerCase().endsWith(".ics"));

        Map<String, File> icsFiles = new HashMap<>();
        if (files != null) {
            for (File file : files) {
                String id = file.getName(); // Or any other ID mechanism
                icsFiles.put(id, file);
            }
        }
        return icsFiles;
    }
}
