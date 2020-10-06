package wb.poo;

public class AcaoCadastrarServico {
	public Lojas unidade;
	
	//Atualizado2
	
	public AcaoCadastrarServico(Lojas unidade) {
		this.unidade = unidade;
		
	}
	
	
	public void cadastrarServico() {
		Controle controle = new Controle();
		
		int opcaoServico=20;
		 
		System.out.println("Informe o nome do cliente que deseja incluir servi�o");
		String nomecliente = controle.texto().toUpperCase();
		
		if (unidade.clientes.size() != 0) {
		
		for (Cliente definicaocliente : unidade.clientes ) {
			if (definicaocliente.nome.equals(nomecliente)) {
				
				while(opcaoServico!=0) {
					Menu.menuServicos();
					opcaoServico = controle.opcao();
					Servicos consumo = new Servicos();
					
					switch(opcaoServico) {
					case 1:						
						consumo.nomeServico= "Manicure";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 2:
						consumo.nomeServico= "Pedicure";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 3:
						consumo.nomeServico= "Design de sombrancelha";
						definicaocliente.servicos.add(consumo);	
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 4:
						consumo.nomeServico= "Corte de cabelo Feminino";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 5:
						consumo.nomeServico= "Tintura";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 6:
						consumo.nomeServico= "Remo��o de rugas";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 7:
						consumo.nomeServico= "Remo��o de manchas de pele";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 8:
						consumo.nomeServico= "Aplica��o de botox";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 9:
						consumo.nomeServico= "Tratamento de Emagrecimento";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 10:
						consumo.nomeServico= "Redu��o de medidas";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 11:
						consumo.nomeServico= "Corte de cabelo Masculino";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 12:
						consumo.nomeServico= "Modelagem/corte de barba";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
					break;
					
					case 13:
						consumo.nomeServico= "Tratamento para queda de cabelo";
						definicaocliente.servicos.add(consumo);
						System.out.println("Servi�o cadastrado com sucesso!");
						
					break;
					
					case 0:
					break;
				}
				}
			}
			
	
				else {
					System.out.println("Cliente n�o cadastrado");
				}

}
	}else {
		System.out.println("N�o h� cadastros de clientes");
	}
		
		
		
		
}
}