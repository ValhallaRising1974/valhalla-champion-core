
class Katsaros:
    def __init__(self):
        self.damage = 135
        self.max_damage = 1450
        self.is_invulnerable = False

    def spectral_blades(self):
        print("Spinning spectral blades strike nearby enemies.")

    def phantom_step(self):
        self.is_invulnerable = True
        print("Katsaros teleports a short distance and becomes invulnerable.")

    def void_rend(self):
        print("Void Rend strikes in an X pattern, ignoring armor.")

    def shadow_execution(self):
        print("Katsaros enters the target's shadow, becomes undetectable for 3 seconds, then executes.")

    def essence_of_void(self):
        print("Passive: Essence of the Void enhances abilities.")
