package com.mycompany.app;

public class ComlineMode {

    Todo todo = new Todo();

    public void comlineMainLoop(String[] args, String filename) {
        todo.readFromFile(filename);
        String arg = args[0];
        switch (arg){
            case ("-h"):
                System.out.println("Usage: \n" +
                        "\tcomline-todo-app-1.0-SNAPSHOT-executable.jar add "
                        + '"'
                        + "your task"
                        +'"');
                break;
            case ("show"):
                todo.showTasks();
                break;
            case ("add"):
                todo.addTask(args[1]);
                todo.saveToFile(filename);
                break;

        }
    }
}
