package br.ucb.classes;

import br.ucb.anotation.VersaoDispositivo;

@VersaoDispositivo(anoVersao = 2017, nomeVersao = "Samsumg", numeroVersao = 10)

public class Televisao {
	String nome;
	int anoFabrica��o;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFabrica��o() {
		return anoFabrica��o;
	}

	public void setAnoFabrica��o(int anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}
}
