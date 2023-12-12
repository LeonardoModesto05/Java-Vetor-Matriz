package Program;

import java.util.Scanner;

public class Aula009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.printf("Quantos valores vai ter o vetor? ");
		int n = sc.nextInt();
		double [] vetor = new double [n];
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		System.out.printf("%.3f%n",media);
		System.out.println("Valores abaixo da media: ");
		for (int i = 0; i < vetor.length; i++)
		{
			if(vetor[i] < media)
			{
				System.out.printf("%.1f%n",vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
