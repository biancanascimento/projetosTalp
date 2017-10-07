package br.ucb.classes;

public class Main {

	public static void main(String[] args) {
		ProcessaAnotacao processa = new ProcessaAnotacao();
		processa.processaAnotacao(DispositivoMovel.class);
		processa.processaAnotacao(Televisao.class);
		processa.processaAnotacao(VideoGame.class);

	}

}
