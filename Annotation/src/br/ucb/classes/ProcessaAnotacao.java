package br.ucb.classes;
import br.ucb.anotation.*;

public class ProcessaAnotacao {
	public void processaAnotacao(Class classeAnotada){
		System.out.println("Dispositivo: " +classeAnotada.getSimpleName());
		VersaoDispositivo classe = (VersaoDispositivo) classeAnotada.getAnnotation(VersaoDispositivo.class);
		System.out.println("Ano da versão: "+classe.anoVersao());
		System.out.println("Nome da Versão: "+classe.nomeVersao());
		System.out.println("Número da Versão: "+classe.numeroVersao());
		System.out.println("\n");

	
		
	}

}
