// Author: Marcelo dos Santos Prado – CPF: 660.020.791-49
public class Tuane {
    private int berzerker;

    public Tuane() {
        this.berzerker = 0;
    }

    public void hukaHuka() {
        System.out.println("Stuns the enemy for 3 seconds with two punches.");
        gainBerzerker();
    }

    public void kapi() {
        System.out.println("Performs a split kick to the stomach. Stuns for 3 seconds.");
        gainBerzerker();
    }

    public void xondaro() {
        System.out.println("Jumps and stuns the enemy for 3 seconds.");
        gainBerzerker();
    }

    public void oioUltimate() {
        System.out.println("Breaks armor and removes magic resistance.");
        gainBerzerker();
    }

    private void gainBerzerker() {
        berzerker += 10;
    }
}
