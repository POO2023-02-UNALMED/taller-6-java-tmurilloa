package vehiculos;

import java.util.ArrayList;
import java.util.List;


public class Camioneta extends Vehiculo{
	private boolean volco;
	protected static List<Camioneta> listado = new ArrayList<>();
	
	public Camioneta(String placa,int puertas, String nombre,
			int precio,int peso,Fabricante fabricante,boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco = volco;
		listado.add(this);
		Vehiculo.listado.add(this);
		
	}
	public static int cantidadCamionetas() {
		return listado.size();
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}