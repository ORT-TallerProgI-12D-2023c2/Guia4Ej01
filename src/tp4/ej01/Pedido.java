package tp4.ej01;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Pedido {

	private String nombreCliente;
	private int idCajero;
	private String codRobot;
	private double monto;
	
	
	
	public Pedido(String nombreCliente, int idCajero, String codRobot, double monto) {
		super();
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codRobot = codRobot;
		this.monto = monto;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public String getCodRobot() {
		return codRobot;
	}

	public double getMonto() {
		return monto;
	}

	
	

}