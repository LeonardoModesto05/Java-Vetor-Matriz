package Program;

import java.util.Locale;
import java.util.Scanner;

public class Aula001 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	int numero = sc.nextInt();
	double[]altura = new double [numero];
	double soma=0.0;
	for(int i = 0;i<numero;i++)
	{
		altura[i] = sc.nextDouble();
		soma +=altura[i];
	}
	double avg = soma/ numero;
	System.out.println(avg);
	
	sc.close();
			

	}

}
