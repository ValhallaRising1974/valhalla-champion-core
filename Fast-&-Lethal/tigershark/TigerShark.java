// TigerShark.java
public class TigerShark {
    private String name = "TigerShark";
    private String role = "Slayer";
    private String lane = "Oblivion";
    private String resource = "Essência do Void";

    public void passive() {
        System.out.println("Sede de Sangue: aumenta o dano conforme o inimigo perde vida.");
    }

    public void abilityQ() {
        System.out.println("Corte Predatório: investida que causa dano verdadeiro e sangramento.");
    }

    public void abilityW() {
        System.out.println("Cauda Cortante: giro com a cauda que afasta os inimigos e aplica lentidão.");
    }

    public void abilityE() {
        System.out.println("Rugido das Profundezas: silencia os inimigos e revela invisíveis.");
    }

    public void ultimate() {
        System.out.println("Mergulho Mortal: salta e atinge todos os inimigos na área com dano massivo.");
    }
}