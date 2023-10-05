package tp4.ej01;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Cajero {

	private static int contadorIds = 0;
	private int id;
	private String apellido;
	private int antiguedad;
	
	public Cajero(String apellido, int antiguedad) {
		this.id = contadorIds;
		contadorIds++;
        setApellido(apellido);
        setAntiguedad(antiguedad);
    }

    public void setApellido(String apellido) {
        // Puedes agregar validaciones adicionales para el apellido si es necesario
        this.apellido = apellido;
    }

    public void setAntiguedad(int antiguedad) {
        validarAntiguedad(antiguedad);
        this.antiguedad = antiguedad;
    }

    private void validarAntiguedad(int antiguedad) {
        if (antiguedad < 0) {
            throw new IllegalArgumentException("La antigüedad no puede ser negativa.");
        }
    }
	
	public String getApellido() {
		return apellido;
	}

	
	
	

}