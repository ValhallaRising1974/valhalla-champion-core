// 🛡️ Hogan.java
// Champion Class – Sniper (Valhalla Rising)

package valhalla.champions.snipers;

public class Hogan {
    private String name;
    private int health;
    private int energy;
    private int range;
    private int precision;

    public Hogan() {
        this.name = "Hogan";
        this.health = 950;
        this.energy = 120;
        this.range = 90;
        this.precision = 98;
    }

    public void scout() {
        System.out.println(name + " scans the battlefield silently...");
    }

    public void snipe(String target) {
        System.out.println(name + " takes aim at " + target + " with deadly precision.");
    }

    public void relocate() {
        System.out.println(name + " moves to a new vantage point.");
    }

    public void ultimate() {
        System.out.println(name + " activates Silent Justice – hitting enemies through walls.");
    }

    public static void main(String[] args) {
        Hogan hogan = new Hogan();
        hogan.scout();
        hogan.snipe("enemy warlock");
        hogan.relocate();
        hogan.ultimate();
    }
}
