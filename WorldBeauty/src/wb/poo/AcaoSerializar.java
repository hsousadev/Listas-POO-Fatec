package wb.poo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Atualizado32

public class AcaoSerializar {

	String caminho = "/home/henrique/cadastrosSalvos5.ser";
	
	public void save(Lojas lojinha) throws Exception {
		

		FileOutputStream canal = new FileOutputStream(caminho);
		ObjectOutputStream escritor = new ObjectOutputStream(canal);
		escritor.writeObject(lojinha);
		escritor.close();
		
		System.out.println("Cadastros de clientes salvo com sucesso!");
		
	}
	
	@SuppressWarnings("unchecked")
	public Lojas load() throws Exception { // tipo de retorno LOJA
		
		FileInputStream canal = new FileInputStream(caminho);
		ObjectInputStream leitor = new ObjectInputStream(canal);
		
		Lojas lojinha = (Lojas) leitor.readObject();
		leitor.close();
		
		System.out.println("Cadastros lidos com sucesso!");
		return lojinha;
	}
	
	
}
