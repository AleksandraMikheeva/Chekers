import java.util.ArrayList;

public class Board {

//    public Cell[] cells;
private Cell[][] board = new Cell[8][8];

    public Board(ArrayList<ArrayList<String>> initialPositions) {
        final int boardSize = 8;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new Cell(State.BLANK, false);
            }
        }
        fillInitPositions(initialPositions);
    }

    private void fillInitPositions(ArrayList<ArrayList<String>> initialPositions) {
        int x = 0;
        int y = 0;
        State color = State.WHITE;
        for (ArrayList pos : initialPositions) {
            for (int i = 0; i < pos.size(); i++) {
                y = pos.get(i).toString().charAt(1) - 49;
                if (pos.get(i).toString().charAt(0) < 97) {
                    x = pos.get(i).toString().charAt(0) - 65;
                    board[x][y].setIsKing(true);
                } else {
                    x = pos.get(i).toString().charAt(0) - 97;
                    board[x][y].setIsKing(false);
                }
                board[x][y].setState(color);
                System.out.println(board[x][y].getIsKing());
                System.out.println(board[x][y].getState());
            }
            color = State.BLACK;
        }
    }

}
