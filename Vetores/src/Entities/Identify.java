package Entities;

public class Identify {
	private String name;
	private int idade;
	public Identify (String name, int idade)
	{
		this.name = name;
		this.idade = idade;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getIdade ()
	{
		return idade;
	}
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
}
