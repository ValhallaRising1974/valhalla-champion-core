public class Serena {
    private final String name = "Serena";
    private int magicPower;
    private int mana;

    public Serena(int magicPower, int mana) {
        this.magicPower = magicPower;
        this.mana = mana;
    }

    public int orbOfBeyond() {
        return 200 + (int)(1.6 * magicPower);
    }

    public String codexOfWisdom(String target) {
        return "Hypnotized " + target + " for 3 seconds. It now fights for Serena.";
    }

    public int eternalCircle() {
        return 300 + (int)(1.8 * magicPower);
    }

    public String eternum(int targetHealthPercent, boolean receivedHeal) {
        if (targetHealthPercent <= 15) {
            return "Target executed!";
        } else if (receivedHeal) {
            return "Target receives burning damage for 3 seconds.";
        } else {
            return "Target survived the magical blast.";
        }
    }
}
