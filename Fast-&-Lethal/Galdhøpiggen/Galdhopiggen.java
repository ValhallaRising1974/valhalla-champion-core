
public class Galdhopiggen {
    private String name = "Galdhøpiggen";
    private String role = "Slayer";
    private String lane = "Middleway";
    private String resource = "Essência do Void";
    private int hp = 1000;
    private String speed = "Alta";

    public String skiceSlash() {
        return "Realiza 7 cortes com espada flamejante, causando dano ígneo.";
    }

    public String dragonBreath() {
        return "Lança uma torrente em chamas por 4s, causando dano ígneo, lentidão e quebra de armadura.";
    }

    public String piercingClaws() {
        return "Prende o alvo com a espada e ataca com garras, causando sangramento e removendo resistência mágica.";
    }

    public String markedForExtinction(int targetHpPercent) {
        if (targetHpPercent < 15) {
            return "Executa o alvo com a marca da morte.";
        } else {
            return "O alvo ainda não está vulnerável à execução.";
        }
    }
}
