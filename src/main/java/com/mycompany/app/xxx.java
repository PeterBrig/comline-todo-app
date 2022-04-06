package src.main.java.com.mycompany.app;

public class xxx {
    public static void main(String[] args) {
        //Check if arguments exist
        if (args.length != 0) {
            //First arg must be 'show', 'add' or 'remove'
            String command = args[0];
            switch (command) {
                case "show":
                    System.out.println("SHOW TBD");
                    break;
                case "add":
                    System.out.println("ADD TBD");
                    break;
                case "remove":
                    System.out.println("REMOVE TBD");
                    break;
                default:
                    System.out.println(command + ": unknown command");
                    System.exit(0);
            }
            //Print args
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("This is going to be a tool to do TODO.\n");
            System.out.println("Usage:\n\n\txxx <command> [arguments]\n");
            System.out.println("The commands are:\n\t\n \tshow\n \tadd\n \tremove\n");

        }
    }
}
