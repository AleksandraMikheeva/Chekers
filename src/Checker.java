import java.util.ArrayList;
import java.util.Arrays;

enum Color {BLACK, WHITE}

public class Checker {
    private Color color;
    private int row;
    private int col;
    public ArrayList<ArrayList<Integer>> movesPossible = new ArrayList<>();


    public Checker(int row, int col, Color color) {
        this.col = col;
        this.row = row;
        this.color = color;
    }

    public void setCoordinates(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public int[] getCoordinates() {
        return new int[]{row, col};
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public ArrayList<ArrayList<Integer>> getMoves(Checker[][] board) {
//        if (row == 7 && (col > 0 && col < 7)) // becomeKing()
//        if (col == 0 || col == 7) {
//            return getMovesForFisrtAndLastColumns(board);
//        }
//        if (row + 1 == 7)

        if (captures(board).size() != 0) return movesPossible;
        if (board[row + 1][col + 1] == null) addMove(row + 1, col + 1);
        if (board[row + 1][col - 1] == null) addMove(row + 1, col + 1);

        return movesPossible;
    }

//    private ArrayList<ArrayList<Integer>> getMovesForFisrtAndLastColumns(Checker[][] board) {
//        switch()
//    }

    private ArrayList<ArrayList<Integer>> captures(Checker[][] board) {
        if (board[row + 1][col + 1] != null && board[row + 2][col + 2] == null &&
                board[row + 1][col + 1].color != board[row][col].color) addMove(row + 2, col + 2);
        if (board[row + 1][col - 1] != null && board[row + 2][col - 2] == null &&
                board[row + 1][col - 1].color != board[row][col].color) addMove(row + 2, col - 2);
        if (board[row - 1][col + 1] != null && board[row - 2][col + 2] == null &&
                board[row - 1][col + 1].color != board[row][col].color) addMove(row - 2, col + 2);
        if (board[row - 1][col - 1] != null && board[row - 2][col - 2] == null &&
                board[row - 1][col - 1].color != board[row][col].color) addMove(row - 2, col - 2);
        return movesPossible;
    }

    private void addMove(int row, int col) {
        final ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(row, col));
        movesPossible.add(coordinates);
    }
}
