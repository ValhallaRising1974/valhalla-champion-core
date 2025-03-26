// ValhallaChampion.java (Combat-ready)

public abstract class ValhallaChampion {
    protected String name;
    protected String role;
    protected int health;
    protected int mana;

    public ValhallaChampion(String name, String role, int health, int mana) {
        this.name = name;
        this.role = role;
        this.health = health;
        this.mana = mana;
    }

    public abstract String speak(String context);

    public void showStatus() {
        System.out.println("Champion: " + name);
        System.out.println("Role: " + role);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println();
    }

    public void attack(ValhallaChampion target) {
        int damage = 150;
        target.health -= damage;
        System.out.println(this.name + " attacks " + target.name + " for " + damage + " damage!");
    }

    public boolean isDefeated() {
        return this.health <= 0;
    }

    public void castUltimate(ValhallaChampion target) {
        System.out.println("(Ultimate not implemented for this champion.)");
    }
}

// Leila.java

public class Leila extends ValhallaChampion {

    public Leila() {
        super("Leila", "Warlock", 800, 1200);
    }

    @Override
    public String speak(String context) {
        return switch (context) {
            case "greeting" -> "The stars watched you arrive.";
            case "combat" -> "Peace walks with me, even in war.";
            case "attack" -> "Your light is fading.";
            case "ultimate" -> "Veil of the Void... I am everywhere.";
            default -> "... (silent presence)";
        };
    }

    @Override
    public void castUltimate(ValhallaChampion target) {
        int manaCost = 400;
        if (this.mana < manaCost) {
            System.out.println(name + " tried to cast her Ultimate but lacks the mana.");
            return;
        }

        this.mana -= manaCost;
        System.out.println(name + " casts Veil of the Void! ✨");
        System.out.println(speak("ultimate"));

        if (target != null) {
            int damage = 500;
            target.health -= damage;
            System.out.println(target.name + " is struck by shadow energy for " + damage + " damage!");
        } else {
            System.out.println("Leila vanishes in ethereal mist, reappearing across the battlefield.");
        }
    }
}

// Tuane.java

public class Tuane extends ValhallaChampion {

    public Tuane() {
        super("Tuane", "Bruiser", 1000, 400);
    }

    @Override
    public String speak(String context) {
        return switch (context) {
            case "greeting" -> "Let’s make this hurt.";
            case "combat" -> "I break more than bones.";
            case "attack" -> "Hold still!";
            default -> "... (silent wrath)";
        };
    }
}

// Main.java

public class Main {
    public static void main(String[] args) {
        ValhallaChampion leila = new Leila();
        ValhallaChampion tuane = new Tuane();

        System.out.println("== Valhalla Combat Test ==\n");
        leila.showStatus();
        tuane.showStatus();

        System.out.println(leila.speak("greeting"));
        System.out.println(tuane.speak("greeting"));
        System.out.println();

        System.out.println(leila.speak("combat"));
        System.out.println(tuane.speak("combat"));
        System.out.println();

        leila.attack(tuane);
        tuane.attack(leila);

        System.out.println();
        leila.castUltimate(tuane);
        System.out.println();

        leila.showStatus();
        tuane.showStatus();

        if (leila.isDefeated()) System.out.println("Leila has fallen.");
        if (tuane.isDefeated()) System.out.println("Tuane has fallen.");
    }
}
