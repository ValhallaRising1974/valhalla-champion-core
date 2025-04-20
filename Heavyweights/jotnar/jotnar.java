
public class Jotnar {
    String name = "Jotnar";
    String classType = "Juggernaut";
    String role = "Support";
    String route = "Firestarter";
    String resource = "Stamina";

    int health = 1800;
    int stamina = 100;
    int armor = 120;
    int magicResistance = 80;
    int regenRate = 15;

    public String choke() {
        return "Jotnar agarra o inimigo pela garganta, o joga ao chão, causando lentidão e quebra de armadura.";
    }

    public String spinningPunch() {
        return "Jotnar gira com os punhos cerrados, protegendo aliados próximos e desorientando inimigos.";
    }

    public String crushingThrow() {
        return "Jotnar agarra o inimigo, corre com ele e o arremessa ao chão, removendo armadura e resistência mágica.";
    }

    public String rotatingDomain() {
        return "Jotnar gira um inimigo pelas pernas, golpeando os demais adversários ao redor com dano em área.";
    }
}
