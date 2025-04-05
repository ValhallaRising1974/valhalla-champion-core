// Tahtib.java – A Ninja Egípcia da Tempestade

public class Tahtib {
    private int berserker;
    
    public Tahtib() {
        this.berserker = 0;
    }

    public void gainBerserker() {
        berserker++;
    }

    public void doton() {
        System.out.println("Q – Doton: Cegueira por 2s, Dano Verdadeiro contínuo, Roubo de Vida.");
    }

    public void suiton() {
        System.out.println("W – Suiton: Lentidão por 2s, Dano Contínuo, Roubo de Vida.");
    }

    public void katon() {
        System.out.println("E – Katon: Dano ígneo por 1s, Redução de regeneração do inimigo.");
    }

    public void raiton() {
        System.out.println("R – Raiton (Ultimate): Dano elétrico massivo, Paralisia por 3s.");
    }
}
