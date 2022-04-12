package com.mycompany.app;

import java.util.ArrayList;

public class Main {
    //File name to store the data
    public static String fileName = "list.txt";

    public static boolean defineUserMode(String[] args){
        if(args.length == 0){
            return true;
        } else {
            return false;
        }
    };

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        InterMode interUserMode = new InterMode();
        ComlineMode comlineUserMode = new ComlineMode();
        boolean mode = defineUserMode(args);

        if (mode) {
            interUserMode.printMenu();
            interUserMode.interactiveMainLoop(list);

            System.out.println(list);
        } else {
            comlineUserMode.printHello();
        }
    }
}









/*
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
}*/
