package play;

import java.util.Random;

public class play {
    public static void main(String[] args) {
        Random rd = new Random();
        while (true) {
            System.out.println(rd.nextBoolean());
        }
    }

}

