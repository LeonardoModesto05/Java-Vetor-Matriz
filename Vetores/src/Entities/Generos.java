package Entities;

public class Generos {
	private double altura;
	private char sexo;
	
	public Generos (double altura, char sexo)
	{
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public double getAltura() 
	{
		return altura;
	}
	
	public char getSexo()
	{
		return sexo;
	}
}
