
class Rhinoceros:
    def __init__(self):
        self.form = "Metallic Beast"
        self.speed_in_jungle = "High"
        self.speed_in_lanes = "Reduced"
        self.stamina_generator = True

    def breakdown(self, collided_with_wall):
        if collided_with_wall:
            return "Damage and Stun"
        else:
            return "Damage and Armor Break"

    def to_raise(self):
        return "Provokes enemies and disables their attacks"

    def rear_stupidity(self, near_wall):
        if near_wall:
            return "Damage, Slow and Disorientation"
        else:
            return "Damage only"

    def ultimate(self):
        return "Splits into 3, charges long distance, deals Damage, Slow, Armor and Magic Resist reduction"
