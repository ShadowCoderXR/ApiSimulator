package com.demo.apisimulator.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil {
    public static void logRequest(String uri, String body) {
        try {
            String folderName = uri.substring(uri.lastIndexOf('/') + 1);
            String logDir = "logs/" + folderName;
            Files.createDirectories(Paths.get(logDir));
            String logFileName = logDir + "/log_" + LocalDate.now() + ".log";
            String logEntry = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " - " + body + "\n";
            Files.write(Paths.get(logFileName), logEntry.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
