
class Brigitte:
    def __init__(self):
        self.stamina = 100
        self.aura_active = True

    def paralyzing_smite(self):
        print("Brigitte strikes! Enemy slowed for 2 seconds.")

    def shield_smite(self):
        print("Shield raised! Blocking attacks and creating protective barrier.")

    def northern_vortex(self):
        print("Enemies blinded and disoriented!")

    def uppsala_halls(self):
        print("Brigitte charges forward, knocking down and immobilizing enemies!")

    def passive_aura(self):
        if self.aura_active:
            print("Protective Aura is active: bonus armor and magic resist granted.")
