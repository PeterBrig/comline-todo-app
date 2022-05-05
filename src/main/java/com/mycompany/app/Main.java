package com.mycompany.app;

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

        boolean mode = defineUserMode(args);

        if (mode) {
            InterMode interUserMode = new InterMode();
            interUserMode.printMenu();
            interUserMode.interactiveMainLoop();

        } else {
            ComlineMode comlineUserMode = new ComlineMode();
            comlineUserMode.comlineMainLoop(args, fileName);
            comlineUserMode.printHello();
        }
    }
}