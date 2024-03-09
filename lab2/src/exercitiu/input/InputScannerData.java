package exercitiu.input;

import exercitiu.datastorage.UserStorage;
import exercitiu.model.User;

import java.util.Scanner;

public class InputScannerData {
    private static Scanner scanner = new Scanner(System.in);
    private static UserStorage userStorage = new UserStorage();
    public static void main(String[] args) {


        while (true) {
            System.out.print("Enter Command >>> ");
            String command = scanner.nextLine();
            System.out.println("Command received: " + command);

            switch(command.toUpperCase()) {
                case "HELP":
                    help();
                    break;
                case "CREATE":
                    createUser();
                    break;
                case "UPDATE":
                    updateUser();
                    break;
                case "DELETE":
                    deleteUser();
                    break;
                case "GETUSER":
                    getUser();
                    break;
                case "GETUSERS":
                    getAllUsers();
                    break;
                case "GETNBOFUSERS":
                    getTotalNbOfUsers();
                    break;
                case "QUIT":
                    quit();
                    return;
                default:
                    System.out.println("Invalid command. Type 'help' for a list of commands.");
            }

        }
    }

    private static void help() {
        System.out.println("\n\tAccepted commands: \n\t\thelp: Instructions on how to use the application" +
                "\n\t\tcreate: Create data. Can receive two parameters: username and sold. " +
                "\n\t\tupdate: Update data. Can receive two parameters: username and sold. " +
                "\n\t\tdelete: Delete the user's data.  Receive the username. " +
                "\n\t\tgetUser: Return user's data.  Receive the username. " +
                "\n\t\tgetUsers: Return the list of all users. " +
                "\n\t\tgetNbOfUsers: Return the total number of users" +
                "\n\t\tquit: Close the application.\n\n");
    }


    private static void createUser() {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine();
        System.out.print("Sold: >>> ");
        int sold = Integer.parseInt(scanner.nextLine().trim());

        userStorage.createUser(new User(username, sold));
    }
    private static void updateUser() {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine();
        System.out.print("Sold: >>> ");
        int sold = scanner.nextInt();

        userStorage.updateUser(new User(username, sold));
    }

    private static void deleteUser() {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine();

        userStorage.deleteUser(username);
    }

    private static void getUser() {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine();

        userStorage.getUser(username);
    }

    private static void getAllUsers() {
        userStorage.getAllUsers();
    }

    private static void getTotalNbOfUsers() {
        int total = userStorage.getTotalOfUsers();
        System.out.println("Total number of users is: " + total);
    }

    private static void quit() {
        System.out.println("Bye bye");
    }
}
