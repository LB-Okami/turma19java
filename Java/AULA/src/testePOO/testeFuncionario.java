package testePOO;
import poo.Funcionario;

public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario Pedro = new Funcionario("Pedro", "4849.353-2", 18);
		
		System.out.printf("Funcionário %s, portador do ID %s e tem %d anos", Pedro.nome, Pedro.ID, Pedro.idade);
	}

}
