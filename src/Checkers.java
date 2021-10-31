import java.util.ArrayList;
import java.util.Scanner;

public class Checkers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String white = in.nextLine();
        String black = in.nextLine();

        ArrayList<ArrayList<String>> initialPositions;
        initialPositions = Parser.initialPosition(white, black);
        for (int i = 0; i < initialPositions.size(); i++) {
            System.out.print(initialPositions.get(i));
        }

//        Board board =
//        System.out.println(Arrays.deepToString(initialPositions));
//        String movements = in.black();
        in.close();
    }
}
