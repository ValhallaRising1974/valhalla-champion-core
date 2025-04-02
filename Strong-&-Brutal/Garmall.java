
// Garmall.java - Campeão Bruiser de Valhalla Rising

public class Garmall {

    private String name = "Garmall - O Lobisomem Brutal";
    private String role = "Bruiser";
    private String lane = "Highland (Topo)";
    private String resource = "Berzerker";

    private int baseDamage = 130;
    private int maxDamage = 1400;
    private String resistance = "Média";
    private String armor = "Média";
    private String speed = "Alta";

    private int passiveStacks = 0;

    public void passiveSede() {
        passiveStacks++;
        if (passiveStacks >= 7) {
            System.out.println("Dano Crítico Verdadeiro ativado!");
            passiveStacks = 0;
        } else {
            System.out.println("Acúmulo de sede: " + passiveStacks);
        }
    }

    public void qGarraDilacerante() {
        int damage = 150 + (passiveStacks >= 7 ? 600 : 0);
        System.out.println("Q - Garra Dilacerante causa " + damage + " de dano.");
        passiveSede();
    }

    public void wInstintoPredatorio() {
        System.out.println("W - Instinto Predatório ativado: +30% de velocidade de movimento e +25% de ataque por 3s.");
    }

    public void eBichoPega(String decision) {
        if (decision.equalsIgnoreCase("correr")) {
            System.out.println("Dano aumentado em 30% no próximo ataque!");
        } else {
            System.out.println("Dano contínuo aplicado por 4 segundos.");
        }
    }

    public void rLoboLouco() {
        System.out.println("R - Lobo Louco ativado! Tornado de mordidas: 300 → 1500 de dano em área.");
    }

    public static void main(String[] args) {
        Garmall g = new Garmall();
        g.passiveSede();
        g.qGarraDilacerante();
        g.wInstintoPredatorio();
        g.eBichoPega("correr");
        g.rLoboLouco();
    }
}
