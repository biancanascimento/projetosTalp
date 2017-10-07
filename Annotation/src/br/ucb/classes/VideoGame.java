package br.ucb.classes;

import br.ucb.anotation.VersaoDispositivo;

@VersaoDispositivo(anoVersao = 2016, nomeVersao = "PS4", numeroVersao = 8)

public class VideoGame {
	String nome;
	String marca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
