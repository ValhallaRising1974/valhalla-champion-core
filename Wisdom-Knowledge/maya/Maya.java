
public class Maya {
    private String role = "Damage Warlock";
    private String resource = "Mana";
    private String range = "Long";
    private String lane = "Mid";

    public String q() {
        return "K’iin: Light vortex ray causing 250–1900 magical damage, blind and slow (2s)";
    }

    public String w() {
        return "Tseltalano: Astral arrows, magical damage (200–1600), slow, lifesteal, reduces attack speed";
    }

    public String e() {
        return "Quetzaltenango: Shadow chases target for 3s, drains life (300–1700). Lingers 1s if lost";
    }

    public String r(int enemiesHit) {
        return "Baktún 13, 4 Ahau, 3 K’ank’in: AoE light blast from the sky (600–3000 magical dmg), scales with enemies hit";
    }
}
