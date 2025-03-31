// 🔮 Leila.java
// Champion Class – Warlock (Valhalla Rising)

package valhalla.champions.warlocks;

public class Leila {
    private String name;
    private int health;
    private int mana;
    private boolean ultimateReady;

    public Leila() {
        this.name = "Leila";
        this.health = 720;
        this.mana = 200;
        this.ultimateReady = true;
    }

    public void castSpell(String spell) {
        System.out.println(name + " casts " + spell + " with arcane precision.");
    }

    public void supportAlly(String allyName) {
        System.out.println(name + " sends healing light to " + allyName + ".");
    }

    public void teleport(String location) {
        System.out.println(name + " teleports swiftly to " + location + ".");
    }

    public void ultimate() {
        if (ultimateReady) {
            System.out.println(name + " uses Astral Passage – teleporting to any location on the map!");
            ultimateReady = false;
        } else {
            System.out.println(name + "'s ultimate is still recharging.");
        }
    }

    public static void main(String[] args) {
        Leila leila = new Leila();
        leila.castSpell("Mind Barrier");
        leila.supportAlly("Tuane");
        leila.teleport("The Middle Way");
        leila.ultimate();
    }
}
