import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            Servant s = new Servant();

            // Start RMI Registry (if not started)
            LocateRegistry.createRegistry(2000);

            // Bind the remote object
            Naming.rebind("//localhost/Server", s);
            System.out.println("Server is running...");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e);
        }
    }
}

