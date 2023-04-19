package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	public String nome;
	public int idade;
	public String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomePai;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina>  getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {	
		this.disciplinas = disciplinas;
	}
	
	public Aluno() {}

	public Aluno(String nomePadrao) {
		this.nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao,int idadePadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
	}
	
	
	// Metodos Setters e Getters
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNome() {
		return this.nome;
	}

	
	public double getMediaNota() {
			
			double somaNotas = 0.0;
		
			for (Disciplina disciplina : this.disciplinas) {
				somaNotas += disciplina.getNota();
			}
		
		return somaNotas / this.disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {  
		
		double media = this.getMediaNota();
		if(media >=70) {
			return true;
		}else {
			return false;
		} 
	}
	
	public String getAlunoAprovado2() {  
		
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return "Aluno está aprovado";
			}else {
				return "Aluno em recuperação";
			}
		}else {
			return "Aluno está reprovado";
		} 
	}



	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", getDisciplina()=" + getDisciplinas()
				+ ", getIdade()=" + getIdade() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCPF()=" + getNumeroCPF()
				+ ", getNomePai()=" + getNomePai() + ", getNomeMae()=" + getNomeMae() + ", getDataMatricula()="
				+ getDataMatricula() + ", getNomeEscola()=" + getNomeEscola() + ", getSerieMatriculado()="
				+ getSerieMatriculado() + ", getNome()=" + getNome() + ", getMediaNota()=" + getMediaNota()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	

	
	
	
}
