package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{
	private int ejes;
	protected static List<Camion> listado = new ArrayList<>();
	
	public Camion(String placa, String nombre,
			int precio,int peso,Fabricante fabricante,int ejes) {
		
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		listado.add(this);
		Vehiculo.listado.add(this);
	}

	public static int cantidadCamiones() {
		return listado.size();
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}