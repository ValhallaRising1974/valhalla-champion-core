class Vanak:
    def __init__(self):
        self.true_damage_stacks = 0
        self.armor_broken = False
        self.magic_resist_removed = False

    def jab(self, target):
        print("Vanak uses Jab: 6 punches of true damage.")
        if target.hp <= 100:
            print("Target eliminated! Gaining true damage stack.")
            self.true_damage_stacks += 1
            self.jab(target)  # Reset if enemy is killed

    def hook(self, target):
        print("Vanak uses Hook: Two powerful hooks with true physical damage.")
        target.receive_damage(150)

    def knee_strike(self, target):
        print("Vanak uses Knee Strike: Multiple knee blows causing bleeding.")
        target.apply_effect('bleed', duration=3)
        if target.hp <= 100:
            self.true_damage_stacks += 1

    def ultimate(self, target):
        print("Vanak uses Ultimate - Stay Down and Be Spared: 10 kicks in frenzy!")
        self.armor_broken = True
        self.magic_resist_removed = True
        target.apply_effect('armor_break', duration=5)
        target.apply_effect('magic_resist_removed', duration=5)

# Exemplo de alvo
class Enemy:
    def __init__(self, hp):
        self.hp = hp

    def receive_damage(self, dmg):
        self.hp -= dmg
        print(f"Enemy receives {dmg} damage, remaining HP: {self.hp}")

    def apply_effect(self, effect, duration):
        print(f"Effect applied to enemy: {effect} for {duration} seconds")

# Demonstração
enemy = Enemy(100)
vanak = Vanak()
vanak.jab(enemy)
vanak.hook(enemy)
vanak.knee_strike(enemy)
vanak.ultimate(enemy)
