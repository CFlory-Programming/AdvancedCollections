import java.util.*;

public class Tester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("What would you like to do?\n" +
                    "1. Add a node to the end of the list\n" +
                    "2. Add a node to the beginning of the list\n" +
                    "3. Remove a node from the end of the list\n" +
                    "4. Remove a node from the beginning of the list\n" +
                    "5. Print the list\n" +
                    "6. Exit");
            try {
                int choice = scanner.nextInt();
                if (choice < 1 || choice > 6) {
                    System.out.println("Invalid input. Please enter a number between 1 and 6.");
                    scanner.next();
                    continue;
                }
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the string to be added to the end of the list:");
                        String valueEnd = scanner.nextLine();
                        list.addToEnd(valueEnd);
                        break;
                    case 2:
                        System.out.println("Enter the string to be added to the beginning of the list:");
                        String valueBeginning = scanner.nextLine();
                        list.addToBegin(valueBeginning);
                        break;
                    case 3:
                        list.deleteEnd();
                        break;
                    case 4:
                        list.deleteBegin();
                        break;
                    case 5:
                        list.printList();
                        break;
                    case 6:
                        continueProgram = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.next();
                continue;
            }
        }
        scanner.close();
    }
}
