package com.mycompany.app;

import java.util.Scanner;

public class Main {
    //File name to store the data
    public static String fileName = "list.txt";

    public static void main(String[] args) {

        Todo todo = new Todo();

        todo.printMenu();

        String userChoice = "";
        Scanner inp = new Scanner(System.in);

        while (!userChoice.equals("4")) {
            userChoice = inp.nextLine();
            switch (userChoice) {
                case "1":
                    todo.showTasks();
                    break;
                case "2":
                    todo.addTask();
                    break;
                case "3":
                    todo.deleteTask();
                    break;
                default:
                    todo.bye();
                    System.exit(0);
            }
        }
    }
}
