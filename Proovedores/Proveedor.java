public interface Proveedor
{
	int id;
	String nombre, region;
	double PRECIO_DOCUMENTOS, PRECIO_CAJA, EXCESO;
	double calcularCosto(Envio);
}