package gameoflife;

public class GameOfLife {
    private static final int NUMBEROFGENERATIONS = 10000;

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.startGame();
    }

    private void startGame() {
        PetriDish petriDish = new PetriDish(90, 160, 0.6);
        petriDish.print();
        for (int generation = 1; generation <= NUMBEROFGENERATIONS; generation++) {
            petriDish.calculateNextGeneration();
            petriDish.print();
        }
    }

}
