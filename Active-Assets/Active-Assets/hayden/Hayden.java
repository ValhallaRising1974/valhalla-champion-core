
public class Hayden {
    private String role = "Sniper";
    private String resource = "Vigor";
    private String lane = "Firestarter";

    public String passiveEffect() {
        return "Each shot reduces target's armor by 2% (up to 10x). Next shot ignores 50% armor at max stacks.";
    }

    public String q() {
        return "Precise Burst: Fires 3 quick critical shots. (330–1300 dmg). If all hit the same target, last deals true damage.";
    }

    public String w() {
        return "Brutal Bash: Melee buttstock hit. (350–1440 dmg). Breaks 50% of shield if active.";
    }

    public String e() {
        return "Precise Shot: Long-range shot through obstacles. (500–1800 dmg). +25% dmg if enemy is isolated.";
    }

    public String r() {
        return "Bullseye: Fires 7 devastating shots. (800–2500 dmg). If 4+ hit the same target, last one deals double damage.";
    }
}
