package Program;

import java.util.Scanner;

public class Aula008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.printf("Quantos numeros voce vai digitar?");
		int numeros = sc.nextInt();
		int [] vetorA = new int [numeros];
		int [] vetorB = new int [numeros];
		int [] vetorC = new int [numeros];
		System.out.println("Digite os valores de A: ");
		for (int i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores de B: ");
		for (int i = 0; i< vetorB.length; i++)
		{
			vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i <vetorC.length; i++)
		{
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Valor Resultante: ");
		
		for (int i = 0; i < numeros; i++)
		{
			System.out.printf("%d\n", vetorC[i]);
		}
		sc.close();

	}

}
