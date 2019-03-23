package envio;
public class DataAdapter
{
	String[] datos;
	String razonSocial;

	//Elementos para inicializar el envio
	public final int id = 0;
	public final String direccionEntrega = "";
	String direccionRemiente = "";
	String cpEntrega = ""; 
	String cpRemitente = ""; 
	String tipo = ""; 
	String codigoEspecial = "";
	public final double peso = 0;
	//public final Proveedor proveedor;

	public DataAdapter()
	{

	}
	private void adaptarDatos(String[] datos, RFC rfc)
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
	public void generarEnvio(String[] datos, RFC rfc)
	{
		adaptarDatos(datos, rfc);
	}

}