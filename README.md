#  Valhalla Champion Core – Java Module

This repository contains the core logic and structure for the symbolic champions of the game **Valhalla Rising – The Parchment**.

It is written in **Java** and serves as the foundation for combat systems, character interactions, and narrative expression.

---

## Project Structure

```
valhalla-champion-core/
├── champions/           # All individual champion classes
│   ├── Leila.java
│   ├── Tuane.java
│   └── ...
├── core/                # Abstract base classes and shared logic
│   └── ValhallaChampion.java
├── test/                # Entry point for testing combat and behavior
│   └── Main.java
├── LICENSE.md           # Protection and usage license
├── README.md            # Project description (this file)
```

---

##  Key Concepts

- **Champions** are more than characters. They are symbolic beings.
- Each one has:
  - Health (vitality)
  - Mana (spiritual energy)
  - Contextual speech (`speak()` method)
  - Unique combat mechanics

This structure allows deep narrative integration and emotional resonance, far beyond typical game mechanics.

---

## How to Run

Make sure you have Java installed, then compile and run:

```bash
javac core/ValhallaChampion.java champions/Leila.java champions/Tuane.java test/Main.java
java -cp . test.Main
```

---

## Example Test

The `Main.java` file simulates a turn-based combat between two champions with printed dialogue, attack, and ultimate abilities.

---

##  License

All code and symbolic systems are protected under:
**Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License**

Please refer to the `LICENSE.md` file for details.

---

## Author

**Marcelo** (a.k.a. [Valhalla Rising](https://github.com/ValhallaRising1974))

Forging legends. Building with soul. 🌌
