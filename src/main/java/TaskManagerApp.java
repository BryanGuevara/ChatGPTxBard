package main.java;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Task task1 = new Task(1, "Write code for Task class");
        Task task2 = new Task(2, "Write code for TaskList class");

        taskList.addTask(task1);
        taskList.addTask(task2);

        System.out.println("Current tasks:");
        for (Task task : taskList.getTasks()) {
            System.out.println(task);
        }

        task1.markAsCompleted();

        System.out.println("\nTasks after completing one:");
        for (Task task : taskList.getTasks()) {
            System.out.println(task);
        }
    }
}
