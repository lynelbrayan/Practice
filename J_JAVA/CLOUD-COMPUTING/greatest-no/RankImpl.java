//RankImpl.java
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class RankImpl extends UnicastRemoteObject implements RankInt
{
    RankImpl() throws RemoteException{}

    public int rankOf(Integer[] arr,int n)
    {
        int k=0;
        Arrays.sort(arr);
        Integer[] arr1=new Integer[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
            if(k==0)
            {
                arr1[k++]=arr[i];
            }
            if(arr1[k-1]!=arr[i])
            arr1[k++]=arr[i];
        }
        if(k>=n)
        {
            
        return (int)arr1[n-1];
        }
        
        return -1;
    }
}
