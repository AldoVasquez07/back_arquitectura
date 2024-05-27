package servicios.dominio;

public class Producto {
	private String nombre;
	private String marca;
	private double precio;
	private double contenido;
	private String tipo;
	
	public Producto(String nombre, String marca, double precio, double contenido, String tipo) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.contenido = contenido;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getContenido() {
		return contenido;
	}
	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return nombre + " " + marca + " " + precio + " " + contenido
				+ " " + tipo;
	}

	
	
}
