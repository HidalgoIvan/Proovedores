package envio;
public class BombaEnviosProveedor implements Proveedor
{
	public int id = 3;
	public String nombre = "Bomba Envios";
	public String region = "Yucatán";
	public String cp = "04567";
	double PRECIO_DOCUMENTOS = 42.0;
	double PRECIO_CAJA = 20.0;
	double EXCESO = 0;

	public double calcularCosto(Envio envio){
		double precio = PRECIO_DOCUMENTOS + PRECIO_CAJA;
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