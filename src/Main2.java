import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(EnumExample i : EnumExample.values()) {
            System.out.println(i.levelOfDays);
        }
    }
}