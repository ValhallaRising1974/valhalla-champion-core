
// Matombo.java

public class Matombo {
    private int damage = 95;
    private int maxDamage = 1100;
    private int armor = 70; // Médio
    private int resistance = 90; // Alta
    private int speed = 75; // Alta
    private int stamina = 100;
    private int health = 1000;

    public void passiveRegeneration() {
        System.out.println("Matombo regenera vida rapidamente fora de combate.");
    }

    public void qBackOff() {
        System.out.println("Matombo empurra o inimigo com força, causando lentidão e dano físico.");
    }

    public void wRollOut() {
        System.out.println("Matombo salta sobre o inimigo, causando stun e silence.");
    }

    public void eSpineBreaker() {
        System.out.println("Matombo quebra a coluna do inimigo com roubo de vida e joga ao chão.");
    }

    public void rGoFaceIt() {
        System.out.println("Matombo executa uma sequência de golpes brutais com redução de armadura.");
    }

    public static void main(String[] args) {
        Matombo matombo = new Matombo();
        matombo.passiveRegeneration();
        matombo.qBackOff();
        matombo.wRollOut();
        matombo.eSpineBreaker();
        matombo.rGoFaceIt();
    }
}
