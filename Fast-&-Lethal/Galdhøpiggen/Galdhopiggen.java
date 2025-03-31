// ⚔️ Galdhopiggen.java
// Champion Class – Slayer (Valhalla Rising)

package valhalla.champions.slayers;

public class Galdhopiggen {
    private String name;
    private int agility;
    private int kills;
    private boolean ultimateReady;

    public Galdhopiggen() {
        this.name = "Galdhopiggen";
        this.agility = 100;
        this.kills = 0;
        this.ultimateReady = true;
    }

    public void markTarget(String target) {
        System.out.println(name + " marks " + target + " with the Death Sigil.");
    }

    public void dash(String direction) {
        System.out.println(name + " dashes to the " + direction + " with blinding speed.");
    }

    public void execute(String target) {
        System.out.println(name + " executes " + target + " with surgical precision!");
        kills++;
    }

    public void ultimate(String markedTarget) {
        if (ultimateReady) {
            System.out.println(name + " soars across the map to eliminate " + markedTarget + "!");
            kills++;
            ultimateReady = false;
        } else {
            System.out.println(name + "'s wings are recharging...");
        }
    }

    public static void main(String[] args) {
        Galdhopiggen g = new Galdhopiggen();
        g.markTarget("Warlock");
        g.dash("left");
        g.execute("Sniper");
        g.ultimate("Bruiser");
    }
}
