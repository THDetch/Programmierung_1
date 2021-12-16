package games.dice;

public class Dice {
    private String color;
    private int number;

    public Dice(String color) {
        this.color = color;
        this.number = 6;
    }

    public void roll() {
        number = 1 + (int) (Math.random() * 6);
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.println("Würfel " + color + ": " + number);
    }

}
