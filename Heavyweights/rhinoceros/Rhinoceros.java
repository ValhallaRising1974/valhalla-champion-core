
public class Rhinoceros {
    private String form = "Metallic Beast";
    private String speedInJungle = "High";
    private String speedInLanes = "Reduced";
    private boolean staminaGenerator = true;

    public String breakdown(boolean collidedWithWall) {
        if (collidedWithWall) {
            return "Damage and Stun";
        } else {
            return "Damage and Armor Break";
        }
    }

    public String toRaise() {
        return "Provokes enemies and disables their attacks";
    }

    public String rearStupidity(boolean nearWall) {
        if (nearWall) {
            return "Damage, Slow and Disorientation";
        } else {
            return "Damage only";
        }
    }

    public String ultimate() {
        return "Splits into 3, charges long distance, deals Damage, Slow, Armor and Magic Resist reduction";
    }
}
