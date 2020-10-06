package wb.poo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

///Atualizado3

public class Lojas implements Serializable{
	
	public int codigoDaLoja;
	public String nomeDaLoja;	
	public List<Cliente> clientes = new ArrayList<>();
	

}
