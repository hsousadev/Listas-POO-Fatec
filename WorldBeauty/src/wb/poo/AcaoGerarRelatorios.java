package wb.poo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Atualizado2

public class AcaoGerarRelatorios {
	public Lojas unidade;

	public AcaoGerarRelatorios(Lojas unidade) {
		this.unidade = unidade;
	}
	
	public void GerarRelatorios() {
		 
		int opcao=20;		
		Controle controle = new Controle();
			
		
			
			do {
				Menu.menuRelatorios();
				opcao = controle.opcao();								
				if (unidade.clientes.size() != 0) {
					Cliente cliente = new Cliente();
					int totalIdades =0;
					
				
									
					
					switch(opcao) {
					
					case 1:
						for(int i = 0; i < unidade.clientes.size(); i++){
							cliente = unidade.clientes.get(i);
							int idade = AcaoCalcularIdade.calcIdade(cliente.dataDeNascimento);
							totalIdades += idade;	}
						int mediaIdades = totalIdades/(unidade.clientes.size());
						System.out.println("A idade m�dia dos clientes � de :" + mediaIdades+" anos.");
					break;
			
					case 2:
						int contadorClientes= 0;
						String definicaoGenero = "";
						System.out.println("Digite o g�nero (F/M): ");
						definicaoGenero = controle.texto().toLowerCase();
						int idadeGenero= 0;
						for(int i = 0; i < unidade.clientes.size(); i++) {
							cliente = unidade.clientes.get(i);
							if(cliente.genero.toLowerCase().equals(definicaoGenero)) {
								int idade = AcaoCalcularIdade.calcIdade(cliente.dataDeNascimento);
								idadeGenero += idade;
								contadorClientes++;}
							if(contadorClientes != 0) {
								int total =idadeGenero / (unidade.clientes.size());
								System.out.println("A m�dia de Idade para o g�nero"+ definicaoGenero+ " � de :"+ total+ "anos");
								}
							else {
								System.out.println("N�o possuem clientes do g�ro."+definicaoGenero +"Cadastrados");
								
							}
						}
						break;
			
					case 3:
						System.out.println("op��o 3");
								
					break;
			
					case 4:
						System.out.println("opcao 4");
						break;
			
			
			}
				}
				else{
					System.out.println("N�o h� clientes cadastrados");
					
				}
			}while(opcao!=0);
			
			
			}
			}
	



