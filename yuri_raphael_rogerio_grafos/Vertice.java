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


public class Vertice implements Comparable<Vertice> {
	
	public enum Cor {
		BRANCO, CINZA, PRETO
	}
	
	private int rotulo;
	
	private Cor vCor;
	
	private int distancia;
	
	private int termino;
	
	private Vertice principal;
	
	public Vertice(int rotulo){
		setRotulo(rotulo);
		setCor(Cor.BRANCO);
		setDistancia(0);
		setPrincipal(null);
	}
	
	public int getRotulo() {
		return rotulo;
	}
	
	public void setRotulo(int rotulo) {
		this.rotulo = rotulo;
	}

	public Cor getCor() {
		return vCor;
	}

	public void setCor(Cor cor) {
		this.vCor = cor;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Vertice getPrincipal() {
		return principal;
	}

	public void setPrincipal(Vertice principal) {
		this.principal = principal;
	}
	
	public int getTermino() {
		return termino;
	}

	public void setTermino(int termino) {
		this.termino = termino;
	}

	@Override
	public boolean equals(Object vertice) {
		if (vertice instanceof Vertice) {
			Vertice outro = (Vertice) vertice;
			return this.getRotulo() == outro.getRotulo();
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(getRotulo());
		sb.append(", ");
		sb.append(getCor());
		sb.append(", ");
		sb.append(getDistancia());
		sb.append("]");
		
		return sb.toString();
	}

	@Override
	public int compareTo(Vertice arg0) {
		return this.getRotulo() - arg0.getRotulo();
	}
	
}