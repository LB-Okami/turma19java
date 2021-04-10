package entities;

import java.util.List;

public class Loja extends Produto {
	private String cnpj = "19819156";
	private String nomeEmpresa = "Agiota Conveni�ncia";
	
	public Loja(String descricao, String codigo) {
		super(descricao, codigo);
	}


	//Encapsulamento
	public String getCnpj() {
		return cnpj;
	}
	
	/*
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	*/
	public String getNome() {
		return nomeEmpresa;
	}
	
	/*
	public void setNome(String nome) {
		this.nome = nome;
	}
	*/
	
	//M�todos
	
	
	public void emissaoNota(String item, int quantidade, double valorUnit�rio, double total) {
		
		System.out.print(nomeEmpresa);
		System.out.println("\nCNPJ: " + cnpj);
		System.out.println("NFe: 15615616565");
	}
	
	public void pagamento (int opcaoPagamento, int vezes, double total) {
		double resultado = 0;
		double parcela = 0;
	
		if(opcaoPagamento == 1) {
			if(vezes == 1) {
				resultado = total + (total * 0.1);
				System.out.println("O total � R$" + resultado);
			}
			else if(vezes == 2) {
				resultado = total + (total * 0.2);
				parcela = resultado / 2; 
				System.out.println("O total � R$"+ resultado);
				System.out.println("Valor por parcela "+ parcela);
			}
		}
		else if(opcaoPagamento == 2) {
			System.out.println("O total � R$" + total);
		}
		else if(opcaoPagamento == 3) {
			resultado = total - (total * 0.1);
			System.out.println("O total � R$" + resultado);
		}
		else {
			System.out.println("Insira uma op��o v�lida");
		}
	}
	
}