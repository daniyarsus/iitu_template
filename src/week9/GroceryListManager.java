package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryListManager {
    private static final ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nДоступные действия:");
            System.out.println("0 - завершить работу");
            System.out.println("1 - добавить товар в список");
            System.out.println("2 - удалить товар из списка");
            System.out.print("Введите номер действия, которое хотите выполнить: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                running = false;
                System.out.println("Завершение работы...");
            } else if (choice == 1) {
                addItem(scanner);
            } else if (choice == 2) {
                removeItem(scanner);
            } else {
                System.out.println("Неверный выбор. Введите 0, 1 или 2.");
            }

            printList();
        }

        scanner.close();
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Введите название товара для добавления: ");
        String item = scanner.nextLine().trim();

        if (groceryList.contains(item)) {
            System.out.println("Товар уже есть в списке.");
        } else {
            groceryList.add(item);
            System.out.println("Товар добавлен.");
        }

        Collections.sort(groceryList);
    }

    private static void removeItem(Scanner scanner) {
        System.out.print("Введите название товара для удаления: ");
        String item = scanner.nextLine().trim();

        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Товар удален.");
        } else {
            System.out.println("Товар не найден в списке.");
        }

        Collections.sort(groceryList);
    }

    private static void printList() {
        System.out.println("Текущий список покупок:");
        for (String item : groceryList) {
            System.out.println("- " + item);
        }
    }
}
