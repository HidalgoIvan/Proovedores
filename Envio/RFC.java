package envio;
public class RFC
{
	private String direccionFiscal;
	private String razonSocial;
	public RFC(String direccionFiscal, String razonSocial)
	{
		this.direccionFiscal = direccionFiscal;
		this.razonSocial = razonSocial;
	}
	public String getDireccionFiscal()
	{
		return this.direccionFiscal;
	}
}