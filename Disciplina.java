package tp_2;

public class Disciplina{
	private double mediaNotas;

	private Aluno[] alunos;
	
	public Disciplina () {
		this.mediaNotas = 0;
		this.alunos = new Aluno[10];
	}
	
	public void adicionarAluno(int novaPosicao, Aluno aluno) {
		alunos[novaPosicao] = aluno;
	}
	public double mediaNota1() {
		mediaNotas = 0;
		for (int i = 0; i<alunos.length; i++) {
			mediaNotas += alunos[i].nota1;
		} return mediaNotas/10;
	}
	public double mediaNota2() {
		mediaNotas = 0;
		for (int i = 0; i<alunos.length; i++) {
			mediaNotas += alunos[i].nota2;
		} return mediaNotas/10;
	}
	public void adjacentesNome(int novaPosicao) {
		if (novaPosicao == 1) {
			System.out.println(alunos[novaPosicao].lerNome());
		}else if(novaPosicao == 10) {
			System.out.println(alunos[novaPosicao-2].lerNome());
		}else {
			System.out.println(alunos[novaPosicao-2].lerNome());
			System.out.println(alunos[novaPosicao].lerNome());
		}
	}
}
