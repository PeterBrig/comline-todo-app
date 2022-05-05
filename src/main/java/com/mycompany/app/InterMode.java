package com.mycompany.app;

import java.util.Scanner;

import static com.mycompany.app.Main.fileName;

public class InterMode {

    Todo todo = new Todo();

    private final String flushLine = "\033[1F\33[K";
    private final String mainMenu =   "\n\t\tMenu\n\n"
            + "\t1 - List tasks\n"
            + "\t2 - Add task\n"
            + "\t3 - Delete task\n"
            + "\t4 - Save changes\n"
            + "\t5 - Exit\n";

    //Prints main menu
    public void printMenu() {
        System.out.println(mainMenu);
    }

    public void interactiveMainLoop() {
        String userChoice = "";
        todo.readFromFile(fileName);
        while (!userChoice.equals("5")) {
            userChoice = this.readString();
            System.out.print(flushLine);
            switch (userChoice) {
                case "1":
                    todo.showTasks();
                    break;
                case "2":
                    System.out.println("\nEnter new task\n");
                    String newTask = this.readString();
                    System.out.print(flushLine);
                    todo.addTask(newTask);
                    System.out.println("\nNew task added successfully\n");
                    break;
                case "3":
                    System.out.println("\nEnter task number to delete");
                    int num = this.readInt();
                    System.out.print(flushLine);
                    todo.deleteTask(num);
                    break;
                case "4":
                    todo.saveToFile(fileName);
                    break;
                case "5":
                default:
                    System.exit(0);

                    ;
                    //
            }
        }
    }

    private String readString() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    private int readInt() {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt())
             return scan.nextInt();
        return -1;
    }
}
