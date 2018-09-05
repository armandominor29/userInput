/**
 * Created by Armando Minor on 1/15/16.
 */
//* Program will print user input and output it.
//* Program will exit after user input is printed if quit or Quit is entered!


import java.util.Scanner;


public class ProgrammmingProject0 {
    public static void main(String[] args) {

        String q = "quit"; // Create and initialize string q
        String Q = "Quit"; // Create and initialize string Q

        System.out.println("Please input desired text.(quit/Quit terminates program)"); // Ask user for input

        Scanner in = new Scanner(System.in); //Enable for input

        String input; //Create string input

        do {
            //* Keep executing program while the while statement is valid

            input = in.nextLine(); //set input value
            System.out.println("In: " + input); //Print input
            if (input.equals(q) || input.equals(Q)) {
                System.exit(0); //Program is terminated if q or Q is established
            } else {
                System.out.println("Output: " + input); //Print output
            }

        } while (!input.equals(q) || !input.equals(Q)); //Execute while statement is valid






    }
}
