
class Galdhopiggen:
    def __init__(self):
        self.name = "Galdhøpiggen"
        self.role = "Slayer"
        self.lane = "Middleway"
        self.resource = "Essência do Void"
        self.hp = 1000
        self.speed = "Alta"
    
    def skice_slash(self):
        return "Realiza 7 cortes com espada flamejante, causando dano ígneo."

    def dragon_breath(self):
        return "Lança uma torrente em chamas por 4s, causando dano ígneo, lentidão e quebra de armadura."

    def piercing_claws(self):
        return "Prende o alvo com a espada e ataca com garras, causando sangramento e removendo resistência mágica."

    def marked_for_extinction(self, target_hp_percent):
        if target_hp_percent < 15:
            return "Executa o alvo com a marca da morte."
        else:
            return "O alvo ainda não está vulnerável à execução."
