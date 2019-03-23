package envio;
public class ProveedorProviderFactory
{
	public Proveedor getProveedor(Class c)
	{
		if(c == EnviosExpresProveedor.class)
		{
			return new EnviosExpresProveedor();
		}
		if(c == BombaEnviosProveedor.class)
		{
			return new BombaEnviosProveedor();
		}
		if(c == PastesGoProveedor.class)
		{
			return new PastesGoProveedor();
		}
		return new BombaEnviosProveedor();
	}
}