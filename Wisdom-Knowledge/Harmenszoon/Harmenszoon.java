public class Harmenszoon {

    private String role = "Warlock";
    private String lane = "Mid Lane";
    private int mana = 1000;
    private int health = 1500;

    public void useQ() {
        System.out.println("Casting Distortion: Confuses the enemy!");
    }

    public void useW() {
        System.out.println("Casting Disfunction: Enemy attacks itself!");
    }

    public void useE() {
        System.out.println("Casting Dehydrate: Slows and drains vitality.");
    }

    public void useR() {
        System.out.println("Casting Desiderata: Removes will to fight!");
    }

    public void showStatus() {
        System.out.println("Role: " + role + ", Lane: " + lane);
        System.out.println("Mana: " + mana + ", Health: " + health);
    }

    public static void main(String[] args) {
        Harmenszoon harmenszoon = new Harmenszoon();
        harmenszoon.showStatus();
        harmenszoon.useQ();
        harmenszoon.useW();
        harmenszoon.useE();
        harmenszoon.useR();
    }
}
