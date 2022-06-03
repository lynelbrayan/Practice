import java.rmi.*;

class ServerSw
{
    public static void main(String[] args) {
        try{
        AdderImp sum=new AdderImp();
        Naming.rebind("sum", sum);
        }catch(Exception e){}
    }
}