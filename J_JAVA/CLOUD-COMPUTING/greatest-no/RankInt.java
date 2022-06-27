import java.rmi.*;

public interface RankInt extends Remote
{
    public int rankOf(Integer[] a,int b) throws RemoteException;
}