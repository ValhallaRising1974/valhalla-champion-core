
package champions.heavyweights;

public class Medvedev extends Juggernaut {
    public Medvedev() {
        super("Medvedev", "Highland (Top)", "Juggernaut");
        this.setArmor(90);
        this.setHealth(1000);
        this.setStaminaRegen(true);
        this.setUsesHealthAsResource(true);
    }

    @Override
    public void useQ(Champion target) {
        double baseDamage = this.getAttackDamage() + 0.05 * this.getMaxHealth();
        if (target.isBleeding()) {
            baseDamage *= 1.3;
        }
        target.applyDamage(baseDamage);
        target.applyBleed(2);
    }

    @Override
    public void useW(Champion target) {
        double damage = this.getAttackDamage() + 0.04 * this.getCurrentHealth();
        target.applyDamage(damage);
        target.applyBleed(1);
    }

    @Override
    public void useE(Champion target) {
        double damage = this.getArmor() * 0.5 + this.getAttackDamage();
        target.applyDamage(damage);
        target.reduceArmor(15, 3);
        target.reduceMagicResist(15, 3);
    }

    @Override
    public void useR(Champion target) {
        for (int i = 0; i < 4; i++) {
            double damage = this.getAttackDamage() + 0.05 * this.getMaxHealth();
            target.applyDamage(damage);
            this.reduceHealth(this.getMaxHealth() * 0.05);
            if (target.isDefeated()) {
                resetUltimateCooldown();
                break;
            }
        }
    }
}
