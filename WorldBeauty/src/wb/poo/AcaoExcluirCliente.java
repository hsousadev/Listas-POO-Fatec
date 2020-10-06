package wb.poo;

//Atualizado2

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AcaoExcluirCliente {
	
	Lojas unidade;
	public List<Cliente> clientes = new ArrayList<>(); 
	

	public AcaoExcluirCliente(Lojas unidade) {
		this.unidade = unidade;
		clientes = unidade.clientes;
	}
	
	public void excluirCliente() { 
		
	
		Controle controle = new Controle();
		
		System.out.println("Digite o Nome do cliente que deseja excluir: ");
		String cliExcluir = controle.texto().toUpperCase();
		

		
		for (Cliente astopho : clientes) {
			if (astopho.getNome().equals(cliExcluir)) {   
               clientes.remove(astopho);
               System.out.println("Cliente excluido");
               break;
			}
		}
		
	}

}
