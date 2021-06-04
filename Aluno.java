package tp_2;

public class Aluno {
		private String nome;
		private int id;
		private double media;
		protected double nota1,nota2;
		
	public Aluno(String nome, int id, double nota1, double nota2){
		this.nome = nome;
		this.id = id;
		this.media = 0;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
		
		
	public void alteraNome(String novoNome){		
		this.nome = novoNome;	
	}
	public String imprimeNome() {
		return this.nome;
	}
	public int imprimeId() {
		return this.id;
	}
	public void alteraId(int novoId) {
		this.id = novoId;
	}
	private double calculaMedia(){
		this.media = (this.nota1+this.nota2)/2;
		return this.media;
	}
	public double retornaMedia() {
			this.media = calculaMedia();
		return this.media;
	}
	//define lerNome para ser possivel 
	public String lerNome() {
		return this.nome;
	}
	public boolean passouMedia() {
		if 	(this.media > 7) return true;
		else return false;
	}
	
}
