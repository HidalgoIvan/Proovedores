package envio;
public class Cliente
{
	private RFC rfc;
	private int n;
	String[] datos = new String[8];
	private DataAdapter dataAdapter;
	public Cliente(RFC rfc, int n, DataAdapter dataAdapter)
	{
		this.rfc = rfc;
		this.n = n;
		this.datos[0] = "12"; //direc entrega
		this.datos[1] = "012345"; //cp entrega
		this.datos[3] = "bomba envios"; //proveedor
		this.datos[4] = "12.5";//peso
		this.datos[5] = "parcela"; //tipo
		this.datos[6] = "codigo1t42"; //cod especial
		this.datos[7] = "express"; //etiqueta 
		this.dataAdapter = dataAdapter;
		System.out.println("Soy un cliente con " + n + " envios, mi direccion RFC es " + rfc.getDireccionFiscal() + " y quiero un envio " + datos[7] + " con " + datos[3]);
	}
	public void generarEnvio()
	{
		this.dataAdapter.generarEnvio(this.datos, this.rfc);
	}
}