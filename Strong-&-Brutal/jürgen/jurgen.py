# jurgen.py - O Guerreiro Caveira Punk

class Jurgen:
    def __init__(self):
        self.berserker_stacks = 0

    def gain_berserker(self):
        if self.berserker_stacks < 7:
            self.berserker_stacks += 1

    def maxed(self):
        return self.berserker_stacks == 7

    def spinning_kick(self):
        msg = "Q - Spinning Kick: Dano 220 → 1050"
        if self.maxed():
            msg += " (Ignora armadura)"
        print(msg)

    def double_kick(self):
        msg = "W - Double Kick: Dano 330 → 1180"
        if self.maxed():
            msg += " (Atordoa o inimigo)"
        print(msg)

    def punch_and_elbow(self):
        msg = "E - Punch and Elbow: Dano 400 → 1700"
        if self.maxed():
            msg += " (Empurra o inimigo)"
        print(msg)

    def knee_fury(self):
        msg = "R - Knee Fury: Dano 700 → 3000"
        if self.maxed():
            msg += " (Cura 50% do dano e ganha resistência extra)"
        print(msg)
