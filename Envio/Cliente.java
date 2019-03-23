public class Cliente
{
	private RFC rfc;
	private int n;
	String[] datos;
	private DataAdapter dataAdapter;
	public Cliente(RFC rfc, int n, String[] datos, DataAdapter dataAdapter)
	{
		this.rfc = rfc;
		this.n = n;
		this.datos = datos;
		this.dataAdapter = dataAdapter;
	}
	public void generarEnvio(String[] datos, RFC rfc)
	{
		dataAdapter.generarEnvio(String[] datos);
	}
}