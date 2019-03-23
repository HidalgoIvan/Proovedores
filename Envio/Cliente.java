package envio;
public class Cliente
{
	private RFC rfc;
	private int n;
	String[] datos = new String[2];
	private DataAdapter dataAdapter;
	public Cliente(RFC rfc, int n, DataAdapter dataAdapter)
	{
		this.rfc = rfc;
		this.n = n;
		this.datos[0] = rfc.getDireccionFiscal();
		this.datos[1] = "012345";
		this.dataAdapter = dataAdapter;
		System.out.println("Soy un cliente con " + n + " envios, mi direccion RFC es " + rfc.getDireccionFiscal());
	}
	public void generarEnvio(String[] datos, RFC rfc)
	{
		this.dataAdapter.generarEnvio(datos, rfc);
	}
}