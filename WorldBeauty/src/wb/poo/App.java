package wb.poo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//Atualizado2

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		String caminho = "C:\\Users\\cfrab\\OneDrive\\Documentos\\Listas\\WB.ser";
		//String caminho = "/home/henrique/cadastrosSalvos5.ser";
		
		AcaoSerializar serial = new AcaoSerializar();
		
		Lojas unidade = null;
		
		Controle controle = new Controle();
		
		Lojas matriz = new Lojas();
		Lojas filial = new Lojas();
			
		
		int codigoUnidade = 0;
		Menu.menuInicial();
		codigoUnidade = controle.opcao();
		
		
		
		if(codigoUnidade ==1) {
			System.out.println("%%%%%%% Matriz %%%%%%%");
			unidade = matriz;
			
		}
		else if (codigoUnidade ==2) {
			System.out.println("%%%%%%% Filial %%%%%%%");
			unidade = filial;
		
		}else {
			System.out.println("Unidade informada não cadastrada");
		}
		
		
		File f = new File(caminho);
		if(f.exists()) {
			unidade = (Lojas) serial.load();
		}
				
		int escolha =20;
		
		
		do {
			Menu.menuPrincipal();
			escolha = controle.opcao();
			
			switch(escolha) {
			case 1:
				AcaoCadastrarCliente cadastrar = new AcaoCadastrarCliente(unidade);
				cadastrar.cadastrarCliente();				
			break;
			
			case 2:
				AcaoEditarCliente editar = new AcaoEditarCliente(unidade);
				editar.editarCliente();
				break;
				
			case 3:
				AcaoExcluirCliente excluir = new AcaoExcluirCliente(unidade);
				excluir.excluirCliente();
				break;
			
			case 4:
				AcaoListarClientes listar = new AcaoListarClientes(unidade);
				listar.listarCliente();
			break;
			
			case 5:
				AcaoCadastrarServico cadastroServico = new AcaoCadastrarServico(unidade);
				cadastroServico.cadastrarServico();
			break;
			
			case 6:
				AcaoGerarRelatorios relatorio = new AcaoGerarRelatorios(unidade);
				relatorio.GerarRelatorios();
			break;
			
			case 7:
				AcaoSerializar serie = new AcaoSerializar();
				serie.save(unidade);
			break;
			
			
			}
			
			
			
				
		}while(escolha!=0);
}
	
}




