package tp4.ej01;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Robot {

	private String codigo;
	private int nivelBateria;
	
	public Robot(String codigo, int nivelBateria) {
        this.codigo = codigo;
        this.nivelBateria = nivelBateria;
    }
	
	public boolean tieneCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}


	public int getNivelBateria() {
		return nivelBateria;
	}
	
	

}