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
import yuri_raphael_rogerio_grafos.Grafo;
import yuri_raphael_rogerio_grafos.Vertice;

public class DFS {
	
	private static int time = 0;
	
	public void dfs(Grafo grafo) {
		for (Vertice u : grafo.getListasAdjacencia().keySet()) {
			if (BRANCO.equals(u.getCor())) {
				dfsVisit(u, grafo);
			}
		}		
	}
	
	private void dfsVisit(Vertice vertice, Grafo grafo) {
		vertice.setCor(CINZA);
                vertice.setDistancia(++time);
		for (Vertice v : grafo.getListasAdjacencia().get(vertice)) {
			if (BRANCO.equals(v.getCor())) {
				v.setPrincipal(vertice);
				dfsVisit(v, grafo);
			}
		}
		vertice.setCor(PRETO);
		vertice.setTermino(++time);
	}

}

