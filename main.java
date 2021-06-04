package tp_2;

// João Guilherme de Sousa Luz - 474041

public class main {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(null, 0, 0, 0);		
		aluno1.alteraNome("João Guilherme");
		System.out.println("Nome: "+ aluno1.imprimeNome());
		aluno1.alteraId(123456789);
		System.out.println("ID: "+ aluno1.imprimeId());
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		System.out.println("Média: "+ aluno1.retornaMedia());
		if (aluno1.passouMedia() == true) {
			System.out.println("O Aluno: " + aluno1.imprimeNome()+" de ID: "+aluno1.imprimeId()+
					", passou com média "+ aluno1.retornaMedia()+".");
		}else {
			System.out.println("O Aluno: " + aluno1.imprimeNome()+" de ID: "+aluno1.imprimeId()+
					", não passou com média "+ aluno1.retornaMedia()+".");
		}
		//Disciplina	
		
		Disciplina alunos = new Disciplina();
		
		alunos.adicionarAluno(0, new Aluno("João Guilherme", 474041, 8, 6));
		alunos.adicionarAluno(1, new Aluno("Rodrigo Sales", 474042, 5,9));
		alunos.adicionarAluno(2, new Aluno("João Gabriel", 474044, 8, 7));
		alunos.adicionarAluno(3, new Aluno("Mikhael Neves", 474045, 6, 6.5));
		alunos.adicionarAluno(4, new Aluno("Fernando Fachin", 474046, 6.9, 7));
		alunos.adicionarAluno(5, new Aluno("Davi Gonçalves", 474047, 8, 7));
		alunos.adicionarAluno(6, new Aluno("Fabricia Luz", 474048, 8, 7));
		alunos.adicionarAluno(7, new Aluno("Fernanda Amaro", 474049, 6, 6));
		alunos.adicionarAluno(8, new Aluno("Gabriela Mocs", 474050, 9, 9.5));
		alunos.adicionarAluno(9, new Aluno("Luiz Fernandes", 474043, 8, 7));
		alunos.adjacentesNome(2);
		System.out.println("Média da nota1 da turma:"+alunos.mediaNota1());
		System.out.println("Média da nota2 da turma:"+alunos.mediaNota2());

	}
}
