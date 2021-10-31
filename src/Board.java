import java.util.ArrayList;

enum State {BLACK, WHITE, BLANK};

public class Board {

    public State state;
    static State[][] board = new State[8][8];

    public Board(ArrayList<ArrayList<String>> initialPositions) {
        final int boardSize = 8;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = state.BLANK;
            }
        }
    }

    static State[][] fillInitPositions(ArrayList<ArrayList<String>> initialPositions) {
        State color = State.WHITE;
        for (ArrayList pos : initialPositions) {
            for (int i = 0; i < pos.size(); i++) {
                int x = pos.get(i).toString().charAt(0) - 97;
                int y = pos.get(i).toString().charAt(1) - 49;

                board[x][y] = color;
                System.out.println(board[x][y]);
            }
            color = State.BLACK;
        }
        return board;
    }

}
