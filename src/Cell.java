public class Cell {
    public enum State {BLACK, WHITE, BLANK}

    //    private int[] mPosition;
    private State mState;

    public Cell(/*int[] mPosition,*/ State mState) {
//        this.mPosition = mPosition;
        this.mState = mState;
    }

//    public int[] getPosition() {
//        return Arrays.copyOf(mPosition, mPosition.length);
//    }

//    public void setPosition(int[] position) {
//        mPosition = position;
//    }

    public State getState() {
        return mState;
    }

    public void setState(State state) {
        mState = state;
    }


}
