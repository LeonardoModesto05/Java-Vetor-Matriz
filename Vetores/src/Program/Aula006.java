package Program;

import java.util.Scanner;

public class Aula006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos numeros voce vai digitar: ");
		int numeros = sc.nextInt();
		int [] valores = new int [numeros];
		int numPar = 0;
		
		for (int i = 0; i < valores.length; i++)
		{
			valores[i] = sc.nextInt();
			if (valores[i] % 2 == 0)
			{
				numPar++;
			}
		}
		for (int i = 0; i < valores.length; i++)
		{
			if (valores[i] % 2 == 0)
			{
				System.out.printf("%d%n", valores[i]);
			}
		}
		System.out.println("Quantidade de numeros pares: " + numPar);
		sc.close();
	}

}
