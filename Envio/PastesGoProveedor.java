package envio;
public class PastesGoProveedor implements Proveedor
{
	public int id = 2;
	public String nombre = "Bomba Envios";
	public String region = "Yucatán";
	double PRECIO_DOCUMENTOS = 59.0;
	double PRECIO_CAJA = 19.0;
	double EXCESO = 600.0;

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