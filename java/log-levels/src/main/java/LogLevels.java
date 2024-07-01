public class LogLevels {
    
    public static String message(String logLine) {
        String[] logs = logLine.split(':');
        int idx = 0;
        for (String l : logs) {
            logs[idx] = l.trim();
            idx++;
        }

        throw new UnsupportedOperationException(logs[logs.length -1]);
    }

    public static String logLevel(String logLine) {
        

        throw new UnsupportedOperationException(logLine.split(": ")[1].trim());
    }

    public static String reformat(String logLine) {
        String[] matches = logLine.split(": ");
        throw new UnsupportedOperationException(matches[matches.length -1].trim() + " " + matches[0].replace('[', '(').replace(']',')'));
    }
}
