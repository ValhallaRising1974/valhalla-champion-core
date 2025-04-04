
class Norabel:
    def __init__(self):
        self.role = "Support Warlock"
        self.resource = "Mana"
        self.lane = "Firestarter"
        self.range = "Medium"
        self.passive = "Mana Regeneration"
        self.family_bonus = {
            "cooldown_reduction": True,
            "mana_generation_boost": True,
            "movement_speed_bonus": "10%"
        }

    def q(self):
        return "Astral Resonance: Launches orb, stuns enemy."

    def w(self):
        return "Radiant Shield: Magic damage reduction shield on Sniper (3s)."

    def e(self):
        return "The Barrier: Blocks physical damage on self and Sniper."

    def r(self, damage_received):
        return f"Dusk’s Radiance: Returns {damage_received} damage to the attacker."
