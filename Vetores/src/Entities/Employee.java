package Entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer ID, String name, Double salary)
	{
		this.id = ID;
		this.name = name;
		this.salary = salary;
	}

	public void setID (Integer ID)
	{
		this.id = ID;
	}
	
	public Integer getID ()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName ()
	{
		return name;
	}
	public void setSalary (Double salary)
	{
		this.salary = salary;
	}
	public void increaseSalary (double percentage)
	{
		salary += (salary * percentage) / 100.0;
	}	
	public String toString()
	{
		return id + ", " + name + ", " + salary;
	}
	
}