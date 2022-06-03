import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.time.*;

public class FinderImpl extends UnicastRemoteObject implements Finder{
    String str;
    FinderImpl() throws RemoteException
    {

    }
    public String age(String a) throws RemoteException
    {
        LocalDate s1;
        String[] s;
        LocalDate now=LocalDate.now();
        try {
            s=a.toString().split("-");
            s1=LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
            Period dif=Period.between(s1, now);
            
        
        str=""+dif.getYears()+" years"+dif.getMonths()+" months"+dif.getYears()+" days";
        
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;

    }

    
}
