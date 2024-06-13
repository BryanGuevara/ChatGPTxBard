package main.java;

// src/main/java/TaskManagerApp.java
public class TaskManagerApp {
    public static void main(String[] args) {
        try {
            TaskList taskList = new TaskList();
            Task task1 = new Task(1, "Write code for Task class");
            Task task2 = new Task(2, "Write code for TaskList class");

            taskList.addTask(task1);
            taskList.addTask(task2);

            // Rest of the code...
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

