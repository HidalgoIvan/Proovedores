public class ProveedorMain
{
	public static void main(String[] args)
	{
		Provedor proveedor = ProveedorProviderFactory.getProveedor(EnviosExpressProveedor.class);
		System.out.println(proveedor.nombre);
		proveedor = ProveedorProviderFactory.getProveedor(BombaEnviosProveedor.class);
		System.out.println(proveedor.nombre);
		proveedor = ProveedorProviderFactory.getProveedor(PastesGoProveedor.class);
		System.out.println(proveedor.nombre);
	}
}