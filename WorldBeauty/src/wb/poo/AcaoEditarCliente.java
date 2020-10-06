package wb.poo;

//Atualizado2

public class AcaoEditarCliente {
	public Lojas unidade;

	public AcaoEditarCliente(Lojas unidade) {
		this.unidade = unidade;
	}
	
	public void editarCliente(){
		Controle controle = new Controle();
			
		int opcaoEditar=20;
		 
		System.out.println("Informe o nome do cliente que deseja fazer altera��o de cadastro");
		String nomeEditar = controle.texto().toUpperCase();
		
		if (unidade.clientes.size() != 0) {		
		for (Cliente definicaocliente : unidade.clientes ) {
			if (definicaocliente.nome.equals(nomeEditar)) {
				
				
				while(opcaoEditar!=0){
					Menu.menuEditar();				
					opcaoEditar = controle.opcao();
						switch(opcaoEditar) {
			
						case 1:
							System.out.println("Informe o nome para altera��o: ");
							definicaocliente.nome = controle.texto().toUpperCase();
							break;
				
												
						case 2:
							System.out.println("Informe o telefone para altera��o: ");
							definicaocliente.telefone = controle.texto();
						break;
						
						case 3:
							System.out.println("Informe a Data de Nascimento para altera��o : ");
							definicaocliente.dataDeNascimento = controle.texto();
						break;
						
						case 4:
							System.out.println("Informe o gen�ro para altera��o : ");
							definicaocliente.genero = controle.texto();
						break;
						
						case 0:
							System.out.println("sair");
						break;
						
					
				
}
				}
			}else {
				System.out.println("Cliente n�o cadastrado");
			}
		}
	}else {
		System.out.println("Sem cadastros de clientes");
	}
	}
}
