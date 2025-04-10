
class Kamikaze:
    def __init__(self):
        self.health = 1000
        self.void_essence = 100

    def soul_burst(self, enemies):
        damage = 350
        for enemy in enemies:
            enemy.take_damage(damage)
        print("Kamikaze explodes in a soul burst!")

    def shadow_dash(self, target):
        print(f"Kamikaze dashes through {target}, becoming invisible.")

    def lingering_terror(self):
        print("Kamikaze leaves behind a shadow clone that terrifies enemies.")

    def ultimate_doom(self, enemies):
        damage = 1000
        for enemy in enemies:
            enemy.take_damage(damage)
        self.health = 0
        print("Kamikaze sacrifices himself in an explosion of despair!")
