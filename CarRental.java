package IntroductionCS.u8;// Aashir Khan
import java.util.Scanner;
public class CarRental {
    public static void main(String[] args) {
        // Import the scanner
        Scanner in = new Scanner(System.in);

        // The program asks the user for the first company name, how much it costs to rent it for a day, and how much it
        // costs per mile
        System.out.println("What is the name of the first company?");
        String company1 = in.nextLine();
        System.out.println("What is the price to rent the vehicle per day?");
        double perday1 = in.nextDouble();
        System.out.println("What is the price per mile?");
        double permile1 = in.nextDouble();
        in.nextLine();

        // The program asks the user for the second company name, how much it costs to rent it for a day, and how much
        // it costs per mile
        System.out.println("What is the name of the second company?");
        String company2 = in.nextLine();
        System.out.println("What is the price to rent the vehicle per day?");
        double perday2 = in.nextDouble();
        System.out.println("What the price per mile?");
        double permile2 = in.nextDouble();

        // The program asks for the amount of miles the person plans on driving
        System.out.println("How many miles do you plan to drive?");
        double miles = in.nextDouble();

        // Now the program prints out the expense of renting a car from each company
        System.out.printf("%s will cost %.2f\n", company1, permile1*miles + perday1);
        System.out.printf("%s will cost %.2f\n", company2, permile2*miles + perday2);

        // The program now calculates which company will cost less and prints it and also identifies if both companies
        // cost the same
        if ((permile1*miles + perday1) > (permile2*miles + perday2)){
            System.out.println(company2 + " is cheaper.");
        }
        else if ((permile1*miles + perday1) == (permile2*miles + perday2)){
            System.out.println("Both companies cost the same.");
        }
        else {
            System.out.println(company1 + " is cheaper.");
        }
    }
}
