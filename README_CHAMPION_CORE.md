
# ⚔️ Valhalla Rising – Champion Core

---

## 🧠 Overview | Vue d'ensemble | Visão Geral

This repository contains the core structure and logic for all **champions** in *Valhalla Rising – The Parchment*. Each champion belongs to a class, has unique attributes, skills, and a predefined lane. This system is essential for game balance, synergy, and lore consistency.

Ce dépôt contient la structure centrale et la logique de tous les **champions** de *Valhalla Rising – The Parchment*. Chaque champion appartient à une classe, possède des attributs et compétences uniques, ainsi qu'une voie prédéfinie.

Este repositório contém a estrutura central e lógica de todos os **campeões** de *Valhalla Rising – The Parchment*. Cada campeão pertence a uma classe, com atributos únicos, habilidades e rota fixa.

---

## 🧬 Champion Classes | Classes de Champions | Classes de Campeões

- **Juggernauts** → Use **Stamina**
- **Bruisers** → Use **Berzerker**
- **Snipers** → Use **Vigor**
- **Slayers** → Use **Void Essence**
- **Warlocks** → Use **Mana**

Each champion must be played in their **assigned lane**:
- Top Lane → Highland
- Mid Lane → The Middle Way
- Bot Lane → Firestarter
- Jungle → Oblivion

---

## ❌ Penalty System

If a champion is used **outside of their designed lane**, a penalty is applied.  
Example:
- Warlocks used outside Firestarter lose 60% of their power.
- Juggernauts outside Jungle lose armor and stamina regen.

(Implementation logic will be in `/mechanics/penalty_system.py` or `.java`)

---

## 📁 Repository Structure

```
/champions
  /juggernauts
    - matombo.json
    - medvedev.json
  /snipers
    - isadora.json
    - bjorn.json
  /warlocks
    - ariel.json
/mechanics
  - penalty_system.py
  - synergy_buffs.py
  - skill_calculator.py

README.md
```

---

## 🧾 Credits

**Created by:** Marcelo dos Santos Prado  
**Design and Support:** Lyra (ChatGPT)  
**Languages:** Portuguese, English, French  
**Status:** Under Development | En développement | Em desenvolvimento

---

© 2025 Marcelo dos Santos Prado. All rights reserved.
