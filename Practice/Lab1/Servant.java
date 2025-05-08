import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servant extends UnicastRemoteObject implements ServerInterface {
    private static final long serialVersionUID = 1L;

    protected Servant() throws RemoteException {
        super();
    }

    @Override
    public String concat(String a, String b) throws RemoteException {
        return a + b;
    }
}


