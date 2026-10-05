package org.example;
//

public class App {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.add("Buy milk");
        list.add("Buy eggs");
        list.add("Prepare a lesson for CSC 122");
        list.add("Sow beet seeds");

        System.out.println("----- ALL TASKS -----");
        list.all();

        list.complete("Buy eggs");

        System.out.println("\n----- ALL TASKS -----");
        list.all();

        System.out.println("\n----- COMPLETED TASKS -----");
        list.complete();

        System.out.println("\n----- INCOMPLETE TASKS -----");
        list.incomplete();

        list.clear();

        System.out.println("\n----- AFTER CLEAR -----");
        list.all();
    }
}

