package Program;

import java.util.Locale;
import java.util.Scanner;

public class Aula004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int numero = sc.nextInt();
		double [] valores = new double [numero];
		double media= 0;
		double soma = 0;
		
		for (int i = 0; i < valores.length; i++)
		{
			valores[i] = sc.nextDouble();
			soma += valores[i];
		}
		media = soma / valores.length;
		for (int i = 0; i < valores.length; i++)
		{
			System.out.println("Valores: " +valores[i]);
		}
		System.out.printf("%nSOMA:%.2f%nMÉDIA: %.2f ", soma, media);
		
		sc.close();

	}

}
