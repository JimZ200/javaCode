import java.util.Scanner;
public class TikTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] TK = new String[3][3];
        System.out.println("Welcome to the game");
        for (int i = 0; i < TK.length; i++) {
            for (int j = 0; j < TK[i].length; j++) {
                TK[i][j] = "_";
                System.out.print(TK[i][j] + " ");
            }
            System.out.println();

        }
        while (true) {
            System.out.println("Enter X:");
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            if (isTrue(x1, x2, TK)) {
                TK[x1][x2] = "X";

            } else {
                System.out.println("Pick some thing else");
            }
        }


    }
    public static boolean isTrue(int x, int y, String[][] t){
        return x >= 0 && x < t.length && y >= 0 && y < t.length && t[x][y].equals("_");
    }


}