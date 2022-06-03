import java.rmi.*;

public interface Finder extends Remote
{
    public String age(String a) throws RemoteException;
} 