public class Emi {
    private int trueDamage = 120;
    private int bleedDuration = 5;
    private boolean isStealthed = false;

    public void markOfDeath() {
        System.out.println("Emi marca o alvo para execução.");
    }

    public void shadowStrike() {
        System.out.println("Emi aplica dano verdadeiro e causa sangramento por " + bleedDuration + " segundos.");
    }

    public void vanish() {
        isStealthed = true;
        System.out.println("Emi entra em modo furtivo.");
    }

    public void slaughter(int enemiesKilled) {
        System.out.println("Emi executa inimigos com a Marca da Morte.");
        if (enemiesKilled == 5) {
            System.out.println("Buff de dano verdadeiro concedido a todos os aliados por 6 segundos.");
        }
    }
}