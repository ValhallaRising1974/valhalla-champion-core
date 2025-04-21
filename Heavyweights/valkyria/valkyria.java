
public class Valkyria {
    String name = "Valkyria";
    String classType = "Juggernaut";
    String role = "Support";
    String route = "Firestarter";
    String resource = "Stamina";

    int health = 1700;
    int stamina = 100;
    int armor = 110;
    int magicResistance = 75;
    int regenRate = 18;

    public String lancaDoJulgamento(boolean targetMarked) {
        return "Arremessa uma lança espiritual. Rebate em inimigo que atacou aliado, com dano extra baseado na armadura.";
    }

    public String abracoDasAsasDouradas(int allyHealth) {
        if (allyHealth < 30) {
            return "Concede escudo e cura imediata ao aliado, além de redução de dano compartilhado.";
        }
        return "Concede escudo e regeneração de estamina, protegendo a si e ao aliado.";
    }

    public String passagemDosHonrados() {
        return "Golpeia o chão e cria um caminho de luz. Inimigos são empurrados; aliados ganham escudo e velocidade.";
    }

    public String chamadoDeAsgard(int targetHealth) {
        if (targetHealth < 15) {
            return "Teleporta o aliado até ela e cura 40% da vida máxima.";
        }
        return "Reduz dano em área para a equipe por 6 segundos.";
    }
}
