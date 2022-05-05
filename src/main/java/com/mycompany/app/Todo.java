package com.mycompany.app;

import java.io.*;
import java.util.ArrayList;

public class Todo {

    private ArrayList<Chore> choreList;

    public Todo(){
        choreList = new ArrayList<>();
    }

    public void showTasks() {
        if(choreList.size() > 0) {
            choreList.stream().forEach(chore -> System.out.println(chore.getTitle()));
        } else {
            System.out.println("No Tasks!");
        }
    }

    //Adds task to the list
    public void addTask(String s) {
        this.choreList.add(new Chore(s, false));
    }

    //Removes task from the list
    public void deleteTask(int index) {
        if(index <= choreList.size() && index != -1) {
            choreList.remove(index - 1);
            System.out.println("Task removed from the list!\n");
        } else {
            System.out.println("Wrong number!\n");
        }
    }

    public void readFromFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null){
                this.choreList.add(new Chore(sCurrentLine, false));
            }
    } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

public void saveToFile(String fileName) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        choreList.stream().forEach(chore -> {
            try {
                writer.write(chore.getTitle()+ "\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
        System.out.println("Saved!\n");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }

}