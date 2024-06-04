package JimsPackage;

import java.util.Scanner; //import scanner class
import java.util.ArrayList;
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

    //round value to 2 decimal places
     void formatting(double x) {
        System.out.printf("%.2f", x);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //create scanner object

        Main it = new Main(); //create the Jim's Package.Main object to deal with the usage of methods

        //arraylist to deal with unknown amount of input
        ArrayList<Double> arr = new ArrayList<>();
        //initialize counter to 0
        int counter = 0;

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
                    System.out.println("Cannot have a negative number");
                }

                System.out.println("Entered price:" + finalPrice + "$");
                System.out.println("Do you want to proceed? yes/no");
                String option = in.nextLine(); // enter the option yes/no

                if (option.equalsIgnoreCase("yes")) {
                    //calculate tax
                    double result = it.afterTax(finalPrice);

                    //display it and add to arrayList while increase the counter
                    it.display(result);
                    arr.add(result);
                    counter++;

                    //if the option entered is no
                } else if (option.equalsIgnoreCase("no")) {
                    //since the option is no ask the user if they want to change it
                    System.out.println("Do you want to change it yes/no");

                    String option2 = in.nextLine(); //option for yes or no
                    //boolean variable which initialize to true
                    boolean change = true;
                    while (change) {
                        //use try catch to deal with exception error
                        try {
                            if (option2.equalsIgnoreCase("yes")) {
                                System.out.println("Enter the new number");
                                double number = in.nextDouble();//enter the number
                                in.nextLine(); //prevent error
                                System.out.println(number + "$:" + " " + "is this the final option yes/no");
                                String changeOption = in.nextLine();

                                if (changeOption.equalsIgnoreCase("yes")) {
                                    double result2 = it.afterTax(number);
                                    it.display(result2);
                                    arr.add(result2);
                                    counter++;
                                    //once the user finish the input set change into false to exit the while loop
                                    change = false;

                                } else if (!changeOption.equalsIgnoreCase("no")) {
                                    System.out.println("enter yes or no");
                                    change = false;
                                }


                            } else if (option2.equalsIgnoreCase("no")) {
                                //if user is sure with the input value then exit the loop
                                double result3 = it.afterTax(finalPrice);
                                it.display(result3);
                                arr.add(result3);
                                counter++;
                                change = false; //if entered no then calculate the value

                            } else {
                                System.out.println("Invalid option: enter yes/no");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input");
                        }
                    }


                } else {
                    System.out.println("Invalid option: enter yes/no");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
        //line break
        System.out.println();

        //create an array of size that is the same as counter
       // double[] arr2 = new double[counter];

        //check for empty arrayList
        if (arr.isEmpty()) {
            System.out.println("No value found");
        } else {

            System.out.println("In summary:");
            System.out.println("Number of execution: " + counter);

            System.out.println("History of your result: ");

            int idx = 1;

            //printing the results
            for (double i : arr) {
                System.out.print("[" + idx + "]" + ":");
                idx++;
                it.formatting(i);
            }


            System.out.println("-----");

            System.out.println("History of the result from largest to least:");

            //Insertion sort
            double temp;
            for (int i = 1; i < arr.size(); i++) {
                temp = arr.get(i);
                int j = i - 1;
                while (j >= 0 && arr.get(j) < temp) {
                    arr.set(j+1, arr.get(j));
                    j--;
                }
                arr.set(j+1, temp);
            }
            for (double i : arr) {
                it.formatting(i);

            }

            System.out.println("----");

            System.out.println("To remove an item in the history follow the syntax: remove,#");

            System.out.println("To finish enter 'done'");

            while (in.hasNext()) {
                //input String
                String option = in.next();
                if (option.equals("done")) {
                    break;
                }

                //split the input String after ","
                String[] option2 = option.split(",");
                int idx2 = Integer.parseInt(option2[1]);

                if(idx2 > arr.size() || idx2 <= 0) {
                    System.out.println("Out of bound...");
                    break;
                }
                idx2 = idx2 -1;
                arr.remove(idx2);
                if(arr.isEmpty()) {
                    System.out.println("Empty list");
                    break;
                }
                it.printList(arr);


            }
        }
    }
            void printList(ArrayList<Double> list){
            for (int i = 0; i < list.size(); i++) {
               System.out.print("[" + (i+1) + "]" + ":");
                System.out.printf("%.2f",list.get(i));
                System.out.println();

            }
        }
     }









