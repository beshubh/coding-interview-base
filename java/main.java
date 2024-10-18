import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;

class StorageReader {
    private List<String> filenames;

    public StorageReader(List<String> filenames) {
        this.filenames = filenames;
    }

    public List<String> getFilenames() {
        return filenames;
    }
}

class LogEntry {
    String filename;
    String content;
    int offset;

    public LogEntry(String filename, String content, int offset) {
        this.filename = filename;
        this.content = content;
        this.offset = offset;
    }
}

public class Main {
    public static SimpleEntry<Boolean, Integer> findLogSingle(StorageReader reader, String qtext, String targetTS) {
        /*
        Input:
        1. A target timestamp in the format `YYYYMMDD_HHMMSS`
        2. A search text string
        Output:
        - If the search text is found in the file:
            - Return `true`
            - The offset of the search text's start position in the file content string
        - If the search text is not found in the file:
            - Return `false`
            - `-1` to indicate the absence of the text
        */
        // Implementation omitted
        return new SimpleEntry<>(false, -1);
    }

    public static List<LogEntry> findLogsWithRange(String qtext, String fromTS, String toTS) {
        /*
        1. Input:
            - Two timestamps, `from` and `to`, in the format `YYYYMMDD_HHMMSS`.
            - A search `text` string.
        2. Output: A list of `filenames`, corresponding file `contents` & qtext's offset, that meet both criteria:
            - Fall within the specified timestamp range (including both boundaries).
            - Contain the given search text.
        3. Constraints:
            - The filenames are sorted in ascending order by timestamp.
            - Each log file contains some text content.
            - The system generates a large number of log files, making it impractical to list all files for filtering.
            - The solution should be efficient and scalable, capable of handling millions of log files.
        */
        // Implementation omitted
        return new ArrayList<>();
    }

    public static List<String> getFiles() {
        // Implement this function to return a list of filenames in the storage
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<String> filenames = getFiles();
        StorageReader reader = new StorageReader(filenames);

        SimpleEntry<Boolean, Integer> result = findLogSingle(reader, "hello", "20240101_003000");
        System.out.printf("Found: %b, Offset: %d%n", result.getKey(), result.getValue());
    }
}