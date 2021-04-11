package entities;

import java.util.List;

public class Loja extends Produto {
	private String cnpj = "63.403.623/0001-25";
	private String nomeEmpresa = " � Agiota Conveni�ncia � ";
	private double total = 0;
	private double juros10 = 0;
	private double juros20 = 0;
	private double desconto = 0;
	double resultado = 0;
	double parcela = 0;
	int opcaoVezes;
	boolean aVista = false;
	
	public Loja(String descricao, String codigo) {
		super(descricao, codigo);
	}


	// Encapsulamento
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
	
	// M�todos	
	public void emissaoNota(double total, List<Produto> lista) {
		
		System.out.println("                                            " + nomeEmpresa + "\n");
		System.out.println("                                             " + "CNPJ: " + cnpj);
		System.out.println("                                             NFe: 15615616565" + "\n");
		
		for(Produto x: lista) {
			if(x.getQuantEstoque() != 10) {
				System.out.printf("                                 %d x %s = %.2f [Valor unit�rio: %.2f]\n" , (10 - x.getQuantEstoque()) , x.getDescricao() , ((10 - x.getQuantEstoque()) * x.getValorUnitario()) , x.getValorUnitario());
			}
		}
		
		System.out.printf("\n                                          Valor total da compra: R$%.2f.\n", total);
		System.out.printf("                                             Valor dos tributos: R$%.2f" , (this.total * 0.09));
		if (aVista == true) {
			System.out.printf("\n                                             Valor do desconto: R$%.2f" , (this.total * 0.1));
		}
		System.out.println("");
		if (opcaoVezes == 1) {
			System.out.printf("                                            Juros totais da compra: R$%.2f.\n", this.juros10);	
		} else if (opcaoVezes == 2) {
			System.out.printf("                                            Juros totais da compra: R$%.2f.\n", this.juros20);
			System.out.printf("                                            Valor por parcela: R$%.2f." , parcela);
		}		
	}
	
	public void pagamento (int opcaoPagamento, int vezes, double total) {
		this.total = total;
		
		if (opcaoPagamento < 0 || opcaoPagamento > 3) {
			System.out.println("� Por favor, insira uma op��o v�lida.");
		} else if (opcaoPagamento == 1) {
			System.out.print("\nVoc� selecionou cr�dito.");
			if (vezes == 1) {
				opcaoVezes = 1;
				resultado = total + (total * 0.1);
				this.juros10 = total * 0.1;
				System.out.print(" O total � R$" + resultado + ".\n\n");
			} else if (vezes == 2) {
				opcaoVezes = 2;
				resultado = total + (total * 0.2);
				parcela = resultado / 2; 
				this.juros20 = total * 0.2;
				System.out.printf(" O total de juros foi: %.2f\n", juros20);
				System.out.println(" O total � R$" + resultado + ".");
				System.out.println("Valor por parcela "+ parcela);
			}
		} else if (opcaoPagamento == 2) {
			System.out.print("\nVoc� selecionou d�bito.");
			System.out.print(" O total � R$" + total + ".\n\n");
		} else if (opcaoPagamento == 3) {
			aVista = true;
			System.out.println("\nVoc� selecionou pagamento em dinheiro.");
			resultado = total - (total * 0.1);
			this.desconto = total * 0.1;
			System.out.printf("O desconto total foi de R$%.2f." , desconto);
			System.out.println("\nO total � R$" + resultado);
		}
	}
}