package envio;
public class EnviosExpresProveedor implements Proveedor
{
	public int id = 1;
	public String nombre = "Envio Express";
	public String region = "Sonora";
	double PRECIO_DOCUMENTOS = 39.0;
	double PRECIO_CAJA = 25.0;
	double EXCESO = 500.0;

	public double calcularCosto(Envio envio){
		double precio = 0;
		return precio;
	}
	public String getNombre()
	{
		return nombre;
	}
	public String getRegion()
	{
		return region;
	}
}