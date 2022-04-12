package com.mycompany.app;

import java.util.Scanner;

import static com.mycompany.app.Main.fileName;

public class InterMode {

    Todo todo = new Todo();

    private final String mainMenu =   "\n\t\tMenu\n\n"
            + "\t1 - List tasks\n"
            + "\t2 - Add task\n"
            + "\t3 - Delete task\n"
            + "\t4 - Exit\n";

    //Prints main menu
    public void printMenu() {
        System.out.println(mainMenu);
    }

    public void interactiveMainLoop() {
        String userChoice = "";
        todo.readFromFile(fileName);
        while (!userChoice.equals("4")) {
            userChoice = this.readString();
            switch (userChoice) {
                case "1":
                    todo.showTasks();
                    break;
                case "2":
                    System.out.println("Enter new task\n");
                    String newTask = this.readString();
                    todo.addTask(newTask);
                    System.out.println("New task added successfully\n");
                    break;
                case "3":
                    System.out.println("Enter task number to delete");
                    int num = this.readInt();
                    todo.deleteTask(num);
                    System.out.println("Task removed from the list!");
                    break;
                case "4":
                    System.exit(0);
                case "5":
                    System.out.println("Save changes to file");
                    todo.saveToFile(fileName);
                    break;
                default:
                    ;
                    //
            }
        }
    }

    public String readString() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public int readInt() {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt())
             return scan.nextInt();
        return -1;
    }
}
