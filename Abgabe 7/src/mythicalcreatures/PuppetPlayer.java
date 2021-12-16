package mythicalcreatures;

public class PuppetPlayer {
    public static void main(String[] args) {

        MythicalCreature[] mythicalCreatures = new MythicalCreature[3];

        mythicalCreatures[0] = new Smurf("Schlaubischlumpf", "blau", false);
        mythicalCreatures[1] = new Smurf("Schlumpfine", "blau", true);
        mythicalCreatures[2] = new Ghost("Caspar", "weiß");

        for (MythicalCreature mythicalCreature : mythicalCreatures) {
            System.out.println(mythicalCreature.whatAmI());
        }
    }
}
