# bjorn.py - Sniper resiliente de Valhalla Rising

class Bjorn:
    def __init__(self):
        self.mobility = 100
        self.resistance = 90
        self.damage = 40

    def fireflye(self):
        print("Fireflye: Dispara tiros curtos que explodem em luz, causando lentidão e cegueira.")

    def boomerang(self):
        print("Boomerang: Armas lançadas em forma de bumerangue que ricocheteiam, quebrando armadura e aplicando lentidão.")

    def fast_and_furious(self, enemy_killed):
        print("Fast and Furious: 8 tiros em linha reta, causando dano contínuo.")
        if enemy_killed:
            print("Cooldown resetado por eliminação com habilidade!")

    def final_countdown(self, enemy_killed):
        print("The Final Countdown: Rajadas intensas de disparos.")
        if enemy_killed:
            print("Armas recarregadas automaticamente por abate!")
