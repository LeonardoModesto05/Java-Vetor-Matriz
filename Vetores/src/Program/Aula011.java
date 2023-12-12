package Program;

import java.util.Scanner;

import Entities.Identify;

public class Aula011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas pessoas vai digitar: ");
		int n = sc.nextInt();
		Identify [] id = new Identify [n];
		System.out.println("Dados da 1 pessoa: ");
		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		id[0] = new Identify(name, idade);
		int old = id[0].getIdade();
		int posicaoMaior = 0;
		for (int i = 1; i < id.length; i++)
		{
			System.out.printf("Dados da %d pessoa%n ", i+ 1);
			System.out.print("Nome: ");
			name = sc.next();
			System.out.print("Idade: ");
			idade = sc.nextInt();
			id[i] = new Identify(name, idade);
			if (id[i].getIdade() >  old )
			{
				old = id[i].getIdade();
				posicaoMaior = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA = %s", id[posicaoMaior].getName());
		
		sc.close();

	}

}
