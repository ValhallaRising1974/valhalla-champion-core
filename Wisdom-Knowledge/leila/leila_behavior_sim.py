# 🔮 leila_behavior_sim.py
# Simulated behavior logic for Leila – Warlock

import random
import time

class LeilaAI:
    def __init__(self):
        self.name = "Leila"
        self.mana = 100
        self.ultimate_ready = True

    def cast_spell(self):
        spell = random.choice(["Barrier", "Stun Orb", "Reveal Shadow", "Pulse Heal"])
        print(f"{self.name} casts '{spell}'.")

    def teleport_to_ally(self):
        ally = random.choice(["Tuane", "Lara", "Hogan"])
        print(f"{self.name} teleports to assist {ally}.")

    def use_ultimate(self):
        if self.ultimate_ready:
            print(f"{self.name} activates Astral Passage – warping to any location!")
            self.ultimate_ready = False
        else:
            print(f"{self.name}'s Astral Passage is not ready yet.")

    def simulate(self, turns=3):
        for i in range(turns):
            print(f"--- Turn {i+1} ---")
            self.cast_spell()
            self.teleport_to_ally()
            if random.random() > 0.5:
                self.use_ultimate()
            print()

if __name__ == "__main__":
    leila_bot = LeilaAI()
    leila_bot.simulate()
