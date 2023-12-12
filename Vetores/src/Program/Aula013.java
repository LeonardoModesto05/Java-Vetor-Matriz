package Program;

import java.util.Scanner;

import Entities.Generos;

public class Aula013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		Generos [] gender = new Generos [n];
		double mediaW = 0;
		double somaW = 0;
		int contadorW = 0;
		int contadorM = 0;
		for (int i = 0; i < gender.length; i++)
		{
			System.out.printf("Digite a altura e o genero da %d pessoa: %n" , i+1);
			double altura = sc.nextDouble();
			char sexo = sc.next().charAt(0);
			gender[i] = new Generos(altura,sexo);
			if (gender[i].getSexo() == 'F')
			{
				somaW += gender[i].getAltura();
				contadorW++;
			} else
			if (gender[i].getSexo() == 'M')
			{
				contadorM++;
			}
			
		
		}
		mediaW = somaW / contadorW;
		double maior = gender[0].getAltura();
		double menor = gender[0].getAltura();
		
		for (int i = 1 ; i < gender.length; i++)
		{
			if (gender[i].getAltura() > maior)
			{
				maior = gender[i].getAltura();
			} else
			if (gender[i].getAltura() < menor)
			{
				menor = gender[i].getAltura();
			}
		}
		
		System.out.printf("Menor altura: %.2f%n", menor);
		System.out.printf("Maior altura: %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaW);
		System.out.println("Numero de homens: " + contadorM);
		sc.close();

	}

}
