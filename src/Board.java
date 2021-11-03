import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board {

    //    public Cell[] cells;
    private Checker[][] board;

    public Board(ArrayList<ArrayList<String>> initialPositions) {
        this.board = new Checker[8][8];
//        final int boardSize = 8;
//        for (int i = 0; i < boardSize; i++) {
//            for (int j = 0; j < boardSize; j++) {
//                board[i][j] = new Cell(State.BLANK, false);
//            }
//        }
        fillInitPositions(initialPositions);
    }

    private void fillInitPositions(@NotNull ArrayList<ArrayList<String>> initialPositions) {
        int x;
        int y;
        Color color = Color.WHITE;
        for (ArrayList pos : Collections.unmodifiableList(initialPositions)) {
            for (Object po : pos) {
                y = po.toString().charAt(1) - 49;
                if (po.toString().charAt(0) < 97) {
                    x = po.toString().charAt(0) - 65;
//                    board[x][y].setIsKing(true);
                    board[x][y] = new King(x, y, color);
                } else {
                    x = po.toString().charAt(0) - 97;
                    board[x][y] = new Checker(x, y, color);
                }
//                board[x][y].setState(color);
                System.out.println(Arrays.toString(board[x][y].getCoordinates()));
                System.out.println(board[x][y].getColor());
            }
            color = Color.BLACK;
        }
    }

}
