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


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Grafo {
	
	private byte[][] matrixAdjacencia;
	
	private Map<Vertice, List<Vertice>> listasAdjacencia;
	
	public Grafo(byte[][] matrixAdjacencia) {
		this.matrixAdjacencia = matrixAdjacencia;
		analisaMatrixAdjacencia();
	}
	
	private void analisaMatrixAdjacencia() {
		this.listasAdjacencia = new TreeMap<Vertice, List<Vertice>>();
		for (int i = 0; i < matrixAdjacencia.length; i++) {
			Vertice chave = getVertice(i);
			for (int j = 0; j < matrixAdjacencia[i].length; j++) {
				if (matrixAdjacencia[i][j] == 1) {
					listasAdjacencia.get(chave).add(getVertice(j));
				}
			}
		}
	}
	
	public Map<Vertice, List<Vertice>> getListasAdjacencia() {
		return listasAdjacencia;
	}
	
	public Vertice getVertice(int rotulo) {
		for (Vertice vertice : listasAdjacencia.keySet()) {
			if (vertice.getRotulo() == rotulo) {
				return vertice;
			}
		}
		
		Vertice chave = new Vertice(rotulo);
		listasAdjacencia.put(chave, new ArrayList<Vertice>());
		
		return chave;
	}

}
