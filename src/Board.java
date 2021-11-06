import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board {

    private Checker[][] board;
    private int row;
    private int col;

    public Board(ArrayList<ArrayList<String>> initialPositions) {
        this.board = new Checker[8][8];
        fillInitPositions(initialPositions);
    }

    public Checker[][] getBoard() {
        return this.board;
    }

    public void setBoard(Checker checker) {
        int[] coordinates = checker.getCoordinates();
        row = coordinates[0];
        col = coordinates[1];
        this.board[row][col] = checker;
    }

    public void fillInitPositions(@NotNull ArrayList<ArrayList<String>> initialPositions) {
//        int row;
//        int col;
        Color color = Color.WHITE;
        for (ArrayList pos : Collections.unmodifiableList(initialPositions)) {
            for (Object po : pos) {
                row = po.toString().charAt(1) - 49; // row
                if (po.toString().charAt(0) < 97) {
                    col = po.toString().charAt(0) - 65;
                    board[row][col] = new King(row, col, color);
                } else {
                    col = po.toString().charAt(0) - 97;
                    board[row][col] = new Checker(row, col, color);
                }
                System.out.println(Arrays.toString(board[row][col].getCoordinates()));
                System.out.println(board[row][col].getColor());
            }
            color = Color.BLACK;
        }
//        board[][]
//        System.out.println("\nMoves:");
//        System.out.println(board[3][6].getMoves(board));
    }

}
