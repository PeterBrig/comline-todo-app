package src.main.java.com.mycompany.app;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class xxx {

    public static List<String> list=new ArrayList<String>();
    public static String fileName = "list.txt";
    public static String mainMenu =
                  "\n\t\tMenu\n\n" +
                  "\t1 - List tasks\n" +
                  "\t2 - Add task\n" +
                  "\t3 - Delete task\n" +
                  "\t4 - Exit\n";

    public static void pr(Object line) {
        System.out.println(line);
    }

    public static void showTasks(){
        int index = 1;
        for (String s: list) {
            pr((index++) + " " + s);
        }
    }

    public static void addTask(){
        pr("Enter new task\n");
        Scanner s = new Scanner(System.in);
        String newTask = s.nextLine();
        list.add(newTask);
        pr("New task added successfully\n");
    }

    public static void deleteTask(){
        if(!list.isEmpty()) {
            showTasks();
            Scanner s = new Scanner(System.in);
            pr("Enter task number to delete");
            Integer num = s.nextInt();
            if(num > list.size())
                pr("Wrong number");
            else
                list.remove(num -1);
        } else
            pr("There are currently no tasks!");
    }

    public static void main(String[] args) {

        pr(mainMenu);
        String userChoice = "";
        Scanner inp = new Scanner(System.in);

        while (!userChoice.equals("4")) {
            userChoice = inp.nextLine();
            switch (userChoice) {
                case "1":
                    if(list.isEmpty())
                        pr("Currently there are no tasks");
                    else showTasks();
                    break;
                case "2":
                    addTask();
                    showTasks();
                    break;
                case "3":
                    deleteTask();
                    break;
                default:
                    pr("Wrong option!");
            }
        }

       /* List<String> list=new ArrayList<String>();


        //Check if arguments exist
        if (args.length != 0) {
            //First arg must be 'show', 'add' or 'remove'
            String command = args[0];
            switch (command) {
                case "show":
                    if (list.isEmpty())
                        System.out.println("Список пуст");
                    else
                        System.out.println(list);
                    break;
                case "add":
                    System.out.println("ADD TBD");
                    break;
                case "remove":
                    System.out.println("REMOVE TBD");
                    break;
                case "interactive":
                    Scanner input = new Scanner(System.in);
                    System.out.println("Main menu");
                    list.add(input.nextLine());
                    break;

                default:
                    System.out.println(command + ": unknown command");
                    System.exit(0);
            }
            //Print args
            for (String arg : args) {
                System.out.println(arg);
                System.out.println(list);
            }
        } else {
            System.out.println("This is going to be a tool to do TODO.\n");
            System.out.println("Usage:\n\n\txxx <command> [arguments]\n");
            System.out.println("The commands are:\n\t\n \tshow\n \tadd\n \tremove\n \tinteractive\n");

        }*/
    }
}
