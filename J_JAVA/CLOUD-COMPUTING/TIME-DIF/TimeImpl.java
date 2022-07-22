//TimeImpl.java
import java.rmi.*;
import java.rmi.server.*;

public class TimeImpl extends UnicastRemoteObject implements TimeInt{
    TimeImpl() throws RemoteException {}

    public String timeDif(String s1,String s2) throws RemoteException
    {
        String[] st1=s1.split(":");
        int t1[]=new int[3];
        t1[0]=Integer.parseInt(st1[0]); 
        t1[1]=Integer.parseInt(st1[1]); 
        t1[2]=Integer.parseInt(st1[2]); 

        String[] st2=s2.split(":");
        int t2[]=new int[3];
        t2[0]=Integer.parseInt(st2[0]); 
        t2[1]=Integer.parseInt(st2[1]); 
        t2[2]=Integer.parseInt(st2[2]); 
        int flag=0;
        int[] val={23,59,60};
        String res="";
        for(int i=2;i>=0;i--)
        {
            
            if(flag==0&&t2[i]>=t1[i])
            res=(t2[i]-t1[i])+":"+res;
            else
            {
            res=(val[i]-Math.abs(t1[i]-t2[i]))+":"+res;
            }
            if(t2[i]<t1[i])
                flag=1;         
        }
        System.out.println(res);
        return res;
    }

}
