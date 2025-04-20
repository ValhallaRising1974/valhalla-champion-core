
class Afrodite:
    def __init__(self):
        self.name = "Afrodite"
        self.class_type = "Warlock"
        self.role = "Damage"
        self.route = "Middleway"
        self.resource = "Mana"
        self.health = 1300
        self.mana = 1000
        self.armor = 40
        self.magic_resistance = 35
        self.ability_power = 0
        self.love_marks = 0

    def encanto_celestial(self):
        self.love_marks += 1
        if self.love_marks == 3:
            self.love_marks = 0
            return "Explosão de energia mágica! Dano em área: 700"
        return "Marca de Desejo Ardente aplicada"

    def sopro_de_afrodite(self, target_marked=False):
        base_damage = 1150
        if target_marked:
            return f"Beijo explodiu! Dano em área reduzido: {base_damage * 0.5}"
        return f"Dano mágico causado: {base_damage}"

    def veu_do_amor(self, veil_broken=False):
        pulse_damage = 480
        final_explosion = 1300
        if veil_broken:
            return f"Véu explodiu! Dano mágico: {final_explosion}"
        return f"Pulso de dano mágico por contato: {pulse_damage}"

    def toque_de_extase(self, target_marked=False):
        base_damage = 900
        bonus_explosion = 800 if target_marked else 0
        return f"Dano contínuo: {base_damage}, Explosão bônus: {bonus_explosion}"

    def amor_eterno(self, targets=1, marked_targets=0):
        base_damage = 2500
        bonus = 0.2 * base_damage * (targets - 1)
        silence_duration = 1 if marked_targets > 0 else 0
        return f"Dano mágico total: {base_damage + bonus}, Silêncio: {silence_duration}s"
