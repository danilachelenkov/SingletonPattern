package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println(String.format("[%s %s ] %s", getDateTime(), num++, msg));
    }

    private String getDateTime() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS").format(new Date());
    }
}
