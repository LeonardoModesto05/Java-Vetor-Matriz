package Program;

import java.util.Scanner;

public class Aula003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		int [] nums = new int [numero];
		
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i< nums.length; i++)
		{
			if (nums[i] < 0)
			{
				System.out.println(nums[i]);
			}
		}
		
		sc.close();

	}

}
