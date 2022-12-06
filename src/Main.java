import java.util.ArrayList; // Import the ArrayList class
import java.util.Scanner;  // Import the Scanner class
import java.util.Collections; // Import the Collections class

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        ArrayList<String> candidates = new ArrayList<String>(); // Create a candidate ArrayList which will hold the name of candidates
        ArrayList<Integer> votes = new ArrayList<Integer>(); // Create a votos ArrayList which will hold the count of votes

        System.out.println("##################################"); // Just for the visual
        System.out.println("######### UWL Election ###########"); // Title of my "APP"
        System.out.println("##################################"); // Just for the visual
        System.out.println("----------------------------------"); // Just for the visual
        System.out.println("Do you want to start adding candidates if yes please types yes" +
                " otherwise no to exit"); // Asking the user if he wants to add candidates
        String selection = input.nextLine(); // getting the user decision if user wants to add candidates
        while (!selection.equals("no")) { // While loop which will run till the user enters no (lowercase)
            System.out.println("Whats the the Name of Candidate?");  // Print to the console
            String candidateName = input.next(); // Prompts to the user to type the name to the console
            if (candidates.contains(candidateName)){ // selection stament which checks if the name entered in in the candidates ArrayList
                int idx = candidates.indexOf(candidateName); // in case the above statement is true will get the index of the value that the candidate exists
                votes.set(idx,votes.get(idx)+1); // and will set the previous value + 1 to the votes ArrayList that we crated before
        } else {                  // If above selection statements is false
                candidates.add(candidateName); // will add the candidate name to the candidates ArrayList
                votes.add(1); // will add 1 vote to the above candidate  *** candidateName and 1 have the same index***
            }
            System.out.println("Do you want to continue adding candidates if yes please types yes" +
                    " otherwise no to exit"); // Asking the user if he wants to continue
            selection = input.next(); // getting the user decision if user wants to continue adding candidates
        }
        int idx = votes.indexOf(Collections.max(votes)); // Find the index of the greatest value at the votes ArrayList
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(candidates.get(i) + " received " + votes.get(i) + " vote/votes"); // Prints all the candidates and how many votes they got
        }
        System.out.println("----------------------------------------"); // Just for the visual
        System.out.println("The Winner is: " + candidates.get(idx) + " with " + votes.get(idx)+ " vote/votes"); // Prints the winner
}
}