package wb.poo;

import java.io.Serializable;

//Atualizado3

public class Servicos implements Serializable{
	public String nomeServico;
	
	public String toString() {
		String delimitador = "%%%%%%%%%%%%%%%%%%%%%%%%";
		String info = "Nome do Serviço: " + nomeServico;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
			}
}
