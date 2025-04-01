// 🛡️ Freydis.java
// Champion Class – Bruiser (Valhalla Rising)

package valhalla.champions.bruisers;

public class Freydis {
    private String name;
    private int damage;
    private int speed;
    private int armor;
    private boolean berzerkerActive;
    private int comboCount;

    public Freydis() {
        this.name = "Freydis";
        this.damage = 85;
        this.speed = 100;
        this.armor = 60;
        this.berzerkerActive = false;
        this.comboCount = 0;
    }

    public void comeOutAndPlay() {
        System.out.println(name + " smashes with her baton, causing bleeding.");
    }

    public void strikeAndBleed() {
        System.out.println(name + " kicks and immobilizes the opponent before delivering critical blows.");
    }

    public void letsDoThis() {
        comboCount++;
        if (comboCount % 3 == 0) {
            System.out.println(name + " unleashes a powerful arc strike with double damage!");
        } else {
            System.out.println(name + " slashes in an arc.");
        }
    }

    public void fuckOffAndDie() {
        System.out.println(name + " grabs the enemy by the neck and slams them to the ground!");
    }

    public void activateBerzerker() {
        berzerkerActive = true;
        damage += 50;
        System.out.println(name + " enters Berzerker Regeneration mode!");
    }

    public static void main(String[] args) {
        Freydis f = new Freydis();
        f.comeOutAndPlay();
        f.strikeAndBleed();
        f.letsDoThis();
        f.letsDoThis();
        f.letsDoThis();
        f.fuckOffAndDie();
        f.activateBerzerker();
    }
}
