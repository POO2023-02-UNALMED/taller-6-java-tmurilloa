package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Map<Fabricante, Integer> contadorFabricantes = new HashMap<>();
		 for (Vehiculo vehiculo : Vehiculo.listado) {
	            Fabricante fabricante = vehiculo.getFabricante();
	            contadorFabricantes.put(fabricante, contadorFabricantes.getOrDefault(fabricante, 0) + 1);
		 }
	        Fabricante fabricanteMasVehiculos = null;
	        int maxCantidad = 0;
	        for (Map.Entry<Fabricante, Integer> entry : contadorFabricantes.entrySet()) {
	            if (entry.getValue() > maxCantidad) {
	                fabricanteMasVehiculos = entry.getKey();
	                maxCantidad = entry.getValue();
	            }
	        }

	        return fabricanteMasVehiculos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
