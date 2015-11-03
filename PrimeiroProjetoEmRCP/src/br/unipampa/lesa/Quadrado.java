package br.unipampa.lesa;

public class Quadrado implements FormaDaGeometriaPlana{
	
	private double lado;
	
	public Quadrado(double valorDoLado)
	{
		this.lado = valorDoLado;
	}
	
	@Override
	public double recuperarArea()
	{
		return (this.lado*this.lado);
	}
}
