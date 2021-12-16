package benzinrechner;

public class BenzinRechner {
    public static void main(String[] args) {
        float consumeFor100KM = 8.6f;
        float drivedKM = 443.0f;
        float result = (drivedKM / 100) * consumeFor100KM;
        System.out.println("Ihr Auto hat auf " + drivedKM + " Kilometer " + result + " Liter Benzin verbraucht.");

    }
}
