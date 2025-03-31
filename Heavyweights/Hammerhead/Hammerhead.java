// 🛡️ Hammerhead.java
// Champion Class – Juggernaut (Valhalla Rising)

package valhalla.champions.juggernauts;

public class Hammerhead {
    private String name;
    private int health;
    private int armor;
    private boolean silentChargeReady;

    public Hammerhead() {
        this.name = "Hammerhead";
        this.health = 1850;
        this.armor = 160;
        this.silentChargeReady = true;
    }

    public void charge() {
        System.out.println(name + " charges forward like a fortress!");
    }

    public void absorbImpact() {
        System.out.println(name + " absorbs incoming damage through reinforced plating.");
    }

    public void silentWatch() {
        System.out.println(name + " remains motionless, surveying the chaos.");
    }

    public void ultimate() {
        if (silentChargeReady) {
            System.out.println(name + " unleashes 'Void Thrust' – a charge that shatters terrain and knocks back enemies!");
            silentChargeReady = false;
        } else {
            System.out.println(name + "'s ultimate is still cooling down.");
        }
    }

    public static void main(String[] args) {
        Hammerhead h = new Hammerhead();
        h.charge();
        h.absorbImpact();
        h.silentWatch();
        h.ultimate();
    }
}
