
public class Belzebuh {
    private String form = "Demonic Giant";
    private int height = 4; // meters in lore
    private String onMapHeight = "Standard";
    private boolean staminaGenerator = true;
    private String lane = "Highland";

    public String rockPunch(boolean hitsEnemy) {
        if (hitsEnemy) {
            return "Damage and Slow";
        } else {
            return "Knocks enemy upward";
        }
    }

    public String headbutt() {
        return "Lifts and throws enemy back, causing Damage and Armor Break";
    }

    public String gutWrench() {
        return "Back attack that causes Damage and Torpor";
    }

    public String hyperthrow() {
        return "Grabs enemies, throws them upward and crushes them, dealing massive damage";
    }
}
