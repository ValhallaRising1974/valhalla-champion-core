// ArmorPheasant.java - Sniper alado de dano misto e ataques aéreos

public class ArmorPheasant {
    private int vigor;
    private boolean isFlying;

    public ArmorPheasant() {
        this.vigor = 100;
        this.isFlying = false;
    }

    public void quickShot() {
        System.out.println("QuickShot: Dispara 10 tiros ultra rápidos com dano físico contínuo.");
    }

    public void penAndFire() {
        System.out.println("Pen and Fire: Dispara 8 penas afiadas e 8 tiros, causando lentidão e dano misto ao longo do tempo.");
    }

    public void skyburst() {
        this.isFlying = true;
        System.out.println("Skyburst: Alça voo vertical e lança granadas de concussão, causando dano em área e perfuração de armadura.");
    }

    public void goldenPheasant() {
        System.out.println("Golden Pheasant (Ultimate): Transforma-se numa seta dourada e dispara um raio flamejante com dano ígneo e lentidão.");
    }
}
