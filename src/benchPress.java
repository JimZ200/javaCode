import java.util.Scanner;
public class benchPress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much do you bench");
        int bench = in.nextInt();

        int value = bench - 45;
        double weightOnEachSide = (double) value /2;
        double result = weightOnEachSide;

        int weight45 = (int) weightOnEachSide/45;

        int after45 = (int) result % 35;

        int weight35 =  after45 /35;

        int after35 = (int) result % 25;

        int weight25 = after35 / 25;

        int after25 = (int) result % 10;

        int weight10 = after25 / 10;

        int after10 = (int) result % 10;

        int weight5 = after10 / 5;

        int after5 = (int) result % 5;

        int weight2andHalf = after5 / 5;




        System.out.println(weight45);
        System.out.println(weight35);
        System.out.println(weight25);
        System.out.println(weight10);
        System.out.println(weight5);
        System.out.println(weight2andHalf);









    }
}