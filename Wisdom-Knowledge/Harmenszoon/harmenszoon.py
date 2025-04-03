class Harmenszoon:
    def __init__(self):
        self.role = "Warlock"
        self.lane = "Mid Lane"
        self.mana = 1000
        self.health = 1500

    def use_q(self):
        print("Casting Distortion: Confuses the enemy!")

    def use_w(self):
        print("Casting Disfunction: Enemy attacks itself!")

    def use_e(self):
        print("Casting Dehydrate: Slows and drains vitality.")

    def use_r(self):
        print("Casting Desiderata: Removes will to fight!")

    def show_status(self):
        print(f"Role: {self.role}, Lane: {self.lane}")
        print(f"Mana: {self.mana}, Health: {self.health}")

if __name__ == "__main__":
    harmenszoon = Harmenszoon()
    harmenszoon.show_status()
    harmenszoon.use_q()
    harmenszoon.use_w()
    harmenszoon.use_e()
    harmenszoon.use_r()
