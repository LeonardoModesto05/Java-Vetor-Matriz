package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Aula002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero = sc.nextInt();
		Product [] produtos = new Product[numero];
		double soma = 0.0;
		for(int i = 0; i < produtos.length; i++)
		{
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			produtos[i] = new Product(name, price);
			soma += produtos[i].getPrice();
		}
		double avg = soma / produtos.length;
		System.out.println("Avarege Price: " + avg);
		sc.close();
	}

}
