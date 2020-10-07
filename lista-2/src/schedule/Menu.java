package schedule;

public class Menu {
	// m�todos static, s�o m�todos que n�o precisam de um objeto
	// para serem executados!
	// m�todos static pertencem a classe
	// static � um modificador de comportamento
	public static void mostrarMenu() {
		System.out.println("\n*********************");
		System.out.println("Selecione a op��o desejada:");
		System.out.println("1. Cadastrar cliente");
		System.out.println("2. Fazer agendamento");
		System.out.println("3. Remover agendamento");
		System.out.println("4. Editar agendamento");
		System.out.println("5. Listar cliente");
		System.out.println("6. Listar agendamentos");
		System.out.println("7. Salvar arquivo");
		System.out.println("8. Ler arquivo");
		System.out.println("9. Gerar relat�rio");

		System.out.println("10. Tchau");
		System.out.println("*********************\n");
	}
}