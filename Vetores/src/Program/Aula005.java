package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Identidades;

public class Aula005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int numeros = sc.nextInt();
		Identidades [] ident = new Identidades[numeros];
		String name;
		int idade;
		double altura;
		double soma = 0;
		int nMenores = 0;
		
		for (int i = 0; i < ident.length; i++)
		{
			System.out.printf("Dados da %da pessoa:%n",i+1);
			sc.nextLine();
			name = sc.nextLine();
			idade = sc.nextInt();
			altura = sc.nextDouble();
			ident[i] = new Identidades(name,idade,altura);
			soma += ident[i].getAltura();
			if (ident[i].getIdade() < 16)
			{
				nMenores += 1;
			}
		}
		double media = soma / ident.length;
		double percentualMenores = ((double)nMenores / ident.length) * 100;
		
		System.out.printf("Altura Média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.0f% %n", percentualMenores);
		
		for (int i = 0; i < ident.length; i++)
		{
			if(ident[i].getIdade() < 16)
			{
				System.out.println(ident[i].getName());
			}
		}
		sc.close();

	}

}
