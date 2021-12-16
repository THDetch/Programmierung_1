package cake;

public class CoffeeShop {
    public static void main(String[] args) {
        Cake applePie;
        applePie = new Cake("Apfelkuchen", 12, 2.8);
        Cake cheeseCake;
        cheeseCake = new Cake("Käsekuchen", 8, 3.2);

        applePie.takePiece();
        cheeseCake.takePiece();

        applePie.print();
        cheeseCake.print();


    }
}
