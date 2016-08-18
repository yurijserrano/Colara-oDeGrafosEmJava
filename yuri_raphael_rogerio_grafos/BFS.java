/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuri_raphael_rogerio_grafos;

/**
 *
 * @author Serrano
 */


import static yuri_raphael_rogerio_grafos.Vertice.Cor.PRETO;
import static yuri_raphael_rogerio_grafos.Vertice.Cor.CINZA;
import static yuri_raphael_rogerio_grafos.Vertice.Cor.BRANCO;

import java.util.LinkedList;
import java.util.Queue;

import yuri_raphael_rogerio_grafos.Grafo;
import yuri_raphael_rogerio_grafos.Vertice;

public class BFS {
	
	public void bfs(Grafo grafo, int inicio) {
		Vertice raiz = grafo.getVertice(inicio);
		raiz.setCor(CINZA);
		raiz.setDistancia(0);
		raiz.setPrincipal(null);
		
		Queue<Vertice> fila = new LinkedList<Vertice>();
		
		fila.add(raiz);
		
		while (!fila.isEmpty()) {
			Vertice u = fila.remove();
			for (Vertice v : grafo.getListasAdjacencia().get(u)) {
				if (BRANCO.equals(v.getCor())) {
					v.setCor(CINZA);
					v.setDistancia(u.getDistancia() + 1);
					v.setPrincipal(u);
					fila.add(v);
				}
			}
			u.setCor(PRETO);
		}
	}

}
