package main.java;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        if (tasks.stream().anyMatch(t -> t.getId() == task.getId())) {
            throw new IllegalArgumentException("Task with the same ID already exists.");
        }
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{tasks=" + tasks + '}';
    }
}
