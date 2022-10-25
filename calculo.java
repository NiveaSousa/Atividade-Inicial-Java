package calculoPreco;

import java.util.Scanner;

public class calculo {
	
	public static void main(String[] args) {
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		float totalCusto = 0.0f;
		float totalVenda = 0.0f;
		
		Scanner leitor = new Scanner(System.in);
		
		int i = 0;
		for (; i < 3; i++) {
			System.out.println("Digite o nome do produto: ");
			nomeProduto = leitor.next();
			
			System.out.println("Digite o preço de custo: ");
			precoCusto = leitor.nextFloat();
			
			System.out.println("Digite o preço de venda: ");
			precoVenda = leitor.nextFloat();
			
			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda+ precoVenda;
			
			
			if(precoCusto == precoVenda) {
				System.out.println("Houve empate de valores.");
			} else {
				if(precoCusto>precoVenda) {
					System.out.println("Houve prejuizo.");
				}else {
					System.out.println("Houve lucro");
				}
			}
			System.out.println(nomeProduto + ", preço de custo:" +
			precoCusto + ", preço de venda: " + precoVenda);
		}
		
		System.out.println("A média do preço de custo é de "+ (totalCusto/i));
		System.out.println("A média do preço de venda é de "+ (totalVenda/i));
	}
	
}
