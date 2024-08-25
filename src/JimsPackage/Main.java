package JimsPackage;
import java.util.Scanner; //import scanner class
public class Main {
    //methods to perform calculations and displaying
     double afterTax(double x) { //set up the afterTax method to calculate the price after tax
         return x * 1.15;
    }

    //print the message
     void display(double x) {
        System.out.printf("After tax is:" + " " + "%.2f", x);
        System.out.print("$");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //create scanner object

        Main it = new Main(); //create the Jim's Package.Main object to deal with the usage of methods


        String input = "";

        while (!input.equalsIgnoreCase("exit")) {

            System.out.println("Enter a number or enter 'exit' to finish");
            input = in.nextLine(); //input from user

            if (input.equalsIgnoreCase("exit")) { //if entered exit
                System.out.println("Exiting the program...");
                break;
            }
            //use try and catch to deal with exception error
            try {

                double finalPrice = Double.parseDouble(input);//convert String input to number

                //deal with negative values as there is no negative price in real world
                if (finalPrice < 0) {
                    System.out.println("Price can not be negative");
                } else {

                    System.out.println("Entered price:" + finalPrice + "$");
                    System.out.println("Do you want to proceed? Enter y for yes and n for No");

                    String option = in.nextLine(); // enter the option yes/no

                    if (option.equalsIgnoreCase("y")) {
                        //calculate tax
                        double result = it.afterTax(finalPrice);

                        //display it and add to arrayList while increase the counter
                        it.display(result);

                        //if the option entered is no
                    } else if (option.equalsIgnoreCase("n")) {
                        //since the option is no ask the user if they want to change it
                        while (true) {
                            System.out.print("Price entered: " + finalPrice + "$ ");
                            System.out.println("Do you want to change it enter y for Yes and n for No");

                        String option2 = in.nextLine(); //option for yes or no

                                if (option2.equalsIgnoreCase("y")) {
                                        while(true) {
                                            System.out.println("Enter the new number");
                                            double number = in.nextDouble();//enter the number
                                            in.nextLine(); //prevent error

                                            System.out.println(number + "$:" + " " + "is this the final option y/n");
                                            String changeOption = in.nextLine();

                                            if (changeOption.equalsIgnoreCase("y")) {
                                                double result2 = it.afterTax(number);
                                                it.display(result2);
                                                //once the user finish the input set change into false to exit the while loop
                                                break;
                                            }

                                        }
                                    break;
                                } else if (option2.equalsIgnoreCase("n")) {
                                    //if user is sure with the input value then exit the loop
                                    double result3 = it.afterTax(finalPrice);
                                    it.display(result3);
                                    break;

                                } else {
                                    System.out.println("Invalid option: enter y or n");
                                }
                        }


                    } else {
                        System.out.println("Invalid option: enter y or n");
                    }
                 }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input enter a valid price or exit");
            }
        }

     }
}









