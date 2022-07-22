//Server.java
import java.rmi.*;
public class Server
{
    public static void main(String[] args) {
        try {
            RankImpl a=new RankImpl();
            Naming.rebind("rank",a);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}