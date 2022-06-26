import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try{
        TimeImpl a=new TimeImpl();

        Naming.bind("TimeDiference", a);

        }catch(Exception e){
            System.out.println(e);
        }

    }
    
}
