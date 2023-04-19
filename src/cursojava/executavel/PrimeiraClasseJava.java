package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	static int maiorIdadeGlobal = 25; //Global Variável


	public static void main(String[] args) {
		System.out.println("Primeiro Programa Java");
		
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println(numero1);
		
		
		boolean logica;
		boolean logica2;
		
		int maiorIdade = 18;
		
		System.out.println("idade " + maiorIdade);
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;

		
		System.out.println("Média das Notas é "+(nota1+nota2+nota3+nota4) / 4);
		
		// Tipo double para decimal
		
		double notad1 = 90;
		double notad2 = 70;
		double notad3 = 50;
		double notad4 = 88;
	
		
		System.out.println("Média das Notas é "+(notad1+notad2+notad3+notad4) / 4);
		
		
		/* Tipo char tem que ser com aspas simples*/

		
		char letra = 'F';
		
		System.out.println(letra);
		
		
		// Tipo String
		String texto = "Max Rosa de Oliveira";
		String telefone = "91984860953"; 
		// Concatenação
		System.out.println(texto +" = " + telefone);
		
		// Condicional
		
		int mediaAluno = 70;
		String nome = "Max";
		
		if(mediaAluno >= 70 && nome.equals("Max")) {
			System.out.println("Parabêns você está aprovado");
			
		}
		else if(mediaAluno < 70) {
			System.out.println("Infelizmente você está reprovado");
			
		}
		
		//Condicional Ternário
		
		String saidaResultado;
		
		saidaResultado	= mediaAluno >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
		
		
		System.out.println(saidaResultado);
		
		// Condicional Aninhada
		
		if(mediaAluno >= 50) {
			if(mediaAluno >=70) {
				System.out.println("Parabêns você está aprovado direto");
			}else {
				System.out.println("Infelizmente você está em recuperação");
			}
		}else {
			System.out.println("Infelizmente você está reprovado");
		}
		
		
		// Switch case
		int dia = 6;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;

		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
			
		case 4:
			System.out.println("Quarta");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
		default:
			System.out.println("Sabádo");
			
		}
		
	
		/*Operadores Relacionais
		
		>
		<
		>=
		<=
		!=
		==
	
		*/
		
		// Repetição
		int c = 0;
		
		while(c <= 10) {
			System.out.println("While "+c);
			c++;
		}
		
		c =0;
		
		do {
			System.out.println("Do "+c);
			c++;
		}while(c<=10);
		
		for(int n = 0;n<=10;n++) {
			System.out.println("For " + n);
			if(n==7) {
				break;
			}
		}
		

		for(int n = 10;n>=0;n--) {
			System.out.println("For " + n);
			
			if(n==7) {
				continue; //ignora o que tiver abaixo do if
			}
		}
		
		
		double carro = 9;
		double pessoa =2;
		
		double resto = carro % pessoa;
		
		System.out.println("Sobraram exatamente "+resto);
		
		
		/*String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de Pessoas");
		
		double numCarros = Double.parseDouble(carros);
		double numPessoas = Double.parseDouble(pessoas);
		
		 int divisao = (int) (numCarros / numPessoas);
		
		double resto2 = numCarros % numPessoas;
		
		System.out.println("Divisão para pessoas deu :"+divisao+" e soubrou :"+resto2);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão ?");
		
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu :"+divisao+" e soubrou :"+resto2);
		}
		
		
		
		String nota1a = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2a = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3a = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4a = JOptionPane.showInputDialog("Informe a nota 4");
		
		
		double dnota1a = Double.parseDouble(nota1a);
		double dnota2a = Double.parseDouble(nota2a);
		double dnota3a = Double.parseDouble(nota3a);
		double dnota4a = Double.parseDouble(nota4a);
		
		double media = (dnota1a + dnota2a+dnota3a+dnota4a) / 4;
		
		System.out.println("Resultado de "+dnota1a +" + "+dnota2a +" + " +dnota3a +" + "+dnota4a +" = " +media);
		
		
		
		if(media>=5) {
			
			if(media>=7) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado Média: "+media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno de Recuperação Média:"+media);
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado Média:"+media);;;
		}
		*/
		
		//Não existe
		Aluno 	aluno1;
		
		
		//Existe;
		// é umas 
		Aluno aluno2  = new Aluno();
		Aluno aluno3  = new Aluno("Max");
		
		System.out.println(aluno3.getNome()+" get");
		Aluno aluno4 = new Aluno("Maxana",25);
	
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Matématica");
		disciplina1.setNota(8);
		
		aluno4.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("História");
		disciplina2.setNota(8);
		
		aluno4.getDisciplinas().add(disciplina1);
		
		System.out.println(aluno4.nome);
		System.out.println(aluno4.idade);
		System.out.println(aluno4.toString());
		System.out.println(aluno4.getMediaNota());
		
		
		System.out.println("==========================================");
		
		String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno");
		String idadeAluno = JOptionPane.showInputDialog("Idade do Aluno");
		String dtNascimentoAluno = JOptionPane.showInputDialog("Data de nascimento do Aluno");
		String rg = JOptionPane.showInputDialog("Registro Geral do Aluno");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno");
		String mae = JOptionPane.showInputDialog("Nome da Mãe do Aluno");
		String pai = JOptionPane.showInputDialog("Nome da Pai do Aluno");
		String matricula = JOptionPane.showInputDialog("Matrícula do Aluno");
		String serie = JOptionPane.showInputDialog("Série do Aluno");
		String escola = JOptionPane.showInputDialog("Escola do Aluno");
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome(nomeAluno);
		aluno5.setIdade(Integer.valueOf( idadeAluno));
		aluno5.setDataNascimento(dtNascimentoAluno);
		aluno5.setRegistroGeral(rg);
		aluno5.setNumeroCPF(cpf);
		aluno5.setNomeMae(mae);
		aluno5.setNomePai(pai);
		aluno5.setDataMatricula(matricula);
		aluno5.setSerieMatriculado(serie);
		aluno5.setNomeEscola(escola);
		
		for(int pos = 1;pos <= 4;pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplica "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplica "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(notaDisciplina));
			
			aluno5.getDisciplinas().add(disciplina);			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina");
		
		if(escolha == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
				aluno5.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		 
		
		System.out.println(aluno5.getNome());
		System.out.println(aluno5.getIdade());
		
		
		System.out.println(aluno5.getDataNascimento());
		System.out.println(aluno5.getRegistroGeral());
		System.out.println(aluno5.getNumeroCPF());
		System.out.println(aluno5.getNomeMae());
		System.out.println(aluno5.getNomePai());
		System.out.println(aluno5.getDataMatricula());
		System.out.println(aluno5.getSerieMatriculado());
		System.out.println(aluno5.getNomeEscola());
		
		System.out.println(aluno5);
		System.out.println(aluno5.getMediaNota());
		
		/* Eguals e Hascode */
		
		Aluno aluno6 = new Aluno();
		aluno6.setNome("Max");
		Aluno aluno7 = new Aluno();
		aluno7.setNome("Max");
		
		if(aluno6.equals(aluno7)) {
			System.out.println("Iguais");
		}else {
			System.out.println("diferente");
		}
		
		
		
	}	
	
	
	
	public static void metodo2() {
		System.out.println(maiorIdadeGlobal);
	}
}
