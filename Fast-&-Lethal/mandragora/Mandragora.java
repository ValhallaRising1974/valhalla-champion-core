
public class Mandragora extends Champion {
    public Mandragora() {
        super("Mandrágora", "Slayer", "The Middle Way");
        this.resource = "Essência do Void";
        this.health = 1800;
        this.armor = 150;
        this.magicResist = 120;
        this.movementSpeed = 350;
    }

    @Override
    public void passive() {
        System.out.println("Veneno Concentrado: Todos os golpes aumentam a concentração de veneno no alvo, causando dano ao longo do tempo.");
    }

    @Override
    public void abilityQ() {
        System.out.println("Q - Espinho Venenoso: Lança um espinho no inimigo. Dano: 220 → 1050.");
    }

    @Override
    public void abilityW() {
        System.out.println("W - Constrição Mortal: Se enrola no adversário, esmagando-o por 1.1s. Dano: 330 → 1180.");
    }

    @Override
    public void abilityE() {
        System.out.println("E - Sombra da Serpente: Fica invisível por 1.2s, estunando o inimigo ao reaparecer. Dano: 400 → 1700.");
    }

    @Override
    public void ultimate() {
        System.out.println("R - Presas Venenosas: Ativa seu veneno máximo, mordendo o inimigo e causando dano mágico venenoso massivo. Dano: 700 → 3000.");
    }
}
