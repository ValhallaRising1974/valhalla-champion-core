# 🧱 hammerhand_behavior_sim.py
# Simulated behavior for Hammerhand – Juggernaut

import time

class HammerhandAI:
    def __init__(self):
        self.name = "Hammerhand"
        self.enraged = False

    def slam(self):
        print(f"{self.name} performs a seismic slam!")

    def block(self):
        print(f"{self.name} raises a stone and metal shield!")

    def roar(self):
        self.enraged = True
        print(f"{self.name} roars and becomes enraged!")

    def ultimate(self):
        if self.enraged:
            print(f"{self.name} unleashes 'Earth Requiem' in all directions!")
            self.enraged = False
        else:
            print(f"{self.name} needs to roar before using his ultimate.")

    def simulate(self):
        self.slam()
        self.block()
        self.roar()
        time.sleep(1)
        self.ultimate()

if __name__ == "__main__":
    bot = HammerhandAI()
    bot.simulate()
