import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Move {
    private boolean isCapture;
    private ArrayList<Checker> move;

    public Move(ArrayList<String> stringOfMoves, Color color, boolean capture) {
        this.isCapture = capture;
        fillMove(stringOfMoves, color);
    }

    public ArrayList<Checker> getMove() {
        return this.move;
    }

    public boolean getCapture() {
        return this.isCapture;
    }

    private void fillMove(@NotNull ArrayList<String> stringOfMoves, Color color) {
        int row;
        int col;
        move = new ArrayList<>();
        for (String pos : stringOfMoves) {
            row = pos.charAt(1) - 49;
            if (pos.charAt(0) < 97) {
                col = pos.charAt(0) - 65;
                move.add(new King(row, col, color));
            } else {
                col = pos.charAt(0) - 97;
                move.add(new Checker(row, col, color));
            }
//            System.out.println(Arrays.toString(move[i].getCoordinates()));
//            System.out.println(board[i][col].getColor());
        }
//        System.out.println("\nMoves:");
//        System.out.println(board[3][6].getMoves(board));
    }
}
