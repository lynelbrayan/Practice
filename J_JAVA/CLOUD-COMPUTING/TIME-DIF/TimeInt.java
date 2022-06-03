import java.rmi.*;

public interface TimeInt extends Remote
{
    public String timeDif(String a,String b) throws RemoteException;
}