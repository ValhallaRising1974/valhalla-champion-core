// 🛡️ Hammerhand.java
// Champion Class – Juggernaut (Valhalla Rising)

package valhalla.champions.juggernauts;

public class Hammerhand {
    private String name;
    private int health;
    private int armor;
    private boolean enraged;

    public Hammerhand() {
        this.name = "Hammerhand";
        this.health = 1800;
        this.armor = 150;
        this.enraged = false;
    }

    public void slam() {
        System.out.println(name + " performs a seismic slam!");
    }

    public void block() {
        System.out.println(name + " raises a massive barrier of stone and metal.");
    }

    public void roar() {
        enraged = true;
        System.out.println(name + " roars, becoming enraged and boosting attack power!");
    }

    public void ultimate() {
        if (enraged) {
            System.out.println(name + " uses 'Earth Requiem' – unleashing shockwaves in all directions!");
            enraged = false;
        } else {
            System.out.println(name + " must be enraged to use the ultimate.");
        }
    }

    public static void main(String[] args) {
        Hammerhand h = new Hammerhand();
        h.slam();
        h.block();
        h.roar();
        h.ultimate();
    }
}
