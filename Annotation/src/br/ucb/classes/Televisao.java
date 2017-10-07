package br.ucb.classes;

import br.ucb.anotation.VersaoDispositivo;

@VersaoDispositivo(anoVersao = 2017, nomeVersao = "Samsumg", numeroVersao = 10)

public class Televisao {
	String nome;
	int anoFabricação;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFabricação() {
		return anoFabricação;
	}

	public void setAnoFabricação(int anoFabricação) {
		this.anoFabricação = anoFabricação;
	}
}
