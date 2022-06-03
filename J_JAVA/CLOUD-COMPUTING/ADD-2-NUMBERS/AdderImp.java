import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AdderImp extends UnicastRemoteObject implements Adder
{
    AdderImp() throws RemoteException
    {

    }
    public int add(int a,int b) throws RemoteException
    {
        return a+b;
    }

}