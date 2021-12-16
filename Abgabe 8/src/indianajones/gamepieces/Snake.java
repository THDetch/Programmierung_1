package indianajones.gamepieces;

public class Snake extends GamePieces {
    private Jones jones;

    public Snake(int lines, int columns, Jones jones) {
        super(lines, columns);
        this.jones = jones;
        display = 'S';
        this.line = (int) (Math.random() * lines);
        this.column = columns - 1;
    }

    @Override
    public void move() {
        boolean upOrDown = Math.random() < 0.5;
        if (upOrDown) {
            if (line < jones.getLine()) {
                line++;
            } else if (line > jones.getLine()) {
                line--;
            }
        } else {
            if (column > jones.getColumn()) {
                column--;
            } else if (column < jones.getColumn()) {
                column++;
            }
        }
    }
}



