
public class Kamikaze {
    private int health = 1000;
    private int voidEssence = 100;

    public void soulBurst(Enemy[] enemies) {
        int damage = 350;
        for (Enemy enemy : enemies) {
            enemy.takeDamage(damage);
        }
        System.out.println("Kamikaze explodes in a soul burst!");
    }

    public void shadowDash(String target) {
        System.out.println("Kamikaze dashes through " + target + ", becoming invisible.");
    }

    public void lingeringTerror() {
        System.out.println("Kamikaze leaves behind a shadow clone that terrifies enemies.");
    }

    public void ultimateDoom(Enemy[] enemies) {
        int damage = 1000;
        for (Enemy enemy : enemies) {
            enemy.takeDamage(damage);
        }
        this.health = 0;
        System.out.println("Kamikaze sacrifices himself in an explosion of despair!");
    }
}
