import java.util.Scanner;
import java.util.InputMismatchException;

public class dragoncave {

    public static void main(String[] args) {
        new dragoncave().start();
    }

    public static void start(){
        prompt();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(result(input.nextInt()));
        }
        catch (InputMismatchException e) {
            System.out.println("Caught Exception: Number Format Exception");
        }
    }

    public static void prompt() {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight");
        System.out.println("Which cave will you go into? (1 or 2)");
    }

    public static String result(int option){
        if (option == 1) {
            return choice1();
        } else if (option == 2) {
            return choice2();
        }
        return null;
    }

    public static String choice1(){
        return ("You approach the cave... \n"+
                "It is dark and spooky... \n"+
                "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                "Gobbles you down in one bite!\n");
    }

    public static String choice2(){
        return ("You approach the cave...\n"+
                "It is dark and spooky...\n"+
                "A large dragon jumps out in front of you! He opens his jaws and...\n"+
                "Says that you can have all the gold in his cave!\n");
    }


}