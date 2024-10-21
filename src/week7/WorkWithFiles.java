package week7;

import java.io.*;
import java.util.Scanner;

public class WorkWithFiles {
    private static final String USERS_FILE = "users.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println(
                    "1. Sign up\n2. Login\n3. Exit"
            );
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                signUp(scanner);
            } else if (option == 2) {
                signIn(scanner);
            } else if (option == 0) {
                break;
            }
        }
    }

    private static void signUp(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (userExists(name)) {
            System.out.println("User already exists!");
        } else {
            addUser(name, password);
            System.out.println("User registered successfully!");
        }
    }

    private static void signIn(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (checkCredentials(name, password)) {
            System.out.println("Sign in successful!");
        } else {
            System.out.println("Invalid name or password!");
        }
    }

    private static boolean userExists(String name) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(USERS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(" ");
                if (userData[1].equals(name)) {
                    return true;
                }
            }
        } catch (IOException e) {
            return false;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return false;
    }

    private static boolean checkCredentials(String name, String password) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(USERS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(" ");
                if (userData[1].equals(name) && userData[2].equals(password)) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (IOException e) {
            return false;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return false;
    }

    private static void addUser(String name, String password) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(USERS_FILE, true));
            int id = getNextId();
            writer.write(id + " " + name + " " + password);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static int getNextId() {
        int maxId = 0;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(USERS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(" ");
                int id = Integer.parseInt(userData[0]);
                if (id > maxId) {
                    maxId = id;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return maxId + 1;
    }
}
