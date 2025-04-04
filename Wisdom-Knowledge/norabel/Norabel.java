
public class Norabel {
    private String role = "Support Warlock";
    private String resource = "Mana";
    private String lane = "Firestarter";
    private String range = "Medium";

    public String q() {
        return "Astral Resonance: Launches orb, stuns enemy.";
    }

    public String w() {
        return "Radiant Shield: Magic damage reduction shield on Sniper (3s).";
    }

    public String e() {
        return "The Barrier: Blocks physical damage on self and Sniper.";
    }

    public String r(int damageReceived) {
        return "Dusk’s Radiance: Returns " + damageReceived + " damage to the attacker.";
    }
}
