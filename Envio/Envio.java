public class Envio
{
	//Elementos requeridos
	public final int id;
	public final String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
	public final double peso;
	public final Proveedor proveedor;
	//Elementos opcionales
	public final String etiqueta;

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
	}
	public String getEtiqueta()
	{
		return "Este paquete tiene las etiquetas: " + etiqueta;
	}
	public static class Builder
	{
		public final int id;
		public final String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
		public final double peso;
		public final Proveedor proveedor;
		public final String etiqueta;

		public Builder(int id, String direccionEntrega,String direccionRemiente,String cpEntrega,String cpRemitente,String tipo,String codigoEspecial, double peso, Proveedor proveedor)
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
		}
		public Builder conEtiquetaFragil()
		{
			this.etiqueta = this.etiqueta + "Frágil ";
			return this;
		}
		public Builder conEtiquetaExpress()
		{
			this.etiqueta = this.etiqueta + "Express ";
			return this;
		}
		public Envio build()
		{
			return new Envio(this);
		}
	}
}	
