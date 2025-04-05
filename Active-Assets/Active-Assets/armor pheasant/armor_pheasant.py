# armor_pheasant.py - Sniper alado de dano misto e ataques aéreos

class ArmorPheasant:
    def __init__(self):
        self.vigor = 100
        self.is_flying = False

    def quick_shot(self):
        print("QuickShot: Dispara 10 tiros ultra rápidos com dano físico contínuo.")

    def pen_and_fire(self):
        print("Pen and Fire: Dispara 8 penas afiadas e 8 tiros, causando lentidão e dano misto ao longo do tempo.")

    def skyburst(self):
        self.is_flying = True
        print("Skyburst: Alça voo vertical e lança granadas de concussão, causando dano em área e perfuração de armadura.")

    def golden_pheasant(self):
        print("Golden Pheasant (Ultimate): Transforma-se numa seta dourada e dispara um raio flamejante com dano ígneo e lentidão.")
