package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		
		Map<Pais, Integer> contadorPaises = new HashMap<>();
		
		 for (Vehiculo vehiculo : Vehiculo.listado) {
			 	Fabricante fabricante = vehiculo.getFabricante();
	            Pais pais = fabricante.getPais();
	            contadorPaises.put(pais, contadorPaises.getOrDefault(pais, 0) + 1);
		 }
	        Pais paisMasFrecuente = null;
	        int maxCantidad = 0;
	        
	        for (Map.Entry<Pais, Integer> entry : contadorPaises.entrySet()) {
	            if (entry.getValue() > maxCantidad) {
	                paisMasFrecuente = entry.getKey();
	                maxCantidad = entry.getValue();
	            }
	        }

	        return paisMasFrecuente;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
