
class MedvedevAI:
    def __init__(self):
        self.health = 1000
        self.max_health = 1000
        self.armor = 90
        self.attack_damage = 120

    def tear_apart(self, target):
        damage = self.attack_damage + 0.05 * self.max_health
        if target.get("bleeding", False):
            damage *= 1.3
        target["health"] -= damage
        target["bleeding"] = True
        target["bleed_duration"] = 2
        return f"Tear Apart dealt {damage:.1f} damage."

    def cut_and_beat(self, target):
        damage = self.attack_damage + 0.04 * self.health
        target["health"] -= damage
        target["bleeding"] = True
        target["bleed_duration"] = 1
        return f"Cut and Beat dealt {damage:.1f} damage."

    def get_up_and_break(self, target):
        damage = self.armor * 0.5 + self.attack_damage
        target["health"] -= damage
        target["armor_reduction"] = 15
        target["magic_resist_reduction"] = 15
        target["reduction_duration"] = 3
        return f"Get Up and Break dealt {damage:.1f} damage."

    def ultimate_roar(self, target):
        logs = []
        for i in range(4):
            damage = self.attack_damage + 0.05 * self.max_health
            target["health"] -= damage
            self.health -= self.max_health * 0.05
            logs.append(f"Patada {i+1} causou {damage:.1f} de dano.")
            if target["health"] <= 0:
                logs.append("Alvo eliminado! Ultimate reiniciado.")
                break
        return logs
