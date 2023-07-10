import java.util.Scanner;
public class BirthDateTime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int year = SafeInput.getRangedInt(scanner, "Enter the year of birth", 1950, 2015);
            int month = SafeInput.getRangedInt(scanner, "Enter the month of birth", 1, 12);
            int day = 0;

            switch (month) {
                case 2: // February
                    day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 29);
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 30);
                    break;
                default: // Other months
                    day = SafeInput.getRangedInt(scanner, "Enter the day of birth", 1, 31);
                    break;
            }

            int hours = SafeInput.getRangedInt(scanner, "Enter the hours of birth", 1, 24);
            int minutes = SafeInput.getRangedInt(scanner, "Enter the minutes of birth", 1, 59);

            System.out.println("Birth Details:");
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);

            scanner.close();
        }
}
