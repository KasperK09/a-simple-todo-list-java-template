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
            System.out.println("can't add an empty task.");
            return;
        }

        tasks.add(task);
    }

    public void complete(String task) {
        if (task == null || task.trim().isEmpty()) {
            System.out.println("invalid task.");
            return;
        }

        if (tasks.contains(task)) {
            tasks.remove(task);
            completedTasks.add(task);
        } else if (completedTasks.contains(task)) {
            System.out.println("task is already complete.");
        } else {
            System.out.println("task was not found.");
        }
    }

    public void all() {
        if (tasks.isEmpty() && completedTasks.isEmpty()) {
            System.out.println("The todo list is empty.");
            return;
        }

        System.out.println("all tasks:");

        for (String task : tasks) {
            System.out.println("[ ] " + task);
        }

        for (String task : completedTasks) {
            System.out.println("[X] " + task);
        }
    }

    public void complete() {
        if (completedTasks.isEmpty()) {
            System.out.println("there are no completed tasks.");
            return;
        }

        System.out.println("completed tasks:");

        for (String task : completedTasks) {
            System.out.println("[X] " + task);
        }
    }

    public void incomplete() {
        if (tasks.isEmpty()) {
            System.out.println("there are no incomplete tasks.");
            return;
        }

        System.out.println("incomplete tasks:");

        for (String task : tasks) {
            System.out.println("[ ] " + task);
        }
    }

    public void clear() {
        tasks.clear();
        completedTasks.clear();
    }
}