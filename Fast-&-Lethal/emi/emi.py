class Emi:
    def __init__(self):
        self.true_damage = 120
        self.bleed_duration = 5
        self.is_stealthed = False

    def mark_of_death(self):
        print("Emi marca o alvo para execução.")

    def shadow_strike(self):
        print(f"Emi aplica dano verdadeiro e causa sangramento por {self.bleed_duration} segundos.")

    def vanish(self):
        self.is_stealthed = True
        print("Emi entra em modo furtivo.")

    def slaughter(self, enemies_killed):
        print("Emi executa inimigos com a Marca da Morte.")
        if enemies_killed == 5:
            print("Buff de dano verdadeiro concedido a todos os aliados por 6 segundos.")