import java.util.Scanner; //import scanner class
import java.util.ArrayList;
public class Main {
     double afterTax(double x) { //set up the afterTax method to calculate the price after tax
         return x * 1.15;
    }

     void display(double x) {
        System.out.printf("After tax is:" + " " + "%.2f", x);
        System.out.print("$");
        System.out.println();
    }

     void formatting(double x) {
        System.out.printf("%.2f", x);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //create scanner object

        Main it = new Main(); //create the Main object to deal with the usage of methods

        ArrayList<Double> arr = new ArrayList<>();

        int counter = 0;

        String input = "";

        while (!input.equalsIgnoreCase("exit")) {

            System.out.println("Enter a number or enter 'exit' to finish");
            input = in.nextLine(); //the input for user

            if (input.equalsIgnoreCase("exit")) { //if entered exit
                System.out.println("Exiting the program...");
            } else {
                try {

                    double finalPrice = Double.parseDouble(input);//convert string to number

                    if (finalPrice < 0) {
                        System.out.println("Cannot have a negative number");
                    }
                    System.out.println("Entered price:" + finalPrice + "$");
                    System.out.println("Do you want to proceed? yes/no");
                    String option = in.nextLine(); // enter the option yes/no

                        if (option.equalsIgnoreCase("yes")) {
                            double result = it.afterTax(finalPrice);
                            it.display(result);
                            arr.add(result);
                            counter++;


                        } else if (option.equalsIgnoreCase("no")) {

                            System.out.println("Do you want to change it yes/no");
                            String option2 = in.nextLine(); //option for yes or no
                            boolean change = true;
                            while (change) {
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
                                            change = false; //if entered yes then calculate the value

                                        } else if (changeOption.equalsIgnoreCase("no")) {
                                            continue; // if entered no then continue the loop
                                        } else {
                                            System.out.println("enter yes or no");
                                            change = false;
                                        }


                                    } else if (option2.equalsIgnoreCase("no")) {
                                        double result3 = it.afterTax(finalPrice);
                                        it.display(result3);
                                        arr.add(result3);
                                        counter++;
                                        change = false; //if entered no then calculate the value

                                    } else {
                                        System.out.println("Enter yes or no");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Enter a valid option");
                                }
                            }

                        }
                    
                } catch (NumberFormatException e) {
                    System.out.println("Invalid option");
                }
            }


        }
        System.out.println();

        double[] arr2 = new double[counter];

        int size = arr.size();
        if (size == 0) {
            System.out.println("No value found");
        } else {
            System.out.println("In summary:");
            System.out.println("Number of execution: " + counter);

            System.out.println("History of your result: ");
            int idx = 1;
            for (double i : arr) {
                System.out.print("[" + idx + "]" + ":");
                idx++;
                it.formatting(i);
            }


            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr.get(i);
            }

            System.out.println("-----");

            System.out.println("Your biggest value: ");
            double largest = arr2[0];
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] > largest) {
                    largest = arr2[i];
                }


            }

            it.formatting(largest);
            System.out.println("-----");

            System.out.println("Smallest value: ");
            double min = arr2[0];
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] < min) {
                    min = arr2[i];
                }

            }

            it.formatting(min);
            System.out.println("-----");

            System.out.println("History of the result from largest to least:");
            double temp;
            for (int i = 1; i < arr2.length; i++) {
                temp = arr2[i];
                int j = i - 1;
                while (j >= 0 && arr2[j] < temp) {
                    arr2[j + 1] = arr2[j];
                    j--;
                }
                arr2[j + 1] = temp;
            }
            for (int i = 0; i < arr2.length; i++) {
                it.formatting(arr2[i]);

            }

            System.out.println("----");

            System.out.println("To remove an item in the history follow the syntax: remove,#");
            System.out.println("-----");
            System.out.println("To finish just enter 'done'");

            while (in.hasNext()) {
                String option = in.next();
                if(option.equals("done")) {
                    break;
                }
                String[] option2 = option.split(",");
                int idx2 = Integer.parseInt(option2[1]);
                arr2[idx2 - 1] = 0;
                it.printList(arr2);


            }
        }
    }
            void printList(double[] list){
            for (int i = 0; i < list.length; i++) {
               System.out.print("[" + (i+1) + "]" + ":");
                System.out.printf("%.2f",list[i]);
                System.out.println();

            }
        }
     }









