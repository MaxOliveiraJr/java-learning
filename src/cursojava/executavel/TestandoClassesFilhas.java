package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		Aluno  aluno = new Aluno();
		aluno.setNome("Max");
		aluno.setIdade(15);
		aluno.pessoaMaiorIdade();
		
		Diretor diretor = new Diretor();
		diretor.setNome("Egidio");
		diretor.setIdade(18);
		diretor.pessoaMaiorIdade();
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Max Junior");
		secretario.setIdade(50);
		secretario.pessoaMaiorIdade();
		
		System.out.println(aluno);
		System.out.println(aluno.pessoaMaiorIdade() + " = "+aluno.msgMaiorIdade());
		System.out.println(aluno.salario());
		System.out.println(diretor);
		System.out.println(diretor.pessoaMaiorIdade() );
		System.out.println(diretor.salario() );
		System.out.println(secretario);
		System.out.println(secretario.pessoaMaiorIdade() );
		System.out.println(secretario.salario() );
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Pessoa = "+pessoa.getNome()+" e o salário é de "+pessoa.salario());
		
	}

}
