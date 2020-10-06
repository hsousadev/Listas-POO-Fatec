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
						
			case 1:// Listar por ordem alfab�tica
								
				if (unidade.clientes.size() != 0) {
					Collections.sort(unidade.clientes);
						for (Cliente  clientes : unidade.clientes) {
							System.out.println(clientes);						
						}
											
				} else {
					
					System.out.println("N�o h� clientes cadastrados");
				}
				break;
				
			case 2:// Listar por g�nero
				System.out.println("Informe o g�nero que deseja consultar: (F/M)");
				String definicaogenero = controle.texto().toUpperCase();		
				
				if (unidade.clientes.size() != 0) {
					Collections.sort(unidade.clientes);
						for (Cliente  clientes : unidade.clientes) {
							if(clientes.genero.equals(definicaogenero)){
							System.out.println(clientes);}
							}
				}
									
			 else {
					
					System.out.println("N�o h� clientes cadastrados");
			
					
				}
			
			break;
			
			case 3: // Listar servi�os de um cliente
				System.out.println("Informe o nome do cliente que deseja fazer altera��o de cadastro");
				String nomeBuscar = controle.texto().toUpperCase();
				
				if (unidade.clientes.size() != 0) {
				
				for (Cliente definicaocliente : unidade.clientes ) {
					if (definicaocliente.nome.equals(nomeBuscar)) {
						System.out.println(definicaocliente.nome);
						System.out.println(definicaocliente.servicos);
					}
					else {
						System.out.println("Cliente n�o cadastrado.");
						}
				}
				}else {
					System.out.println("N�o h� cadastros de clientes");
				}
			break;
			
				
				
				
			}
			
			
			
		}while(opcao!=0);
	}
	  
	
	
	

}
