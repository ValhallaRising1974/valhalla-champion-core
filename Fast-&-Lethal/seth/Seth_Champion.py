class SethChampion:
    def __init__(self):
        self.name = "Seth"
        self.title = "O Ceifador Sombrio"
        self.health = 1000
        self.essence_of_void = 0
        self.mark_of_death_active = False

    def regenerate_essence(self):
        if self.essence_of_void < 100:
            self.essence_of_void += 10
            print(f"Essência do Void: {self.essence_of_void}")

    def ravenous_dagger(self):
        print(f"{self.name} usa Ravenous Dagger! Dano verdadeiro + sangramento por 3s.")
        self.apply_mark_of_death()

    def swift_bow(self, enemies_hit):
        print(f"{self.name} usa Swift Bow! Causa lentidão e roubo de vida.")
        if enemies_hit >= 3:
            print("Seth ganha um escudo temporário.")
        self.apply_mark_of_death()

    def vertical_slash(self, target_bleeding):
        print(f"{self.name} usa Vertical Slash! Dano verdadeiro + cegueira + sangramento.")
        if target_bleeding:
            print("Efeitos prolongados por 1 segundo!")
        self.apply_mark_of_death()

    def slaughter(self, can_execute, team_ace):
        if can_execute:
            print(f"{self.name} usa Slaughter! Executando inimigo(s).")
            if team_ace:
                print("Buff de dano verdadeiro concedido aos aliados por 6s!")
        else:
            print("Slaughter não pode ser ativado: Marca da Morte não está ativa.")

    def apply_mark_of_death(self):
        self.mark_of_death_active = True
        print("Marca da Morte aplicada ao alvo.")


if __name__ == "__main__":
    seth = SethChampion()
    seth.regenerate_essence()
    seth.ravenous_dagger()
    seth.swift_bow(3)
    seth.vertical_slash(True)
    seth.slaughter(True, True)