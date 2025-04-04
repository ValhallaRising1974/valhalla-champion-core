
class Maya:
    def __init__(self):
        self.role = "Damage Warlock"
        self.resource = "Mana"
        self.range = "Long"
        self.lane = "Mid"
        self.passive = "Mana Regeneration"

    def q(self):
        return "K’iin: Light vortex ray causing 250–1900 magical damage, blind and slow (2s)"

    def w(self):
        return "Tseltalano: Astral arrows, magical damage (200–1600), slow, lifesteal, reduces attack speed"

    def e(self):
        return "Quetzaltenango: Shadow chases target for 3s, drains life (300–1700). Lingers 1s if lost"

    def r(self, enemies_hit):
        return f"Baktún 13, 4 Ahau, 3 K’ank’in: AoE light blast from the sky (600–3000 magical dmg), scales with enemies hit"
