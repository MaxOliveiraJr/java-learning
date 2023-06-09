package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.insterfaces.PermitirAcesso;

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
		Aluno aluno1;
		
		
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
		
		System.out.println(aluno4.getNome());
		System.out.println(aluno4.getIdade());
		System.out.println(aluno4.toString());
		System.out.println(aluno4.getMediaNota());
		
		
		System.out.println("==========================================");
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		
		/*
		 * Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);
		if(new Secretario().autenticar()) {
		
		PermitirAcesso secretario = new Secretario();
		if(secretario().autenticar(login,senha)) {
		
		*ou
		*
		*if(new Secretario().autenticar(login,senha)) {
		*
		
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
		if(permitirAcesso.autenticar()) {
			*/
		/*
		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();		
		PermitirAcesso permitirAcesso = new Secretario(login,senha);
		
		if(autenticacao.autenticarCursoJava(permitirAcesso)) {
*/
		/*PermitirAcesso permitirAcesso = new Secretario(login,senha);
		if(new FuncaoAutenticacao(permitirAcesso).autenticarCursoJava()) {*/
		
		if(new FuncaoAutenticacao(new Diretor(login,senha)).autenticarCursoJava()) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String,List<Aluno>>();
		
		
		
	/*	List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosReprovado = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		
		*
		*Alteramos para trabalho com hashmap
		*/
		 
		for(int qtd = 1;qtd<=5;qtd++) {
			
			
			
		
		
		String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno");
		/*String idadeAluno = JOptionPane.showInputDialog("Idade do Aluno");
		String dtNascimentoAluno = JOptionPane.showInputDialog("Data de nascimento do Aluno");
		String rg = JOptionPane.showInputDialog("Registro Geral do Aluno");
		String cpf = JOptionPane.showInputDialog("CPF do Aluno");
		String mae = JOptionPane.showInputDialog("Nome da Mãe do Aluno");
		String pai = JOptionPane.showInputDialog("Nome da Pai do Aluno");
		String matricula = JOptionPane.showInputDialog("Matrícula do Aluno");
		String serie = JOptionPane.showInputDialog("Série do Aluno");
		String escola = JOptionPane.showInputDialog("Escola do Aluno");*/
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome(nomeAluno);
/*		aluno5.setIdade(Integer.valueOf( idadeAluno));
		aluno5.setDataNascimento(dtNascimentoAluno);
		aluno5.setRegistroGeral(rg);
		aluno5.setNumeroCPF(cpf);
		aluno5.setNomeMae(mae);
		aluno5.setNomePai(pai);
		aluno5.setDataMatricula(matricula);
		aluno5.setSerieMatriculado(serie);
		aluno5.setNomeEscola(escola);*/
		
		for(int pos = 1;pos <= 1;pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplica "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplica "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(notaDisciplina));
			
			aluno5.getDisciplinas().add(disciplina);			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina");
		
		if(escolha == 0) {
			
			int posicao = 1;
			int continuarRemover = 0;
			
			while(continuarRemover==0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4?");
				aluno5.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
				
			
			}
				
		}
		
		
		/*System.out.println(aluno5.getNome());
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
		System.out.println(aluno5.getAlunoAprovado2());*/

			
		alunos.add(aluno5);
		
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for(Aluno aluno: alunos) {/*Separação em Lista*/
			
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				maps.get(StatusAluno.APROVADO).add(aluno);
				
				/*alunosAprovados.add(aluno);*/
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				/*alunosRecuperacao.add(aluno);*/
			}else {
				
				maps.get(StatusAluno.REPROVADO).add(aluno);
				/*alunosReprovado.add(aluno);*/
			}
			
		}
		
		System.out.println("---------------------------");
		for(Aluno aluno: maps.get(StatusAluno.APROVADO)) {
			
			System.out.println("Resultado = "+ aluno.getNome() +" "+ aluno.getAlunoAprovado2() + " com média = "+ aluno.getMediaNota());
		}
		
		System.out.println("---------------------------");
		for(Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
			
			System.out.println("Resultado = "+ aluno.getNome() +" "+ aluno.getAlunoAprovado2() + " com média = "+ aluno.getMediaNota());
		}
		
		System.out.println("---------------------------");
		for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
			
			System.out.println("Resultado = "+ aluno.getNome() +" "+ aluno.getAlunoAprovado2() + " com média = "+ aluno.getMediaNota());
		}
		
		
		/*for(Aluno aluno: alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("Max")) {
				
				alunos.remove(aluno); 
				break;
			}else {
				System.out.println(aluno);
				System.out.println(aluno.getMediaNota());
				System.out.println(aluno.getAlunoAprovado2());
				System.out.println("====================================");
			}
		}
		
		for(Aluno aluno: alunos) {
			
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas Matérias são");
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				
				System.out.println(disciplina.getDisciplina());
				
			}
		}*/
		
		/*for (int pos =0;pos < alunos.size();pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("Max")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);
				trocar.getDisciplinas().add(disciplina)	;
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			
			System.out.println("Aluno = "+aluno.getNome());
			System.out.println("Média = "+aluno.getMediaNota());
			System.out.println("Resultado = "+aluno.getAlunoAprovado2());
			
			
			for(int posd =0;posd<aluno.getDisciplinas().size();posd++) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				
				System.out.println("Materia = "+disc.getDisciplina()+" Nota = "+disc.getNota());
			}
			System.out.println("============================================");
			
		}*/
		
		}else {
			
			JOptionPane.showInternalMessageDialog(null, "Não permitido");
		}
		
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
