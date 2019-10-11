import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Scanner leerScanner = new Scanner(System.in);
        /*System.out.println("Ingresa el primer valor");
        double num1 = leerScanner.nextDouble();
        System.out.println("Ingresa el segundo valor");
        double num2 = leerScanner.nextDouble();

        Object[] params = {num1, num2};*/
        Object[] params = {13.07, 18.06};

        double result = (Double) client.execute("Metodos.suma", params);
        Object[] n = {5, 6, 8, 4, 1};
        String orden = (String) client.execute("Metodos.ordenar", new Object[]{n});
        System.out.println(orden);
        System.out.println("Resultado " + result);
        System.out.println("Resultado de orden" + orden);

    }
}
