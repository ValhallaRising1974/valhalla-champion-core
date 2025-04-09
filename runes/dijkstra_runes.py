"""
Algoritmo de Dijkstra aplicado à sinergia entre runas
Autor: Marcelo (2025)
"""

import heapq

def dijkstra(grafo, inicio):
    fila = [(0, inicio)]
    distancias = {nodo: float('inf') for nodo in grafo}
    distancias[inicio] = 0

    while fila:
        (custo_atual, nodo_atual) = heapq.heappop(fila)

        for vizinho, peso in grafo[nodo_atual].items():
            distancia = custo_atual + peso
            if distancia < distancias[vizinho]:
                distancias[vizinho] = distancia
                heapq.heappush(fila, (distancia, vizinho))

    return distancias

# Exemplo de grafo entre runas
grafo_runas = {
    'Viking': {'Maya': 2, 'Grega': 3},
    'Maya': {'Grega': 1},
    'Grega': {}
}

if __name__ == '__main__':
    resultado = dijkstra(grafo_runas, 'Viking')
    for destino, custo in resultado.items():
        print(f'Menor custo de Viking até {destino}: {custo}')
