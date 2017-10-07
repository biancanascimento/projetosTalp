package exercicio2108.main;

import java.util.Arrays;
import java.util.List;

import exercicio2108.Curso;
import exercicio2108.Disciplina;
import exercicio2108.Professor;
import exercicio2108.dao.CursoDAO;
import exercicio2108.dao.DisciplinaDAO;
import exercicio2108.dao.ProfessorDAO;
import exercicio2108.enums.AreaCurso;
import exercicio2108.enums.EspecializacaoProfessor;
import exercicio2108.enums.ModalidadeCurso;
import exercicio2108.enums.TipoAula;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Atualizando a base de dados....");
		CursoDAO cursoDao = new CursoDAO();
		ProfessorDAO profDao = new ProfessorDAO();
		DisciplinaDAO disDao = new DisciplinaDAO();
		System.out.println("Base atualizada");
		
		Curso psico = new Curso();
		psico.setArea(AreaCurso.HUMANAS);
		psico.setCodigoCurso(31321);
		psico.setDescricao("Psicologia");
		psico.setModalidade(ModalidadeCurso.PRESENCIAL);
		psico.setQuantidadeSemestres(10);
		
		Disciplina d1 = new Disciplina();
		d1.setDescricaoBreve("Estagio Basico 1");
		d1.setNome("Estagio");
		d1.setQtHoras(60);
		d1.setQtMaximaAlunos(50);
		d1.setTipoAula(TipoAula.SALA);
		d1.setCurso(psico);
		
		Disciplina d2 = new Disciplina();
		d2.setDescricaoBreve("Trabalho Conclusao Curso");
		d2.setNome("TCC");
		d2.setQtHoras(60);
		d2.setQtMaximaAlunos(50);
		d2.setTipoAula(TipoAula.SALA);
		d2.setCurso(psico);
		
		psico.setDisciplinas(Arrays.asList(d1, d2));
		
		cursoDao.salvar(psico);
		System.out.println("Psico salvo!");
		
		
		
		
		
		Professor p = new Professor();
    	p.setNome("Felipe");
		p.setEspecializacao(EspecializacaoProfessor.POS);
		p.setMatricula("P0408...");
		
		profDao.salvar(p);
//		
//		Curso c = new Curso();
//		c.setDescricao("ADS");
//		c.setArea(AreaCurso.EXATAS);
//		c.setModalidade(ModalidadeCurso.PRESENCIAL);
//		c.setQuantidadeSemestres(5);
//		c.setCodigoCurso(654320);
////		cursoDao.salvar(c);
//		
//		Curso c1 = new Curso();
//		c1.setDescricao("BSI");
//		c1.setArea(AreaCurso.EXATAS);
//		c1.setModalidade(ModalidadeCurso.PRESENCIAL);
//		c1.setQuantidadeSemestres(5);
//		c1.setCodigoCurso(654320);
////		cursoDao.salvar(c1);
//		
//		Disciplina d = new Disciplina();
//		d.setNome("TAP");
//		d.setDescricaoBreve("Topicos Avancados");
//		d.setQtHoras(80);
//		d.setQtMaximaAlunos(30);
//		d.setTipoAula(TipoAula.LABORATORIO);
////		disDao.salvar(d);
//		
//		List<Disciplina> listaLabs = disDao.listarDisciplinasLaboratorio();
//		System.out.println("\n listagem de disciplinas de laboratorio ordenadas por nome");
//		for (Disciplina disciplina : listaLabs) {
//			System.out.println(disciplina.getNome());
//		}
//
//		List<Professor> listaProfs = profDao.listarPosGraduados();
//		System.out.println("\n listagem de profs pos");
//		for(Professor prof : listaProfs){
//			System.out.println(prof.getNome());
//		}
		
		
	}
}
