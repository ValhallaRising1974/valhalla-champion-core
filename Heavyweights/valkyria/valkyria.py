
class Valkyria:
    def __init__(self):
        self.name = "Valkyria"
        self.class_type = "Juggernaut"
        self.role = "Support"
        self.route = "Firestarter"
        self.resource = "Stamina"
        self.health = 1700
        self.stamina = 100
        self.armor = 110
        self.magic_resistance = 75
        self.regen_rate = 18

    def lanca_do_julgamento(self):
        return "Arremessa uma lança espiritual. Rebate em inimigo que atacou aliado, com dano extra baseado na armadura."

    def abraco_das_asas_douradas(self, ally_health):
        if ally_health < 30:
            return "Concede escudo e cura imediata ao aliado, além de redução de dano compartilhado."
        return "Concede escudo e regeneração de estamina, protegendo a si e ao aliado."

    def passagem_dos_honrados(self):
        return "Golpeia o chão e cria um caminho de luz. Inimigos são empurrados; aliados ganham escudo e velocidade."

    def chamado_de_asgard(self, target_health):
        if target_health < 15:
            return "Teleporta o aliado até ela e cura 40% da vida máxima."
        return "Reduz dano em área para a equipe por 6 segundos."
