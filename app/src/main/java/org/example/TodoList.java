package org.example;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    private ArrayList<String> completedTasks;

    public TodoList() {
        tasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
    }
}
