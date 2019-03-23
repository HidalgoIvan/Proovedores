public class DataAdapter
{
	String[] datos;
	String razonSocial;

	//Elementos para inicializar el envio
	public final int id;
	public final String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
	public final double peso;
	//public final Proveedor proveedor;

	public DataAdapter()
	{

	}
	public void adaptarDatos(String[] datos, RFC rfc)
	{
		int id = Integer.parseInt(datos[0]);
		String direccionEntrega = rfc.getDireccionFiscal();
		String direccionRemiente = datos[1];
		String cpEntrega = datos[2];
		String cpRemitente = datos[3];
		double peso = Double.parseDouble(datos[4]);
		String tipo = datos[5];
		String codigoEspecial = datos[6];
	}
	private void generaEnvio(String[] datos, RFC rfc)
	{
		adaptarDatos(datos, rfc);
	}

}