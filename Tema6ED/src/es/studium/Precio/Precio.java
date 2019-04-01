package es.studium.Precio;

public class Precio {

	public double calcularPrecio(int unidades, double precioUnitario1) {
		
		double precioSinIVA = unidades * precioUnitario1;
		double precioConIVA = precioSinIVA * 1.21;
		return precioConIVA;
		
				
	}
	
	
}
