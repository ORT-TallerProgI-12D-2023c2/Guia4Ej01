package tp4.ej01;

import java.util.ArrayList;
import java.util.Arrays;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		
				
		Cajero[] cajeros = new Cajero[5];

        // Inicializar las instancias del vector
        cajeros[0] = new Cajero("López", 3);
        cajeros[1] = new Cajero("Gómez", 2);
        cajeros[2] = new Cajero("Martínez", 5);
        cajeros[3] = new Cajero("Rodríguez", 1);
        cajeros[4] = new Cajero("Pérez", 4);
        
        Robot[] robots = new Robot[8];

        // Inicializar las instancias del vector
        robots[0] = new Robot("R001", 80);
        robots[1] = new Robot("R002", 90);
        robots[2] = new Robot("R003", 70);
        robots[3] = new Robot("R004", 85);
        robots[4] = new Robot("R005", 60);
        robots[5] = new Robot("R006", 75);
        robots[6] = new Robot("R007", 95);
        robots[7] = new Robot("R008", 50);
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Cliente1", 3, "assad", 150.0));
        pedidos.add(new Pedido("Cliente2", 1, "R007", 200.0));
        pedidos.add(new Pedido("Cliente3", 4, "R005", 120.0));
        pedidos.add(new Pedido("Cliente4", 1, "FAKE", 180.0));
        pedidos.add(new Pedido("Cliente5", 3, "R006", 90.0));
        pedidos.add(new Pedido("Cliente6", 2, "R002", 220.0));
        
        Restaurant res = new Restaurant(pedidos, robots, cajeros);
        
        double montos[] = res.montosPorCajero();
        //UtilVectores.mostrarVector(montos);
        try {
        	UtilVectores.mostrarVector(res.informeDePedidos());        	
        } catch(RuntimeException e) {
        	System.out.println(e.getMessage());
        }
        
	}
	
	

}