package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int turn = 1;
        String loop = "";
        String input = "";
        Scanner obj = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = obj.nextLine();
        System.out.println("Well, " + name + " I am thinking of a number between 1 and 20");
        System.out.println("Take a guess.");
        while (!input.equals("n")) {
            Random r = new Random();
            int low = 1;
            int high = 20;
            int rng = r.nextInt(high - low) + low;
            input ="";

            while (!Objects.equals(input, "y")) {
                if (turn != 7){
                    input = obj.nextLine();
                    int answer = Integer.parseInt(input);
                    if (answer > rng) {
                        System.out.println("Your guess is too high.");
                        turn++;
                    } else if (answer < rng) {
                        System.out.println("Your guess is too low.");
                        turn++;
                    } else {
                        String attempts;
                        attempts = Integer.toString(turn);
                        System.out.println("Good job, " + name + ". You guessed my number in " + attempts + " guesses.");
                        System.out.println("Would you like to try again? (y or n)");
                        input = obj.nextLine();
                        if (Objects.equals(input, "n")) {
                            System.exit(0);
                        }
                        turn = 1;
                        System.out.println("Take a guess.");
                    }
                }   else    {
                    System.out.println("You took too many guesses!");
                    System.out.println("Would you like to try again? (y or n)");
                    input = obj.nextLine();
                    if (Objects.equals(input, "n")) {
                        System.exit(0);
                    }
                    turn = 1;
                    System.out.println("Take a guess.");
                }

            }
        }
    }
}
