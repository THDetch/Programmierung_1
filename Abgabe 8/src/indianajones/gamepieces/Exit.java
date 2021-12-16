package indianajones.gamepieces;

public class Exit extends GamePieces {

    public Exit(int lines, int columns) {
        super(lines, columns);
        display = 'E';
        this.line = lines / 2;
        this.column = columns - 1;

    }
}

