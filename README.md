# 🛡️ Valhalla Rising - Champion Core (Java)

This is the foundation of the character system for **Valhalla Rising – The Parchment**, developed in Java.  
It defines the structure and behavior of champions in the game — their identity, role, power, and speech.

---

## 🌟 Features

- Abstract base class: `ValhallaChampion`
- Concrete implementation: `Leila`, a Warlock character
- Context-sensitive speech: `greeting`, `combat`, `teleport`
- Status display method for in-game presentation
- Simple and expandable architecture

---

## 📦 File Structure

| File                 | Description                                      |
|----------------------|--------------------------------------------------|
| `ValhallaChampion.java` | Abstract class for all champions                  |
| `Leila.java`            | A concrete champion with custom speech logic     |
| `Main.java`             | Entry point to demonstrate character interaction |

---

## 🚀 How to Run

1. Compile all `.java` files:
```bash
javac ValhallaChampion.java Leila.java Main.java
Run the main class:

bash
Copiar
Editar
java Main
💬 Example Output
vbnet
Copiar
Editar
Champion: Leila
Role: Warlock
Health: 800
Mana: 1200

[Greeting] The stars watched you arrive.
[Combat] Peace walks with me, even in war.
[Teleport] I am everywhere... and nowhere.
🔧 Next Steps
Add more champions: Tuane, Lara, Bjorn, Hogan, Seth...

Expand context (e.g., victory, death, retreat, interaction)

Integrate with game engine or dialogue system via API

Link to JSON or external dialogue files for flexibility

👤 Author
Marcelo (a.k.a. Valhalla Rising)
Creator of the Valhalla Rising universe. Game designer, writer, and developer of symbolic systems that connect art and code.

🧩 License
This project is open for collaboration and creative exploration.
All content is deeply symbolic and intended to preserve artistic integrity.
