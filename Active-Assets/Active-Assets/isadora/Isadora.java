// Isadora.java - Sniper veterana de Valhalla Rising

public class Isadora {
    private int criticalDamage;
    private int armorPenetration;
    private int cooldownUltimate;

    public Isadora() {
        this.criticalDamage = 150;
        this.armorPenetration = 25;
        this.cooldownUltimate = 20;
    }

    public void rottenAlone() {
        System.out.println("Rotten Alone: Explosão ácida com dano contínuo, quebra de armadura e roubo de vida.");
    }

    public void slowlyYouRot() {
        System.out.println("Slowly You Rot: 7 tiros com roubo de vida e slow. Cada um libera gás dilacerante.");
    }

    public void dodgeAndStrike() {
        System.out.println("Dodge and Strike: Esquiva e duas coronhadas. Dano + Atordoamento.");
    }

    public void blastAllOfThem() {
        System.out.println("Blast All of Them: 7 projéteis perfurantes com dano crítico massivo ativados.");
    }
}
