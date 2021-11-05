import java.util.ArrayList;

public class Parser {

    private ArrayList<ArrayList<String>> initialPositions;

    public Parser(String white, String black) {
        setInitialPositions(white, black);
    }

    public ArrayList<ArrayList<String>> getInitialPositions() {
        return initialPositions;
    }

    private void setInitialPositions(String white, String black) {
        initialPositions = new ArrayList<>();

        ArrayList<String> whiteParsed = parseCoordinates(white);
        ArrayList<String> blackParsed = parseCoordinates(black);

        initialPositions.add(whiteParsed);
        initialPositions.add(blackParsed);
    }

    public ArrayList<String> parseCoordinates(String str) {
        ArrayList<String> strParsed = new ArrayList<>();
        int i = 0;
        StringBuilder coordinates = new StringBuilder();
        final int strLen = str.length();
        while (i < strLen) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '-' || str.charAt(i) == ':') {
                strParsed.add(coordinates.toString());
                coordinates = new StringBuilder();
                i++;
                continue;
            }
            coordinates.append(str.charAt(i));
            i++;
        }
        if (coordinates.length() != 0) {
            strParsed.add(coordinates.toString());
        }
        return strParsed;
    }
//    public /*move[]*/ parseMoves(String move) {
//
//    }
}
