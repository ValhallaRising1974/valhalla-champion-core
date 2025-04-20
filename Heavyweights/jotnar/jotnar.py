
class Jotnar:
    def __init__(self):
        self.name = "Jotnar"
        self.class_type = "Juggernaut"
        self.role = "Support"
        self.route = "Firestarter"
        self.resource = "Stamina"
        self.health = 1800
        self.stamina = 100
        self.armor = 120
        self.magic_resistance = 80
        self.regen_rate = 15

    def choke(self):
        return "Jotnar agarra o inimigo pela garganta, o joga ao chão, causando lentidão e quebra de armadura."

    def spinning_punch(self):
        return "Jotnar gira com os punhos cerrados, protegendo aliados próximos e desorientando inimigos."

    def crushing_throw(self):
        return "Jotnar agarra o inimigo, corre com ele e o arremessa ao chão, removendo armadura e resistência mágica."

    def rotating_domain(self):
        return "Jotnar gira um inimigo pelas pernas, golpeando os demais adversários ao redor com dano em área."
