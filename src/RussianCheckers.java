import java.util.ArrayList;
import java.util.Scanner;

public class RussianCheckers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String white = in.nextLine();
        String black = in.nextLine();

        Parser parser = new Parser(white, black);
        Board board = new Board(parser.getInitialPositions());

        final int operation = 2;
        while (in.hasNext()) {
            String move = in.next();
            ArrayList str = parser.parseCoordinates(move);

            CheckMove checkMove = new CheckMove(parser.parseCoordinates(move));

            if (move.charAt(operation) == ':') {

            }
            if (move.charAt(operation) == '-') {

            }
        }
//        for (int i = 0; i < initialPositions.size(); i++) {
//            System.out.print(initialPositions.get(i));
//        }
//        System.out.println('\n');
//        State[][] boardFilled;

//        parser.

//        String move;
//        while ((move = in.next()) != null) {
//            parser.parseMoves(move);
//
//        }
//        System.out.println(Arrays.deepToString(Checker.getMoves()));
//        String movements = in.black();
        in.close();
    }
}
