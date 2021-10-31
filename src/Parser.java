import java.util.ArrayList;

public class Parser {
    public ArrayList<ArrayList<String>> initPosParsed;

    //    public Parser(String white, String black) {
////        initPosParsed = initial_position(white, black);
////        Board fill_board= new Board(initPosParsed);
//
//    }
    public static ArrayList<ArrayList<String>> initialPosition(String white, String black) {
        ArrayList<ArrayList<String>> parsedInitPositions = new ArrayList<ArrayList<String>>();

        ArrayList<String> whiteParsed = parse(white);
        ArrayList<String> blackParsed = parse(black);

        parsedInitPositions.add(whiteParsed);
        parsedInitPositions.add(blackParsed);
        return parsedInitPositions;
    }

    private static ArrayList<String> parse(String str) {
        ArrayList<String> strParsed = new ArrayList<>();
        int i = 0;
        String coordinates = "";
        final int strLen = str.length();
        while (i < strLen) {
            if (str.charAt(i) == ' ') {
                strParsed.add(coordinates);
                coordinates = "";
                i++;
                continue;
            }
            coordinates += str.charAt(i);
            i++;
        }
        if (coordinates.length() != 0) {
            strParsed.add(coordinates);
        }
        return strParsed;
    }
}
