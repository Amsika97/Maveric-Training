package Core_Java_Topics;

public class EnumExample {
	// Enums declaration
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Enum in switch statement
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
        }

        // Looping through all enum constants
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

}
