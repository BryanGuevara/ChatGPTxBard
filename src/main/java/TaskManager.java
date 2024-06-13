package main.java;

import java.util.Scanner;

public class TaskManager {
    private TaskList taskList;
    private Scanner scanner;

    public TaskManager() {
        taskList = new TaskList();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    markTaskAsCompleted();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("\nTask Manager Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. List Tasks");
        System.out.println("4. Mark Task as Completed");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addTask() {
        System.out.print("Enter task ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task task = new Task(id, description);
        taskList.addTask(task);
        System.out.println("Task added successfully.");
    }

    private void removeTask() {
        System.out.print("Enter task ID to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        taskList.removeTask(id);
        System.out.println("Task removed successfully.");
    }

    private void listTasks() {
        System.out.println("Current tasks:");
        for (Task task : taskList.getTasks()) {
            System.out.println(task);
        }
    }

    private void markTaskAsCompleted() {
        System.out.print("Enter task ID to mark as completed: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Task task : taskList.getTasks()) {
            if (task.getId() == id) {
                task.markAsCompleted();
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
