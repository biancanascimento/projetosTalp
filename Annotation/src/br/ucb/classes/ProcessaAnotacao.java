package br.ucb.classes;
import br.ucb.anotation.*;

public class ProcessaAnotacao {
	public void processaAnotacao(Class classeAnotada){
		System.out.println("Dispositivo: " +classeAnotada.getSimpleName());
		VersaoDispositivo classe = (VersaoDispositivo) classeAnotada.getAnnotation(VersaoDispositivo.class);
		System.out.println("Ano da vers�o: "+classe.anoVersao());
		System.out.println("Nome da Vers�o: "+classe.nomeVersao());
		System.out.println("N�mero da Vers�o: "+classe.numeroVersao());
		System.out.println("\n");

	
		
	}

}
