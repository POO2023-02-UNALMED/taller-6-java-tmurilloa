package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {
	private int puestos;
	protected static List<Automovil> listado = new ArrayList<>();
	
	public Automovil(String placa,String nombre,int precio,int peso,
			Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		listado.add(this);
		Vehiculo.listado.add(this);
	}
	
	public static int cantidadAutomoviles() {
		return listado.size();
	}
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}


}