package design_pattern_assessment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerWithDateTimeDecorator implements ILogger {

    private final ILogger originalLogger;

    public LoggerWithDateTimeDecorator(ILogger originalLogger) {
        this.originalLogger = originalLogger;
    }

    @Override
    public void info(String msg) {
        String formattedMsg = getFormattedLogMessage("Info", msg);
        originalLogger.info(formattedMsg);
    }

    @Override
    public void error(String msg) {
        String formattedMsg = getFormattedLogMessage("Error", msg);
        originalLogger.error(formattedMsg);
    }

    private String getFormattedLogMessage(String level, String msg) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());
        return level + "-" + timestamp + ": " + msg;
    }
}