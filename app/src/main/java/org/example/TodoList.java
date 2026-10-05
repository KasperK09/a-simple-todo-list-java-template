package org.example;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    private ArrayList<String> completedTasks;

    public TodoList() {
        tasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
    }

    public void add(String task) {
        if (task == null || task.trim().isEmpty()) {
            return;
        }

        tasks.add(task);
    }

    public void complete(String task) {
        if (task == null || task.trim().isEmpty()) {
            return;
        }

        if (tasks.contains(task)) {
            tasks.remove(task);
            completedTasks.add(task);
        }
    }

    public ArrayList<String> all() {
        ArrayList<String> result = new ArrayList<>();

        result.addAll(tasks);
        result.addAll(completedTasks);

        return result;
    }

    public ArrayList<String> complete() {
        return completedTasks;
    }

    public ArrayList<String> incomplete() {
        return tasks;
    }

    public void clear() {
        tasks.clear();
        completedTasks.clear();
    }
}