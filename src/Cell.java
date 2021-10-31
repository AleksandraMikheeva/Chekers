enum State {BLACK, WHITE, BLANK};

public class Cell {

    private State state;
    private boolean isKing;

    public Cell(State state, boolean isKing) {
        this.state = state;
        this.isKing = isKing;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void setIsKing(boolean isKing) {
        this.isKing = isKing;
    }

    public boolean getIsKing() {
        return this.isKing;
    }
}
