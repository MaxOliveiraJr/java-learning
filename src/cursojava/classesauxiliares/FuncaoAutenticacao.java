package cursojava.classesauxiliares;

import cursojava.insterfaces.PermitirAcesso;

// Receber alguém que tem contrato da interface PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {
	private PermitirAcesso permitirAcesso;
	
	
	
//	public boolean autenticarCursoJava(PermitirAcesso acesso) {
//		return acesso.autenticar();
//	}
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}
	
	public  FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
}
