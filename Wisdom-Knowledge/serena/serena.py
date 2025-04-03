class Serena:
    def __init__(self, magic_power, mana):
        self.name = "Serena"
        self.magic_power = magic_power
        self.mana = mana

    def orb_of_beyond(self):
        return 200 + int(1.6 * self.magic_power)

    def codex_of_wisdom(self, target):
        return f"Hypnotized {target} for 3 seconds. It now fights for Serena."

    def eternal_circle(self):
        return 300 + int(1.8 * self.magic_power)

    def eternum(self, target_health_percent, received_heal):
        if target_health_percent <= 15:
            return "Target executed!"
        elif received_heal:
            return "Target receives burning damage for 3 seconds."
        else:
            return "Target survived the magical blast."
