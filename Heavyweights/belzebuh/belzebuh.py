
class Belzebuh:
    def __init__(self):
        self.form = "Demonic Giant"
        self.height = 4  # meters in lore
        self.on_map_height = "Standard"
        self.stamina_generator = True
        self.lane = "Highland"

    def rock_punch(self, hits_enemy=True):
        if hits_enemy:
            return "Damage and Slow"
        else:
            return "Knocks enemy upward"

    def headbutt(self):
        return "Lifts and throws enemy back, causing Damage and Armor Break"

    def gut_wrench(self):
        return "Back attack that causes Damage and Torpor"

    def hyperthrow(self):
        return "Grabs enemies, throws them upward and crushes them, dealing massive damage"
