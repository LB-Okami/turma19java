package app;

import entities.Produto;
import entities.Revista;

public class CadVendas {

	public static void main(String[] args) {
		Revista fone = new Revista("branco", "532", 23, "globo");
		Revista veja = new Revista("preto", "23", 4040, "Veja");
		
		fone.setValorUnitario(45);
		System.out.println(fone.getID());
		
		fone.incluirEstoque(10);
		System.out.println(fone.getValorUnitario());
		
		fone.retirarEstoque(4);
		System.out.println(fone.getValorUnitario());
		
	}

}
