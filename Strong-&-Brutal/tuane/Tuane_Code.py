# Author: Marcelo dos Santos Prado – CPF: 660.020.791-49

class Tuane:
    def __init__(self):
        self.berzerker = 0

    def huka_huka(self):
        print("Stuns enemy for 3 seconds with two punches.")
        self.gain_berzerker()

    def kapi(self):
        print("Performs a split and hits the opponent in the belly – 3s stun.")
        self.gain_berzerker()

    def xondaro(self):
        print("Jumps on enemy shoulders and stuns for 3s.")
        self.gain_berzerker()

    def oio_ultimate(self):
        print("Breaks armor and removes magic resistance.")
        self.gain_berzerker()

    def gain_berzerker(self):
        self.berzerker += 10
