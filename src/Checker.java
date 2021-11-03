enum Color {BLACK, WHITE}

public class Checker {
    private Color color;
    private int x;
    private int y;

    public Checker(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

//    public ArrayList<ArrayList<Integer>> getMovements(int x, int y, Color color) {
//        ArrayList<ArrayList<Integer>> movesPossible = new ArrayList<>();
//
//
//        return movesPossible;
//    }
}
