package com.mycompany.app;

import java.util.ArrayList;

public class Todo {

    private ArrayList<String> list;

    //Prints tasks from current list
    public void showTasks(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            String s = String.valueOf(arrayList.get(i));
            System.out.println((i + 1) + " " + s);
        }
    }

    //Adds task to the list
    public void addTask(ArrayList arrayList, String s) {
        arrayList.add(s);
    }

    //Removes task from the list
    public void deleteTask(ArrayList arrayList, int index) {
        arrayList.remove(index);
    }
}