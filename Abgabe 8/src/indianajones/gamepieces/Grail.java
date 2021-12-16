package indianajones.gamepieces;

public class Grail extends GamePieces {
    public Grail(int lines, int columns) {
        super(lines, columns);
        display = 'G';
        this.line = (int) (Math.random() * lines);
        this.column = (int) (Math.random() * columns);
    }

    public void makeInvisible() {
        display = ' ';
    }

}
