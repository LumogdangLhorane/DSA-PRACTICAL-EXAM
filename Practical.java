//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html


import java.util.Scanner;
import java.util.Stack;

public class Practical {
    public static void main(String[] args) {
        Stack<String> history = new Stack <String> ();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- Browser History ---");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back to Last Page");
            System.out.println("3. Delete All History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = scanner.nextLine();
                    history.push(url);
                    System.out.println("Page added to history.");
                    break;
                case 2:
                    if (!history.isEmpty()) {
                        System.out.println("Last visited page: " + history.pop());
                    } else {
                        System.out.println("No history available.");
                    }
                    break;
                case 3:
                    history.clear();
                    System.out.println("All history deleted.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}

