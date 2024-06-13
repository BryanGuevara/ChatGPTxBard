package main.java;

public class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty.");
        }
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", description='" + description + '\'' + ", completed=" + completed + '}';
    }
}
