import java.util.Hashtable;
import java.util.Map;

public class Board {
    Map<int[], Cell> mCells = new Hashtable<>();

    public Board(/*int[] position, */) {
        final int boardSize = 8;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
//                Cell.State state = Cell.State.BLANK;

                //Класс Board должен (?) принимать уже распарсенные позиции.

                //Наверное, это будет двумерный массив из двух строк, где 1 строка - координаты белых,
                //a 2 строка - координаты  черных(?).

                //По умолчанию каждой позиции в цикле ставить BLANK, и только переданным в Board позициям
                //ставить WHITE или BLACK в зависимости  от номера строки в переданном массиве (?).

//                TODO: придумать в каком виде передать распарсенные позиции в Board,
//                 то есть распарсить их (с помощью регулярок)

                final int[] position = {i, j};
                final Cell cell = new Cell(Cell.State.BLANK);
                mCells.put(position, cell);
            }
        }
    }

}
