# tahtib.py – A Ninja Egípcia da Tempestade

class Tahtib:
    def __init__(self):
        self.berserker = 0

    def gain_berserker(self):
        self.berserker += 1

    def doton(self):
        print("Q – Doton: Cegueira por 2s, Dano Verdadeiro contínuo, Roubo de Vida.")

    def suiton(self):
        print("W – Suiton: Lentidão por 2s, Dano Contínuo, Roubo de Vida.")

    def katon(self):
        print("E – Katon: Dano ígneo por 1s, Redução de regeneração do inimigo.")

    def raiton(self):
        print("R – Raiton (Ultimate): Dano elétrico massivo, Paralisia por 3s.")
