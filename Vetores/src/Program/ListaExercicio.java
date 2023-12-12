package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class ListaExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		//inicializa a lista com a classe "Employee"
		List <Employee> list = new ArrayList <> ();
		//recebe os dados e é criado a função para verificar se o numero do ID é repetido
		for (int i = 0; i < n; i++)
		{
			System.out.println("Employee #" + (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasID(list,id))
			{
				System.out.println("ID already taken. Try Again: ");
				id =sc.nextInt();
			}
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		/* recebe o valor do id, verifica se o ID existe e se sim recebe o valor da porcentagem*/
		System.out.print("Enter the employee id that will have salary increase:  ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		
		if (emp == null)
		{
			System.out.println("This ID does not exist!");
		} else
		{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		for (Employee obj : list)
		{
			System.out.println(obj);
		}
		sc.close();
	}
	
	public static boolean hasID(List <Employee> list, int id)
	{
		Employee emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		return emp != null;
	}

}
