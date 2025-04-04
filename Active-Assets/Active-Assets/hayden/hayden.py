
class Hayden:
    def __init__(self):
        self.role = "Sniper"
        self.resource = "Vigor"
        self.lane = "Firestarter"
        self.passive = "Corrosive Ammunition"

    def passive_effect(self):
        return "Each shot reduces target's armor by 2% (up to 10x). Next shot ignores 50% armor at max stacks."

    def q(self):
        return "Precise Burst: Fires 3 quick critical shots. (330–1300 dmg). If all hit the same target, last deals true damage."

    def w(self):
        return "Brutal Bash: Melee buttstock hit. (350–1440 dmg). Breaks 50% of shield if active."

    def e(self):
        return "Precise Shot: Long-range shot through obstacles. (500–1800 dmg). +25% dmg if enemy is isolated."

    def r(self):
        return "Bullseye: Fires 7 devastating shots. (800–2500 dmg). If 4+ hit the same target, last one deals double damage."
