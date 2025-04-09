"""
Sistema de Runas – Valhalla Rising – The Parchment
Desenvolvido por Marcelo (2025)
Linguagem: Python 3
"""

# Estrutura básica para combinação e avaliação de runas

class Runa:
    def __init__(self, nome, cultura, subcategoria, raridade, tipo, sinergia):
        self.nome = nome
        self.cultura = cultura
        self.subcategoria = subcategoria
        self.raridade = raridade
        self.tipo = tipo
        self.sinergia = sinergia  # Valor de 1 a 3

class BuildRunica:
    def __init__(self):
        self.runas = []

    def adicionar_runa(self, runa):
        if len(self.runas) < 3 and not self.tem_cultura(runa.cultura):
            self.runas.append(runa)
            return True
        return False

    def tem_cultura(self, cultura):
        return any(r.cultura == cultura for r in self.runas)

    def eficiencia_total(self):
        return sum(r.sinergia for r in self.runas)

# Exemplo de uso
if __name__ == "__main__":
    r1 = Runa("Espinho de Garmr", "Viking", "Força Adaptiva", "Rara", "Condicional", 2)
    r2 = Runa("Lança de Tezcatlipoca", "Maya", "Foco", "Épica", "Condicional", 3)
    r3 = Runa("Sandálias de Hermes", "Grega", "Velocidade", "Comum", "Passiva", 2)

    build = BuildRunica()
    build.adicionar_runa(r1)
    build.adicionar_runa(r2)
    build.adicionar_runa(r3)

    print("Eficiência total da build:", build.eficiencia_total())
