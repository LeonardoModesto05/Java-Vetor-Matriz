package Program;

import java.util.Scanner;

import Entities.DadosE;

public class Aula012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos alunos serao digitados: ");
		int n = sc.nextInt();
		DadosE [] date = new DadosE [n];
		double media = 0.0;
		for (int i = 0; i < date.length; i++)
		{
			System.out.printf("Digite o nome, primeira e segunda nota da %d pessoa%n", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			date[i] = new DadosE (name, nota1, nota2);
		}
		
		for (int i = 0; i < date.length; i++)
		{
			media = (date[i].getNota1() + date[i].getNota2()) / 2;
			if (media >= 6.0)
			{
				System.out.println(date[i].getName());
			}

		}
		
		sc.close();

	}

}
