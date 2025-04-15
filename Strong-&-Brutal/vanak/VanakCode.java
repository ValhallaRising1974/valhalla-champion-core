public class Vanak {
    private int trueDamageStacks = 0;

    public void jab(Enemy target) {
        System.out.println("Vanak uses Jab: 6 punches of true damage.");
        if (target.getHp() <= 100) {
            System.out.println("Target eliminated! Gaining true damage stack.");
            trueDamageStacks++;
            jab(target); // Reset if enemy is killed
        }
    }

    public void hook(Enemy target) {
        System.out.println("Vanak uses Hook: Two powerful hooks with true physical damage.");
        target.receiveDamage(150);
    }

    public void kneeStrike(Enemy target) {
        System.out.println("Vanak uses Knee Strike: Knee blows causing bleeding.");
        target.applyEffect("bleed", 3);
        if (target.getHp() <= 100) {
            trueDamageStacks++;
        }
    }

    public void ultimate(Enemy target) {
        System.out.println("Vanak uses Ultimate - Stay Down and Be Spared: 10 kicks!");
        target.applyEffect("armor_break", 5);
        target.applyEffect("magic_resist_removed", 5);
    }
}

class Enemy {
    private int hp;

    public Enemy(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void receiveDamage(int damage) {
        hp -= damage;
        System.out.println("Enemy receives " + damage + " damage. Remaining HP: " + hp);
    }

    public void applyEffect(String effect, int duration) {
        System.out.println("Effect applied to enemy: " + effect + " for " + duration + " seconds");
    }
}

class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Vanak vanak = new Vanak();
        vanak.jab(enemy);
        vanak.hook(enemy);
        vanak.kneeStrike(enemy);
        vanak.ultimate(enemy);
    }
}
