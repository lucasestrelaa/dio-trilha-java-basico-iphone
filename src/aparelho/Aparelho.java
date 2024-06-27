package aparelho;

import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.navegadorInternet.NavegadorInternet;
import funcoes.reprodutorMusical.ReprodutorMusical;

public class Aparelho implements  AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	// --- Aparelho --- 
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando Aparelho");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo Aparelho");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando o Correio de Voz do Aparelho");
	}
	// --- Reprodutor Musical --- 
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando Música via Aparelho");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando Música via Aparelho");
	}

	@Override
	public void selecionar() {
		// TODO Auto-generated method stub
		System.out.println("Selecionando Música via Aparelho");
	}
	// --- Navegador --- 

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo Página via Aparelho");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando Nova Aba via Aparelho");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("AtualizandoPágina via Aparelho");
	}
	

	

}
