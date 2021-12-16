package indianajones.gamelogic;

class Canvas {
    private char[][] canvas;

    Canvas(int lines, int columns) {
        canvas = new char[lines][columns];
        fill(' ');
    }

    void fill(char toFillWith) {
        for (int i = 0; i < canvas.length; i++) {
            for (int a = 0; a < canvas[0].length; a++) {
                canvas[i][a] = toFillWith;
            }
        }
    }

    void paint(int line, int column, char toPaint) {
        canvas[line][column] = toPaint;
    }

    String asString() {
        String arrayAsString = "";
        for (int i = 0; i < canvas.length; i++) {
            for (int a = 0; a < canvas[0].length; a++) {
                arrayAsString += canvas[i][a];
            }
            arrayAsString += "\n";
        }
        return arrayAsString;
    }
}
