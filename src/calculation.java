import java.util.Scanner;

public class calculation {
    Scanner in = new Scanner(System.in);

    public void calculateArea() {
        System.out.println("Calculate area");
    }
}
        class circle extends calculation {
        public void calculateArea() {
            System.out.println("Enter values for circle");
            System.out.println("Radius or Diameter");
            String option = in.nextLine();
            if (option.equalsIgnoreCase("Radius")) {
                System.out.println("Enter radius:");
                double radius = in.nextDouble();
                System.out.println("The area is:" + Math.sqrt(radius) * Math.PI);
            } else if (option.equalsIgnoreCase("Diameter")) {
                System.out.println("Enter diameter:");
                double diameter = in.nextDouble();
                System.out.println("The area is:" + Math.sqrt(diameter / 2) * Math.PI);
            } else {
                System.out.println("Enter a valid option");
            }
        }
    }


