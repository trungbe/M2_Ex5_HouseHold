import java.util.Scanner;

public class Main {
    public static final int MIN_VALUE_OF_YEAR = 1921;
    public static final int CURRENT_YEAR = 2021;
    public static Town town = new Town();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new household");
            System.out.println("2. Display household that has old age 80");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter number household ");
                    int numberOfHousehold = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numberOfHousehold; i++) {
                        addNewHousehold();
                    }
                    break;
                case 2:
                    town.displayHouseholdPersonOldAge();
                    break;
                case 0:
            }
        } while (choice != 0);

    }

    public static void addNewHousehold() {
        System.out.println("Enter house number");
        int houseNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of person in household");
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        Household household = new Household(numberOfPerson, houseNumber);
        addNewPerson(numberOfPerson, household);
        town.addNewHousehold(household);
    }

    private static void addNewPerson(int numberOfPerson, Household household) {
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            int yearOfBirth;
            do {
                System.out.println("Enter year of birth");
                yearOfBirth = Integer.parseInt(scanner.nextLine());
            } while (yearOfBirth < MIN_VALUE_OF_YEAR && yearOfBirth > CURRENT_YEAR);
            System.out.println("enter job");
            String job = scanner.nextLine();
            Person person = new Person(name, yearOfBirth, job);
            household.addNewPerson(person);
        }
    }
}
