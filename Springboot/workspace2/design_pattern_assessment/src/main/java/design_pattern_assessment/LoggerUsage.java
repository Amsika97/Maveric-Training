package design_pattern_assessment;

public class LoggerUsage {

	public static void main(String[] args) {

		ILogger logger = new LoggerImpl();
		
		ILogger Logger = new LoggerWithDateTimeDecorator(logger);

		Logger.info("successful");
		Logger.error("something went wrong");
	}
}
