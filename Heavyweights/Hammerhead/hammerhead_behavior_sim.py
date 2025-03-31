# 🧱 hammerhead_behavior_sim.py
# Simulated behavior for Hammerhead – Juggernaut

import time

class HammerheadAI:
    def __init__(self):
        self.name = "Hammerhead"
        self.ultimate_ready = True

    def charge(self):
        print(f"{self.name} charges forward with tremendous force!")

    def absorb(self):
        print(f"{self.name} absorbs the shock of all surrounding attacks.")

    def wait_and_watch(self):
        print(f"{self.name} stands in silence, analyzing movement.")

    def ultimate(self):
        if self.ultimate_ready:
            print(f"{self.name} activates 'Void Thrust' – breaking the terrain and stunning enemies.")
            self.ultimate_ready = False
        else:
            print(f"{self.name}'s ultimate is recharging.")

    def simulate(self):
        self.charge()
        self.absorb()
        self.wait_and_watch()
        time.sleep(1)
        self.ultimate()

if __name__ == "__main__":
    bot = HammerheadAI()
    bot.simulate()
