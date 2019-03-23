package envio;
public class DataAdapter
{
	String[] datos;
	String razonSocial;

	//Elementos para inicializar el envio
	public int id = 0;
	public String direccionEntrega = "";
	String direccionRemiente = "";
	String cpEntrega = ""; 
	String cpRemitente = ""; 
	String tipo = ""; 
	String codigoEspecial = "";
	public double peso = 0;
	public Proveedor proveedor;

	public DataAdapter()
	{

	}
	private void adaptarDatos(String[] datos, RFC rfc)
	{
		this.datos = datos;
		this.id = Integer.parseInt(this.datos[0]);
		this.direccionEntrega = rfc.getDireccionFiscal();
		this.cpEntrega = this.datos[1];
		this.peso = Double.parseDouble(this.datos[4]);
		this.tipo = this.datos[5];
		this.codigoEspecial = this.datos[6];
	}
	public void generarEnvio(String[] datos, RFC rfc)
	{
		adaptarDatos(datos, rfc);
		asignarProveedor();
		Envio envio = new Envio.Builder(this.id, this.direccionEntrega,proveedor.getRegion(),this.cpEntrega,"07845",this.tipo,this.codigoEspecial,this.peso, this.proveedor).conEtiquetaExpress().build();
		envio.printEnvio();
	}
	private void asignarProveedor()
	{
		ProveedorProviderFactory proveedorProviderFactory = new ProveedorProviderFactory();
		switch(datos[3]){
			case "bomba envios":
				this.proveedor = proveedorProviderFactory.getProveedor(BombaEnviosProveedor.class);
				break;
			case "pastes go":
				this.proveedor = proveedorProviderFactory.getProveedor(PastesGoProveedor.class);
				break;
			case "envios express":
				this.proveedor = proveedorProviderFactory.getProveedor(EnviosExpresProveedor.class);
				break;
		}
	}
}