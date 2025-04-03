public class SethChampion {
    private final String name = "Seth";
    private final String title = "O Ceifador Sombrio";
    private int health;
    private int essenceOfVoid;
    private boolean markOfDeathActive;

    public SethChampion() {
        this.health = 1000;
        this.essenceOfVoid = 0;
        this.markOfDeathActive = false;
    }

    public void regenerateEssence() {
        if (essenceOfVoid < 100) {
            essenceOfVoid += 10;
            System.out.println("Essência do Void: " + essenceOfVoid);
        }
    }

    public void ravenousDagger() {
        System.out.println(name + " usa Ravenous Dagger! Dano verdadeiro + sangramento por 3s.");
        applyMarkOfDeath();
    }

    public void swiftBow(int enemiesHit) {
        System.out.println(name + " usa Swift Bow! Causa lentidão e roubo de vida.");
        if (enemiesHit >= 3) {
            System.out.println("Seth ganha um escudo temporário.");
        }
        applyMarkOfDeath();
    }

    public void verticalSlash(boolean targetBleeding) {
        System.out.println(name + " usa Vertical Slash! Dano verdadeiro + cegueira + sangramento.");
        if (targetBleeding) {
            System.out.println("Efeitos prolongados por 1 segundo!");
        }
        applyMarkOfDeath();
    }

    public void slaughter(boolean canExecute, boolean teamAce) {
        if (canExecute) {
            System.out.println(name + " usa Slaughter! Executando inimigo(s).");
            if (teamAce) {
                System.out.println("Buff de dano verdadeiro concedido aos aliados por 6s!");
            }
        } else {
            System.out.println("Slaughter não pode ser ativado: Marca da Morte não está ativa.");
        }
    }

    private void applyMarkOfDeath() {
        this.markOfDeathActive = true;
        System.out.println("Marca da Morte aplicada ao alvo.");
    }

    public static void main(String[] args) {
        SethChampion seth = new SethChampion();
        seth.regenerateEssence();
        seth.ravenousDagger();
        seth.swiftBow(3);
        seth.verticalSlash(true);
        seth.slaughter(true, true);
    }
}