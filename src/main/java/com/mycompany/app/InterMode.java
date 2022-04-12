package com.mycompany.app;

import java.util.ArrayList;
import java.util.Scanner;

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

    public ArrayList interactiveMainLoop(ArrayList<String> arrayList) {
        String userChoice = "";
        while (!userChoice.equals("4")) {
            userChoice = this.readString();
            switch (userChoice) {
                case "1":
                    if(!arrayList.isEmpty()) {
                        todo.showTasks(arrayList);
                    } else {
                        System.out.println("List is empty");
                    }
                    break;
                case "2":
                    System.out.println("Enter new task\n");
                    String newTask = this.readString();
                    todo.addTask(arrayList, newTask);
                    System.out.println("New task added successfully\n");
                    break;
                case "3":
                    if(!arrayList.isEmpty()) {
                        System.out.println("Current task list: ");
                        for (int i = 0; i < arrayList.size(); i++) {
                            String s = arrayList.get(i);
                            System.out.println((i + 1) + " " + s);
                        }
                        System.out.println("Enter task number to delete");
                        int num = this.readInt();
                        if ((num <= arrayList.size()) && (num != -1)){
                            todo.deleteTask(arrayList, num -1);
                            System.out.println("Task removed from the list!");
                        } else {
                            System.out.println("Wrong input");
                        }
                    } else
                        System.out.println("There are currently no tasks!");
                    break;
                case "4":
                    //
                    break;
                default:
                    ;
                    //
            }
        }
    return new ArrayList();
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
