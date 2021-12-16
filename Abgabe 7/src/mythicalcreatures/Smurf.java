package mythicalcreatures;

class Smurf extends MythicalCreature {
    private String female;

    Smurf(String name, String color, boolean isFemale) {
        super(name, color);
        if (isFemale) {
            this.female = "Mädchen";
        } else {
            this.female = "Junge";
        }
    }

    @Override
    protected String whatAmI() {
        return super.whatAmI() + " Ich bin ein " + female + ".";
    }
}
