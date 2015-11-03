package br.unipampa.lesa;

public class Retangulo implements FormaDaGeometriaPlana{

	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double recuperarArea() {
		return (this.altura * this.largura);
	}
	
	
}
