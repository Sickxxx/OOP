package Lesson_05.HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg) {

        try (FileWriter file = new FileWriter("Log.log", true)) {
            Date currentTime = new Date();
            StringBuilder sb = new StringBuilder(msg);
            sb.append(currentTime + ": " + msg +"\n");
            file.append(sb);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
