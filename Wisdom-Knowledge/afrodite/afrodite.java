
public class Afrodite {
    String name = "Afrodite";
    String classType = "Warlock";
    String role = "Damage";
    String route = "Middleway";
    String resource = "Mana";

    int health = 1300;
    int mana = 1000;
    int armor = 40;
    int magicResistance = 35;
    int abilityPower = 0;
    int loveMarks = 0;

    public String encantoCelestial() {
        loveMarks++;
        if (loveMarks == 3) {
            loveMarks = 0;
            return "Explosão de energia mágica! Dano em área: 700";
        }
        return "Marca de Desejo Ardente aplicada";
    }

    public String soproDeAfrodite(boolean targetMarked) {
        int baseDamage = 1150;
        if (targetMarked) {
            return "Beijo explodiu! Dano em área reduzido: " + (baseDamage * 0.5);
        }
        return "Dano mágico causado: " + baseDamage;
    }

    public String veuDoAmor(boolean veilBroken) {
        int pulseDamage = 480;
        int finalExplosion = 1300;
        if (veilBroken) {
            return "Véu explodiu! Dano mágico: " + finalExplosion;
        }
        return "Pulso de dano mágico por contato: " + pulseDamage;
    }

    public String toqueDeExtase(boolean targetMarked) {
        int baseDamage = 900;
        int bonusExplosion = targetMarked ? 800 : 0;
        return "Dano contínuo: " + baseDamage + ", Explosão bônus: " + bonusExplosion;
    }

    public String amorEterno(int targets, int markedTargets) {
        double baseDamage = 2500;
        double bonus = 0.2 * baseDamage * (targets - 1);
        int silenceDuration = markedTargets > 0 ? 1 : 0;
        return "Dano mágico total: " + (baseDamage + bonus) + ", Silêncio: " + silenceDuration + "s";
    }
}
