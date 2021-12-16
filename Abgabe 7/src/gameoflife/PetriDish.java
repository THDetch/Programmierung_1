package gameoflife;

class PetriDish {
    private int height;
    private int width;
    private int generation;
    private Cell[][] cells;
    private GameView gameView;


    PetriDish(int height, int width, double chanceToLive) {
        this.height = height;
        this.width = width;
        this.generation = 1;
        gameView = new GameView();
        cells = new Cell[height][width];
        for (int l = 0; l < height; l++) {
            for (int c = 0; c < width; c++) {
                cells[l][c] = new Cell(Math.random() < chanceToLive);
            }
        }
    }

    void setCells(Cell[][] cells) {
        this.cells = cells;
        this.generation = 1;
        this.height = cells.length;
        this.width = cells[0].length;
    }

    Cell[][] getCells() {
        return cells;
    }

    private int countingAliveNeighbors(int cellLine, int cellColumn) {
        int numberOfNeighborAlive = 0;
        for (int l = cellLine - 1; l <= cellLine + 1; l++) {
            for (int c = cellColumn - 1; c <= cellColumn + 1; c++) {
                if (!(l == cellLine && c == cellColumn)) {
                    if (l >= 0 && c >= 0 && l < height && c < width) {
                        if (cells[l][c].isAlive()) {
                            numberOfNeighborAlive++;
                        }
                    }
                }
            }
        }
        return numberOfNeighborAlive;
    }

    void calculateNextGeneration() {
        generation++;
        calcNeighborsForCells();
        applyAllRules();
    }

    private void calcNeighborsForCells() {
        for (int l = 0; l < height; l++) {
            for (int c = 0; c < width; c++) {
                cells[l][c].setNumberOfNeighbours(countingAliveNeighbors(l, c));
            }
        }
    }

    private void applyAllRules() {
        for (int l = 0; l < height; l++) {
            for (int c = 0; c < width; c++) {
                cells[l][c].applyRules();
            }
        }
    }

    void print() {
        String display = "Generation " + generation + "\n";
        for (int l = 0; l < height; l++) {
            for (int c = 0; c < width; c++) {
                if (cells[l][c].isAlive()) {
                    display = display + "X";
                } else {
                    display = display + " ";
                }
            }
            display = display + "\n";
        }
        display = display + "\n";
        gameView.print(display, 1);
    }

}
