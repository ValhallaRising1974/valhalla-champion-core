# tiger_shark.py

class TigerShark:
    def __init__(self):
        self.name = "TigerShark"
        self.role = "Slayer"
        self.lane = "Oblivion"
        self.resource = "Essência do Void"

    def passive(self):
        return "Sede de Sangue: aumenta o dano conforme o inimigo perde vida."

    def ability_q(self):
        return "Corte Predatório: investida que causa dano verdadeiro e sangramento."

    def ability_w(self):
        return "Cauda Cortante: giro com a cauda que afasta os inimigos e aplica lentidão."

    def ability_e(self):
        return "Rugido das Profundezas: silencia os inimigos e revela invisíveis."

    def ultimate(self):
        return "Mergulho Mortal: salta e atinge todos os inimigos na área com dano massivo."

# Exemplo de uso
if __name__ == "__main__":
    ts = TigerShark()
    print(ts.passive())
    print(ts.ability_q())
    print(ts.ability_w())
    print(ts.ability_e())
    print(ts.ultimate())