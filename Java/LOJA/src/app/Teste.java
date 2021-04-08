package app;

import entities.Produto;
import entities.Revista;

public class Teste {

	public static void main(String[] args) {
		Produto fone = new Produto("branco", "532", 23);
		Revista veja = new Revista("preto", "23", 4040, "Veja");
		
		fone.setValorUnitario(45);
		System.out.println(fone.getID());
		
		fone.incluirEstoque(10);
		System.out.println(fone.getValorUnitario());
		
		fone.retirarEstoque(4);
		System.out.println(fone.getValorUnitario());
		
	}

}
