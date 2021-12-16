package gameoflife;

class Cell {
    private boolean alive;
    private int numberOfNeighbours;

    Cell(boolean alive) {
        this.alive = alive;
    }

    boolean isAlive() {
        return alive;
    }

    void setNumberOfNeighbours(int numberOfNeighbours) {
        this.numberOfNeighbours = numberOfNeighbours;
    }

    void applyRules() {
        if (numberOfNeighbours < 2) {
            alive = false;
        } else if (numberOfNeighbours > 3) {
            alive = false;
        } else if (numberOfNeighbours == 3) {
            alive = true;
        }
    }
}
