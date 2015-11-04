package br.unipampa.lesa;

public class Triangulo implements FormaDaGeometriaPlana{

	private double comprimento;
	private double largura;
	
	public Triangulo(double comprimento, double largura)
	{
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	@Override
	public double recuperarArea() {
		return ((comprimento*largura)/2);
	}

	
}
