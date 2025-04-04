// Bjorn.java - Sniper resiliente de Valhalla Rising

public class Bjorn {
    private int mobility;
    private int resistance;
    private int damage;

    public Bjorn() {
        this.mobility = 100;
        this.resistance = 90;
        this.damage = 40;
    }

    public void fireflye() {
        System.out.println("Fireflye: Dispara tiros curtos que explodem em luz, causando lentidão e cegueira.");
    }

    public void boomerang() {
        System.out.println("Boomerang: Armas lançadas em forma de bumerangue que ricocheteiam, quebrando armadura e aplicando lentidão.");
    }

    public void fastAndFurious(boolean enemyKilled) {
        System.out.println("Fast and Furious: 8 tiros em linha reta, causando dano contínuo.");
        if (enemyKilled) {
            System.out.println("Cooldown resetado por eliminação com habilidade!");
        }
    }

    public void finalCountdown(boolean enemyKilled) {
        System.out.println("The Final Countdown: Rajadas intensas de disparos.");
        if (enemyKilled) {
            System.out.println("Armas recarregadas automaticamente por abate!");
        }
    }
}
