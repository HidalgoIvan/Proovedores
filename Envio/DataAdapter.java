public class DataAdapter
{
	String[] datos;
	String razonSocial;

	//Elementos para inicializar el envio
	public final int id;
	public final String direccionEntrega, direccionRemiente, cpEntrega, cpRemitente, tipo, codigoEspecial;
	public final double peso;
	public final Proveedor proveedor;

	public DataAdapter()
	{

	}
	public void adaptarDatos(String[] datos)
	{
		int id = Integer.parseInt(datos[0]);
		String direccionEntrega = datos[1];
		String direccionRemiente = datos[2];

		generaEnvio();
	}
	private void generaEnvio(String datos)
	{

	}

}