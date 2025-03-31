# ⚔️ galdhopiggen_behavior_sim.py
# Simulated behavior logic for Galdhøpiggen – Slayer

import random
import time

class GaldhopiggenAI:
    def __init__(self):
        self.name = "Galdhøpiggen"
        self.ultimate_ready = True
        self.kills = 0

    def mark(self):
        target = random.choice(["Leila", "Hammerhead", "Hogan"])
        print(f"{self.name} marks {target} with the Death Sigil.")
        return target

    def dash(self):
        direction = random.choice(["north", "east", "west", "south"])
        print(f"{self.name} dashes to the {direction}.")

    def execute(self, target):
        print(f"{self.name} executes {target} and disappears into the mist.")
        self.kills += 1

    def ultimate(self, target):
        if self.ultimate_ready:
            print(f"{self.name} takes flight and instantly slays {target} across the map!")
            self.kills += 1
            self.ultimate_ready = False
        else:
            print(f"{self.name}'s wings are still recovering...")

    def simulate(self):
        marked = self.mark()
        time.sleep(1)
        self.dash()
        time.sleep(1)
        if random.random() > 0.5:
            self.ultimate(marked)
        else:
            self.execute(marked)

if __name__ == "__main__":
    bot = GaldhopiggenAI()
    bot.simulate()
