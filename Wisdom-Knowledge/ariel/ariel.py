
class Ariel:
    def __init__(self):
        self.role = "Support Warlock"
        self.resource = "Mana"
        self.health = "High"
        self.damage = "None"
        self.armor = "Low"
        self.cc = "Excellent"
        self.passive = "Mana Regeneration"
        self.gold_share_on_kill = 0.7

    def q(self, target):
        if target == "enemy":
            return "Disorients and pushes enemy back for 2s"
        elif target == "ally":
            return "Grants movement speed"

    def w(self, target):
        if target == "enemy":
            return "Dizzies and paralyzes"
        elif target == "ally":
            return "Heals 15% life, up to 100% gradually"

    def e(self, target):
        if target == "enemy":
            return "Roots and slows"
        elif target == "ally":
            return "Reduces skill cooldowns by 100%"

    def r(self, targets):
        if "enemy" in targets and "ally" in targets:
            return "Pulls enemies to center and heals allies for 3s"
        elif "enemy" in targets:
            return "Pulls enemies to center for 3s"
        elif "ally" in targets:
            return "Heals allies for 3s"
