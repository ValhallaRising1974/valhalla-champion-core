# 🧠 hogan_behavior_sim.py
# Simulated behavior logic for Hogan – Sniper

import random
import time

class HoganAI:
    def __init__(self):
        self.name = "Hogan"
        self.focus_level = 100
        self.position = "high ground"
        self.target_visible = True

    def scan_area(self):
        print(f"{self.name} scans the area from {self.position}...")
        time.sleep(1)
        self.target_visible = random.choice([True, False])

    def engage(self):
        if self.target_visible:
            print(f"{self.name} fires with precision!")
        else:
            print(f"{self.name} holds fire, waiting for a clear shot...")

    def reposition(self):
        self.position = random.choice(["left flank", "tower ruins", "forest ridge"])
        print(f"{self.name} relocates to {self.position}.")

    def simulate(self, rounds=3):
        for i in range(rounds):
            print(f"--- Round {i+1} ---")
            self.scan_area()
            self.engage()
            self.reposition()
            print()

if __name__ == "__main__":
    hogan_bot = HoganAI()
    hogan_bot.simulate()
