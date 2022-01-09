import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTNJU {
    static Scanner obj = new Scanner(System.in);
    int rng;
    int choice;
    String name;
    String retry;

    public GuessTNJU() {

    }

    public static void main(String[] args) {
        new GuessTNJU().GTN();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRng(int rng){
        this.rng = rng;
    }

    public int getRng(){
        return rng;
    }

    public String getRetry(){
        return retry;
    }
    public void setRetry(String retry){
        this.retry = retry;
    }

    public int getChoice(){
        return choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public void start(){
        System.out.println("Hello! What is your name?");
        try{
            setName(name = obj.nextLine());
        } catch (InputMismatchException e){
            setName("user");
        }
    }

    public void random(){
        Random r = new Random();
        int low = 1;
        int high = 20;
        int rng = r.nextInt(high - low) + low;
        setRng(rng);
    }

    public void game(){
        int turn = 1;

        System.out.println("Well, " + getName() + " I am thinking of a number between 1 and 20");
        System.out.println("Take a guess.");

         while (turn < 7){
             setChoice(playerNumber());
             if (getChoice() > getRng()) {
                 System.out.println("Your guess is too high.");
             } else if (getChoice() < getRng()) {
                 System.out.println("Your guess is too low.");
             } else {
                 String attempts;
                 attempts = Integer.toString(turn);
                 System.out.println("Good job, " + getName() + ". You guessed my number in " + attempts + " guesses.");
                 break;
             }
         if (turn == 6){
             System.out.println("You took too many guesses!");
         }
             turn++;
         }
    }

    public int playerNumber(){
        Scanner input = new Scanner(System.in);
        try{
            return input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        return 0;
    }

    public void GTN(){
        Scanner input = new Scanner(System.in);
        setRetry("y");
        start();

        while(getRetry().equals("y")){
            random();
            game();
            System.out.println("Would you like to try again? (y or n)");
            try{
                setRetry(input.nextLine());
            }  catch (InputMismatchException e){
                setRetry("n");
            }
        }
    }
}
