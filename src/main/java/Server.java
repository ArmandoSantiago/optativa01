import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Iniciando el servidor...");
        PropertyHandlerMapping mapeo = new PropertyHandlerMapping();
        mapeo.addHandler("Metodos", Metodos.class);
        WebServer servidor = new WebServer(1200);
        servidor.getXmlRpcServer().setHandlerMapping(mapeo);
        servidor.start();
        System.out.println("Esperando petición...");
    }
}
