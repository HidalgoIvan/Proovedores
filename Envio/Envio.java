package envio;
public class Envio
{
	//Elementos requeridos
	public int id;
	public String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
	public double peso;
	public Proveedor proveedor;
	//Elementos opcionales
	public String etiqueta = "";
	public double precio;
	private Envio(Builder builder)
	{
		this.id = builder.id;
		this.direccionEntrega = builder.direccionEntrega;
		this.direccionRemiente = builder.direccionRemiente;
		this.cpEntrega = builder.cpEntrega;
		this.cpRemitente = builder.cpRemitente;
		this.tipo = builder.tipo;
		this.codigoEspecial	= builder.codigoEspecial;
		this.peso = builder.peso;
		this.proveedor = builder.proveedor;
		this.etiqueta = builder.etiqueta;
		this.precio = proveedor.calcularCosto(this);
	}
	public String getEtiqueta()
	{
		return "Este paquete tiene las etiquetas: " + etiqueta;
	}
	public void printEnvio()
	{
		System.out.println("Nueva orden de envio recibida:");
		System.out.println("ID: " + this.id);
		System.out.println("Entrega: " + this.direccionEntrega);
		System.out.println("CP Entrega: " + this.cpEntrega);
		System.out.println("Remitente: " + this.direccionRemiente);
		System.out.println("CP Remitente: " + this.cpRemitente);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Codigo Especial: " + this.codigoEspecial);
		System.out.println("Peso: " + this.peso);
		System.out.println("Proovedor: " + this.proveedor.getNombre());
		System.out.println("Etiqueta(s): " + this.etiqueta);
		System.out.println("Precio: " + this.precio);
	}
	public static class Builder
	{
		public int id;
		public String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
		public double peso;
		public Proveedor proveedor;
		public String etiqueta = "";
		public Builder(int id, String direccionEntrega,String direccionRemiente,String cpEntrega,String cpRemitente,String tipo,String codigoEspecial, double peso, Proveedor proveedor)
		{
			this.id = id;
			this.direccionEntrega = direccionEntrega;
			this.direccionRemiente = direccionRemiente;
			this.cpEntrega = cpEntrega;
			this.cpRemitente = cpRemitente;
			this.tipo = tipo;
			this.codigoEspecial	= codigoEspecial;
			this.peso = peso;
			this.proveedor = proveedor;
			this.etiqueta = "";
			
		}
		public Builder conEtiquetaFragil()
		{
			this.etiqueta += "Frágil ";
			return this;
		}
		public Builder conEtiquetaExpress()
		{
			this.etiqueta += "Express ";
			return this;
		}
		public Envio build()
		{
			return new Envio(this);
		}
	}
}	
