package wb.poo;

import java.util.Collections;

///Atualizado2

public class AcaoListarClientes {
	public Lojas unidade;

	public AcaoListarClientes(Lojas unidade) {
		this.unidade = unidade;
	}
	
	public void listarCliente() {
		
		Controle controle = new Controle();
		
		int opcao = 20;
		
		do{
			Menu.menuListar();
			opcao = controle.opcao();
			
			switch(opcao){
						
			case 1:// Listar por ordem alfabï¿½tica
								
				if (unidade.clientes.size() != 0) {
					Collections.sort(unidade.clientes);
						for (Cliente  clientes : unidade.clientes) {
							System.out.println(clientes);						
						}
											
				} else {
					
					System.out.println("Não há clientes cadastrados");
				}
				break;
				
			case 2:// Listar por gênero
				System.out.println("Informe o gênero que deseja consultar: (F/M)");
				String definicaogenero = controle.texto().toUpperCase();		
				
				if (unidade.clientes.size() != 0) {
					Collections.sort(unidade.clientes);
						for (Cliente  clientes : unidade.clientes) {
							if(clientes.genero.equals(definicaogenero)){
							System.out.println(clientes);}
							}
				}
									
			 else {
					
					System.out.println("Não há clientes cadastrados");
			
					
				}
			
			break;
			
			case 3: // Listar serviï¿½os de um cliente
				System.out.println("Informe o nome do cliente que deseja fazer alteraï¿½ï¿½o de cadastro");
				String nomeBuscar = controle.texto().toUpperCase();
				
				if (unidade.clientes.size() != 0) {
				
				for (Cliente definicaocliente : unidade.clientes ) {
					if (definicaocliente.nome.equals(nomeBuscar)) {
						System.out.println(definicaocliente.nome);
						System.out.println(definicaocliente.servicos);
					}
					else {
						System.out.println("Cliente não cadastrado.");
						}
				}
				}else {
					System.out.println("Não há cadastros de clientes");
				}
			break;
			
				
				
				
			}
			
			
			
		}while(opcao!=0);
	}
	  
	
	
	

}
