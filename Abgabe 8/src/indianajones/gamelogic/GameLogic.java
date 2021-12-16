package indianajones.gamelogic;

import indianajones.gamepieces.*;

public class GameLogic {

    private GameView gameView;
    private Canvas canvas;
    private Jones jones;
    private Snake snake;
    private Grail grail;
    private Exit exit;
    private boolean gameOver;
    private int numberOfSnakes;
    private Snake[] snakes;
    private GamePieces[] gamePieces;
    //boolean jonesIsOnTheSameSpotAs ;

    public GameLogic(int lines, int columns, int numberOfSnakes) {
        this.numberOfSnakes = numberOfSnakes;
        canvas = new Canvas(lines, columns);
        gameView = new GameView();
        jones = new Jones(lines, columns, gameView);
        grail = new Grail(lines, columns);
        exit = new Exit(lines, columns);
        gamePieces = new GamePieces[numberOfSnakes + 3];
        snakes = new Snake[numberOfSnakes];
        for (int s = 0; s < numberOfSnakes; s++) {
            Snake snake = new Snake(lines, columns, jones);
            snakes[s] = snake;
            gamePieces[s] = snake;
        }

        gamePieces[numberOfSnakes] = exit;
        gamePieces[numberOfSnakes + 1] = grail;
        gamePieces[numberOfSnakes + 2] = jones;
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    public void gameLoop() {
        while (!gameOver) {
            canvas.fill(' ');
            for (GamePieces gamePieces : gamePieces) {
                gamePieces.move();
                canvas.paint(gamePieces.getLine(), gamePieces.getColumn(), gamePieces.getDisplay());
            }
            gameView.print(canvas.asString(), 5);
            gameLogic();
            sleep();
        }
    }

    public GamePieces[] getGamePieces() {
        return gamePieces;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    boolean jonesIsOnTheSameSpotAs(GamePieces gamePieces) {
        if (jones.getLine() == gamePieces.getLine() && jones.getColumn() == gamePieces.getColumn()) {
            return true;
        } else {
            return false;
        }
    }

    void gameLogic() {
        if (jonesIsOnTheSameSpotAs(grail)) {
            grail.makeInvisible();
            jones.grailCollected = true;
        }
        if (jones.grailCollected && jonesIsOnTheSameSpotAs(exit)) {
            canvas.fill('J');
            gameOver = true;
            gameView.print(canvas.asString(), 5);
        } else {
            for (int s = 0; s < numberOfSnakes; s++) {
                if (jonesIsOnTheSameSpotAs(snakes[s])) {
                    canvas.fill('S');
                    gameOver = true;
                    gameView.print(canvas.asString(), 5);
                }
            }
        }

    }

}
