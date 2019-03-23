package envio;
public interface Proveedor
{
	double PRECIO_DOCUMENTOS = 0; 
	double PRECIO_CAJA = 0; 
	double EXCESO = 0;
	double calcularCosto(Envio envio);
	String getNombre();
	String getRegion();
}