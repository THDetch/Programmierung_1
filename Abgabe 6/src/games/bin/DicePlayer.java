package games.bin;

import games.dice.Dice;

public class DicePlayer {
    public static void main(String[] args) {
        Dice dice1 = new Dice("rot");
        Dice dice2 = new Dice("grün");
        int sumForDice1 = 0;
        int sumForDice2 = 0;
        for (int i = 1; i <= 5; i++) {

            dice1.roll();
            sumForDice1 += dice1.getNumber();
            dice1.print();

            dice2.roll();
            sumForDice2 += dice2.getNumber();
            dice2.print();
        }
        System.out.println("Mittelwert Würfel " + dice1.getColor() + ": " + (sumForDice1 / 5.0));
        System.out.println("Mittelwert Würfel " + dice2.getColor() + ": " + (sumForDice2 / 5.0));

    }
}
