
# matombo_ai.py

class Matombo:
    def __init__(self):
        self.damage = 95
        self.max_damage = 1100
        self.armor = 70  # Medium
        self.resistance = 90  # High
        self.speed = 75  # High
        self.stamina = 100
        self.health = 1000

    def passive_regeneration(self):
        return "Matombo regenerates health rapidly outside combat."

    def q_back_off(self):
        return "Matombo knocks enemy back, applies slow and deals physical damage."

    def w_roll_out(self):
        return "Matombo jumps onto enemy, stunning and silencing."

    def e_spine_breaker(self):
        return "Matombo breaks enemy's back with lifesteal and throws them to the ground."

    def r_go_face_it(self):
        return "Matombo slams fists down with brutal force, reducing armor and repeating if enemy dies."


if __name__ == "__main__":
    matombo = Matombo()
    print(matombo.passive_regeneration())
    print(matombo.q_back_off())
    print(matombo.w_roll_out())
    print(matombo.e_spine_breaker())
    print(matombo.r_go_face_it())
