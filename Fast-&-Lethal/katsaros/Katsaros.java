
public class Katsaros {
    private int damage = 135;
    private final int maxDamage = 1450;
    private boolean isInvulnerable = false;

    public void spectralBlades() {
        System.out.println("Spinning spectral blades strike nearby enemies.");
    }

    public void phantomStep() {
        isInvulnerable = true;
        System.out.println("Katsaros teleports a short distance and becomes invulnerable.");
        // Reset after some duration
    }

    public void voidRend() {
        System.out.println("Void Rend strikes in an X pattern, ignoring armor.");
    }

    public void shadowExecution() {
        System.out.println("Katsaros enters the target's shadow, becomes undetectable for 3 seconds, then executes.");
    }

    public void essenceOfVoid() {
        System.out.println("Passive: Essence of the Void enhances abilities.");
    }
}
