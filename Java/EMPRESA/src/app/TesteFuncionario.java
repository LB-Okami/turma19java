package app;
import java.util.ArrayList;
import java.util.List;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	List<Funcionario> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		Terceiro Lucas = new Terceiro("Lucas", "4849.353-2");
		Funcionario Pedro = new Funcionario("Pedro", "503.493.4");
		Terceiro Larissa = new Terceiro("Larissa", "520.960.203.9", 50, 10, 60);
		
		Lucas.setHoraTrabalhada(50);
		
		Larissa.setHoraTrabalhada(10);
		
		System.out.printf("Funcionário %s \nID: %s \nSalário R$%.1f \n", Lucas.getNome(), Lucas.getID(), Lucas.salario());
		System.out.printf("Funcionário %s \nID: %s \nSalário R$%.1f", Larissa.getNome(), Larissa.getID(), Larissa.salario());
	}
}
