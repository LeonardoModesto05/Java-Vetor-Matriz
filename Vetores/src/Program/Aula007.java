package Program;

import java.util.Scanner;

public class Aula007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos numeros voce vai digitar: ");
		int numeros = sc.nextInt();
		int [] valores = new int [numeros];
		int maior = 0;
		int posicao = 0;
		
		valores[0] = sc.nextInt();
		maior = valores[0];
		
		for (int i = 1; i < valores.length; i++ )
		{
			valores[i] = sc.nextInt();
			
			if(valores[i] > maior)
			{
				maior = valores[i];
				posicao = i;
			}
		}
		System.out.printf("Maior valor: %d%n", maior);
		System.out.printf("Posicao do maior valor: %d",posicao);
		
		sc.close();
	}

}
