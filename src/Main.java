import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        help();

        while (on) {
            String choice = sc.nextLine().toLowerCase();
            switch (choice) {
                case "1":
                    System.out.print("Enter your morse code here: ");
                    System.out.println("Result: " + translator.convert(sc.nextLine(), true));
                    System.out.print("Make another choice: ");
                    break;
                case "2":
                    System.out.print("Enter your text here: ");
                    System.out.println("Result: " + translator.convert(sc.nextLine(), false));
                    System.out.print("Make another choice: ");
                    break;
                case "exit":
                    System.out.println();
                    System.out.println("Exiting");
                    on = false;
                    break;
                case "help":
                    help();
                    break;
                default:
                    System.out.println("Please try again with valid input");
                    break;
            }
        }
    }

    private static void help() {
        System.out.println();
        System.out.println("Hello!");
        System.out.println("For morse to text conversion enter 1");
        System.out.println("For text to morse conversion enter 2");
        System.out.println("To exit the program enter exit");
        System.out.println("To see this message again enter help");
    }
}
