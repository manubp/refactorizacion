package es.studium.Precio;

public class Precio {

		final int IVA = 21;
	
	public double calcularPrecio(int unidades, double precioUnitario1) {
		
		double precioSinIVA = unidades * precioUnitario1;
		double precioConIVA = precioSinIVA * 1.21;
		return precioConIVA;
		
				
	}
	
	
}
