// 🦈 Megalodon.java
// Champion Class – Bruiser (Valhalla Rising)

package valhalla.champions.bruisers;

public class Megalodon {
    private String name;
    private int health;
    private int damage;
    private int armor;
    private boolean rageState;

    public Megalodon() {
        this.name = "Megalodon";
        this.health = 3000;
        this.damage = 120;
        this.armor = 150;
        this.rageState = false;
    }

    public void syrupBlow() {
        System.out.println(name + " spins violently, slowing enemies and causing bleeding.");
    }

    public void somersault() {
        System.out.println(name + " flips and slams the opponent, cutting off healing.");
    }

    public void tailBlow() {
        System.out.println(name + " slashes with his tail, preventing target recovery.");
    }

    public void trashomp() {
        System.out.println(name + " submerges and executes a massive area bite!");
        rageState = false;
    }

    public void activateRage() {
        rageState = true;
        damage += 100;
        System.out.println(name + " enters Berzerker Regeneration mode!");
    }

    public static void main(String[] args) {
        Megalodon m = new Megalodon();
        m.syrupBlow();
        m.somersault();
        m.tailBlow();
        m.activateRage();
        m.trashomp();
    }
}
