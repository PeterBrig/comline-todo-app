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
            interUserMode.interactiveMainLoop();

            System.out.println(list);
        } else {
            comlineUserMode.comlineMainLoop(args, fileName);
            comlineUserMode.printHello();
        }
    }
}
