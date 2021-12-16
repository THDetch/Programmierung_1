package cake;

public class Cake {
    String name;
    int numberOfPieces;
    double pricePerPiece;

    public Cake(String name, int numberOfPieces, double pricePerPiece) {
        this.name = name;
        this.numberOfPieces = numberOfPieces;
        this.pricePerPiece = pricePerPiece;

    }

    public void takePiece() {
        if (numberOfPieces > 0) {
            numberOfPieces--;
        }
    }

    public void print() {

        String print = printName() + " mit " + numberOfPieces + " Stücken. "
                + "Restwert: " + remainValue() + " Euro.";
        System.out.println(print);
    }

    public String printName() {
        return name;
    }

    public double remainValue() {
        double remainValue = numberOfPieces * pricePerPiece;
        double roundenRemainValue = Math.round(remainValue * 10) / 10.0;
        return roundenRemainValue;
    }

}
