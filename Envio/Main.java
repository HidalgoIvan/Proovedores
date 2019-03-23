package envio;
public class Main{
    public static void main(String[] args){
        System.out.println("Bienvenidos a nuestro Package Program");
        //RFC, Adaptador y cliente
        
        RFC rfc =  new RFC("calle fiscal 123", "Orden 4");
        DataAdapter adapter = new DataAdapter();
        Cliente cliente = new Cliente(rfc, 1, adapter);
        cliente.generarEnvio();
    }
}