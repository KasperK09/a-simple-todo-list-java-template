package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

    @Test
    void itAddsATask() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");

        assertTrue(classUnderTest.all().contains("Buy milk"));
    }

    @Test
    void itCompletesATask() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");
        classUnderTest.complete("Buy milk");

        assertTrue(classUnderTest.complete().contains("Buy milk"));
    }

    @Test
    void itShowsIncompleteTasks() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");
        classUnderTest.add("Buy eggs");

        assertTrue(classUnderTest.incomplete().contains("Buy milk"));
        assertTrue(classUnderTest.incomplete().contains("Buy eggs"));
    }

    @Test
    void itShowsAllTasks() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");
        classUnderTest.add("Buy eggs");

        assertTrue(classUnderTest.all().contains("Buy milk"));
        assertTrue(classUnderTest.all().contains("Buy eggs"));
    }

    @Test
    void completedTaskIsNotIncomplete() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");
        classUnderTest.complete("Buy milk");

        assertFalse(classUnderTest.incomplete().contains("Buy milk"));
    }

    @Test
    void itClearsTheTodoList() {
        TodoList classUnderTest = new TodoList();

        classUnderTest.add("Buy milk");
        classUnderTest.add("Buy eggs");

        classUnderTest.clear();

        assertTrue(classUnderTest.all().isEmpty());
    }
}