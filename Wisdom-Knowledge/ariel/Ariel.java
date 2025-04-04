
public class Ariel {
    private String role = "Support Warlock";
    private String resource = "Mana";
    private String health = "High";
    private String damage = "None";
    private String armor = "Low";
    private String cc = "Excellent";
    private double goldShareOnKill = 0.7;

    public String q(String target) {
        if (target.equals("enemy")) return "Disorients and pushes enemy back for 2s";
        if (target.equals("ally")) return "Grants movement speed";
        return "";
    }

    public String w(String target) {
        if (target.equals("enemy")) return "Dizzies and paralyzes";
        if (target.equals("ally")) return "Heals 15% life, up to 100% gradually";
        return "";
    }

    public String e(String target) {
        if (target.equals("enemy")) return "Roots and slows";
        if (target.equals("ally")) return "Reduces skill cooldowns by 100%";
        return "";
    }

    public String r(boolean enemy, boolean ally) {
        if (enemy && ally) return "Pulls enemies to center and heals allies for 3s";
        if (enemy) return "Pulls enemies to center for 3s";
        if (ally) return "Heals allies for 3s";
        return "";
    }
}
