package tp4.ej01;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class InfoPedido {

	private double monto;
	private String apellidoCajero;
	private int bateriaRobot;
	
	public InfoPedido(double monto, String apellidoCajero, int bateriaRobot) {
		super();
		this.monto = monto;
		this.apellidoCajero = apellidoCajero;
		this.bateriaRobot = bateriaRobot;
	}

	@Override
	public String toString() {
		return "InfoPedido [monto=" + monto + ", apellidoCajero=" + apellidoCajero + ", bateriaRobot=" + bateriaRobot
				+ "]";
	}

	
	

}