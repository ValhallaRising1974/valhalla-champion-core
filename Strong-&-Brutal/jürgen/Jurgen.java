// Jurgen.java - O Guerreiro Caveira Punk

public class Jurgen {
    private int berserkerStacks;
    private boolean maxStacks;

    public Jurgen() {
        this.berserkerStacks = 0;
        this.maxStacks = false;
    }

    public void gainBerserker() {
        if (berserkerStacks < 7) {
            berserkerStacks++;
        }
        maxStacks = (berserkerStacks == 7);
    }

    public void spinningKick() {
        System.out.println("Q - Spinning Kick: Dano 220 → 1050" + (maxStacks ? " (Ignora armadura)" : ""));
    }

    public void doubleKick() {
        System.out.println("W - Double Kick: Dano 330 → 1180" + (maxStacks ? " (Atordoa o inimigo)" : ""));
    }

    public void punchAndElbow() {
        System.out.println("E - Punch and Elbow: Dano 400 → 1700" + (maxStacks ? " (Empurra o inimigo)" : ""));
    }

    public void kneeFury() {
        System.out.println("R - Knee Fury: Dano 700 → 3000" + (maxStacks ? " (Cura 50% do dano e ganha resistência extra)" : ""));
    }
}
