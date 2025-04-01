# 🦈 megalodon_behavior_sim.py
# Simulated combat behavior of Megalodon – Bruiser Class

import time

class MegalodonAI:
    def __init__(self):
        self.name = "Megalodon"
        self.health = 3000
        self.damage = 120
        self.armor = 150
        self.rage_state = False

    def syrup_blow(self):
        print(f"{self.name} spins violently, slowing enemies and causing bleeding.")

    def somersault(self):
        print(f"{self.name} flips and slams the opponent, cutting off healing.")

    def tail_blow(self):
        print(f"{self.name} lashes with his tail, preventing healing.")

    def trashomp(self):
        print(f"{self.name} submerges and delivers a devastating area bite.")
        self.rage_state = False

    def activate_rage(self):
        self.rage_state = True
        self.damage += 100
        print(f"{self.name} activates Berzerker Regeneration!")

    def simulate_combat(self):
        self.syrup_blow()
        time.sleep(1)
        self.somersault()
        time.sleep(1)
        self.tail_blow()
        self.activate_rage()
        time.sleep(1)
        self.trashomp()

if __name__ == "__main__":
    bot = MegalodonAI()
    bot.simulate_combat()
