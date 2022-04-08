package com.mycompany.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private ArrayList<String> list;
    private final String mainMenu = ANSI_CYAN
                                  + "\n\t\tMenu\n\n"
                                  + "\t1 - List tasks\n"
                                  + "\t2 - Add task\n"
                                  + "\t3 - Delete task\n"
                                  + "\t4 - Exit\n"
                                  + ANSI_RESET;
    //Creates array list
    public Todo() {
        list = new ArrayList<>();
    }
    //Prints main menu
    public void printMenu() {
        System.out.println(mainMenu);
    }
    public void bye() {
        System.out.println(ANSI_PURPLE + "Bye!" + ANSI_RESET);
    }

    //Prints tasks from current list
    public void showTasks(){
        if(!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                System.out.println((i + 1) + " " + s);
            }
        } else System.out.println(ANSI_RED + "List is empty" + ANSI_RESET);
    }
    //Adds task to the list
    public void addTask() {
        System.out.println(ANSI_CYAN + "Enter new task\n" + ANSI_RESET);
        Scanner s = new Scanner(System.in);
        String newTask = s.nextLine();
        list.add(newTask);
        System.out.println(ANSI_CYAN + "New task added successfully\n" + ANSI_RESET);
    }
    //Removes task from the list
    public void deleteTask() {
        if(!list.isEmpty()) {
            this.showTasks();
            Scanner s = new Scanner(System.in);
            System.out.println(ANSI_CYAN + "Enter task number to delete" + ANSI_RESET);
            if(s.hasNextInt()) {
                int num = s.nextInt();
                if (num <= list.size())
                    list.remove(num -1);
                else System.out.println(ANSI_RED + "Number is out of list" + ANSI_RESET);
            } else System.out.println(ANSI_RED + "Wrong number!\n" + ANSI_RESET);
        } else
            System.out.println(ANSI_YELLOW + "There are currently no tasks!" + ANSI_RESET);
    }
}
