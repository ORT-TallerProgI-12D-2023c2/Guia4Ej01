package tp4.ej01;

import java.util.ArrayList;
import java.util.Arrays;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Restaurant {

	private static final int CANT_CAJEROS = 5;
	private static final int CANT_ROBOTS = 8;
	private ArrayList<Pedido> pedidos;
	private Robot[] robots;
	private Cajero[] cajeros;

	public Restaurant(ArrayList<Pedido> pedidos, Robot[] robots, Cajero[] cajeros) {
		super();
		this.pedidos = new ArrayList<>(pedidos);
		this.robots = Arrays.copyOf(robots, robots.length);
		this.cajeros = Arrays.copyOf(cajeros, cajeros.length);
	}

	public double[] montosPorCajero() {
		double[] montos = new double[CANT_CAJEROS];
		for (Pedido p : pedidos) {
			montos[p.getIdCajero()] += p.getMonto();
		}
		return montos;
	}

	public InfoPedido[] informeDePedidos() {
		InfoPedido[] informes = new InfoPedido[pedidos.size()];
		for (int i = 0; i < pedidos.size(); i++) {
			try {
				informes[i] = pedidoToInforme(pedidos.get(i));
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}			
		}
		return informes;
	}

	private InfoPedido pedidoToInforme(Pedido pedido) {
		double monto = pedido.getMonto();
		String apellido = cajeros[pedido.getIdCajero()].getApellido();
		int idxRobot = buscarRobot(pedido.getCodRobot());
		int nivelBateria = this.robots[idxRobot].getNivelBateria();
		return new InfoPedido(monto, apellido, nivelBateria);
	}
	
	/**
	 * Retorna el índice del robot en el array de acuerdo al código que llega por parámetro
	 * @param codigo El código del robot a buscar
	 * @return el índice del robot encontrado
	 * @throws RuntimeException Si no se encuentra ningún robot por código
	 */
	private int buscarRobot(String codigo) {
		int i = this.robots.length - 1;
		while(i >= 0 && !this.robots[i].tieneCodigo(codigo)) {
			i--;
		}
		if (i < 0) {
			throw new RuntimeException("No se encuentra robot con código " + codigo);
		}
		return i;
	}

	public void mostrarPedidosConMasRiesgo() {
		// Método a resolver...
	}

}