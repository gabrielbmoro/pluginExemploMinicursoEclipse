package br.unipampa.lesa;

public class Circulo implements FormaDaGeometriaPlana{

	private double raio;
	private static final double PI = 3.14;
	
	public Circulo(double raio)
	{
		this.raio = raio;
	}

	@Override
	public double recuperarArea() {
		return (PI* Math.pow(raio, 2));
	}
	
	

}
