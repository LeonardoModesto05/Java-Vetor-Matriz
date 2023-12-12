package Program;

import java.util.Scanner;

public class Aula010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite quantos elementos vai ter o vetor: ");
		int num = sc.nextInt();
		double [] vetor = new double [num];
		double soma = 0;
		int contador = 0;
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 ==0)
			{
				contador++;
				soma += vetor[i];
			}
		}
		double media = 0;
		if(soma == 0)
		{
			System.out.println("NENHUM NUMERO PAR");
		} else
		{
			media = soma / contador;
			System.out.printf("Media dos pares = %.1f", media);
		}
		
		
		sc.close();
	}

}
