// Lara.java - Sniper explosiva de Valhalla Rising

public class Lara {
    private int criticalDamage;
    private int basicCooldown;
    private int ultimateCooldown;

    public Lara() {
        this.criticalDamage = 100;
        this.basicCooldown = 3;
        this.ultimateCooldown = 15;
    }

    public void headshot() {
        System.out.println("Headshot! -30% resistência física e mágica no alvo.");
    }

    public void desertEagleBurst(boolean sameTarget) {
        if (sameTarget) {
            System.out.println("Desert Eagle causa Dano Verdadeiro no último disparo!");
        } else {
            System.out.println("Disparo múltiplo com roubo de vida.");
        }
    }

    public void dispersiveShot() {
        System.out.println("Tiro Dispersivo! Dano Verdadeiro no centro da explosão.");
    }

    public void kabum(int kills) {
        if (kills >= 4) {
            this.ultimateCooldown = 0;
        } else if (kills == 3) {
            this.ultimateCooldown = 1;
        } else if (kills == 2) {
            this.ultimateCooldown = 2;
        } else if (kills == 1) {
            this.ultimateCooldown = 3;
        } else {
            this.ultimateCooldown = 15;
        }
        System.out.println("KABUM! Cooldown da ultimate: " + this.ultimateCooldown + "s");
    }
}
