// Sistema de Runas – Valhalla Rising – The Parchment
// Desenvolvido por Marcelo (2025)

public class Runa {
    String nome, cultura, subcategoria, raridade, tipo;
    int sinergia;

    public Runa(String nome, String cultura, String subcategoria, String raridade, String tipo, int sinergia) {
        this.nome = nome;
        this.cultura = cultura;
        this.subcategoria = subcategoria;
        this.raridade = raridade;
        this.tipo = tipo;
        this.sinergia = sinergia;
    }
}

import java.util.ArrayList;

public class BuildRunica {
    ArrayList<Runa> runas = new ArrayList<>();

    public boolean adicionarRuna(Runa r) {
        if (runas.size() < 3 && !temCultura(r.cultura)) {
            runas.add(r);
            return true;
        }
        return false;
    }

    public boolean temCultura(String cultura) {
        for (Runa r : runas) {
            if (r.cultura.equals(cultura)) return true;
        }
        return false;
    }

    public int eficienciaTotal() {
        int total = 0;
        for (Runa r : runas) {
            total += r.sinergia;
        }
        return total;
    }

    public static void main(String[] args) {
        Runa r1 = new Runa("Espinho de Garmr", "Viking", "Força Adaptiva", "Rara", "Condicional", 2);
        Runa r2 = new Runa("Lança de Tezcatlipoca", "Maya", "Foco", "Épica", "Condicional", 3);
        Runa r3 = new Runa("Sandálias de Hermes", "Grega", "Velocidade", "Comum", "Passiva", 2);

        BuildRunica build = new BuildRunica();
        build.adicionarRuna(r1);
        build.adicionarRuna(r2);
        build.adicionarRuna(r3);

        System.out.println("Eficiência total da build: " + build.eficienciaTotal());
    }
}
