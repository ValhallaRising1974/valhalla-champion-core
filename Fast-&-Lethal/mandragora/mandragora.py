
class Mandragora:
    def __init__(self):
        self.name = "Mandrágora"
        self.class_type = "Slayer"
        self.route = "The Middle Way"
        self.resource = "Essência do Void"
        self.health = 1800
        self.armor = 150
        self.magic_resist = 120
        self.movement_speed = 350

    def passive(self):
        return "Veneno Concentrado: Todos os golpes aumentam a concentração de veneno no alvo, causando dano ao longo do tempo."

    def ability_q(self):
        return "Q - Espinho Venenoso: Lança um espinho no inimigo. Dano: 220 → 1050."

    def ability_w(self):
        return "W - Constrição Mortal: Se enrola no adversário, esmagando-o por 1.1s. Dano: 330 → 1180."

    def ability_e(self):
        return "E - Sombra da Serpente: Fica invisível por 1.2s, estunando o inimigo ao reaparecer. Dano: 400 → 1700."

    def ultimate(self):
        return "R - Presas Venenosas: Ativa seu veneno máximo, mordendo o inimigo e causando dano mágico venenoso massivo. Dano: 700 → 3000."


# Exemplo de uso
if __name__ == "__main__":
    m = Mandragora()
    print(m.passive())
    print(m.ability_q())
    print(m.ability_w())
    print(m.ability_e())
    print(m.ultimate())
