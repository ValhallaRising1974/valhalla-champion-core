# lara.py - Sniper explosiva de Valhalla Rising

class Lara:
    def __init__(self):
        self.critical_damage = 100
        self.basic_cooldown = 3
        self.ultimate_cooldown = 15

    def headshot(self):
        print("Headshot! -30% de resistência física e mágica no alvo.")

    def desert_eagle_burst(self, same_target):
        if same_target:
            print("Desert Eagle: Dano Verdadeiro no último disparo!")
        else:
            print("Disparo múltiplo com roubo de vida.")

    def dispersive_shot(self):
        print("Tiro Dispersivo! Dano Verdadeiro no centro da explosão.")

    def kabum(self, kills):
        if kills >= 4:
            self.ultimate_cooldown = 0
        elif kills == 3:
            self.ultimate_cooldown = 1
        elif kills == 2:
            self.ultimate_cooldown = 2
        elif kills == 1:
            self.ultimate_cooldown = 3
        else:
            self.ultimate_cooldown = 15
        print(f"KABUM! Cooldown da ultimate: {self.ultimate_cooldown}s")
