import java.util.ArrayList;
import java.util.Scanner;

public class Checkers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String white = in.nextLine();
        String black = in.nextLine();

        ArrayList<ArrayList<String>> initialPositions;
        Parser parser = new Parser();
        initialPositions = parser.initialPosition(white, black);
//        for (int i = 0; i < initialPositions.size(); i++) {
//            System.out.print(initialPositions.get(i));
//        }
//        System.out.println('\n');
        State[][] boardFilled;
        Board board = new Board(initialPositions);

        String move;
//        while ((move = in.next()) != null) {
//            parser.parseMovements(move);
//
//        }
//        Board board =
//        System.out.println(Arrays.deepToString(initialPositions));
//        String movements = in.black();
        in.close();
    }
}
