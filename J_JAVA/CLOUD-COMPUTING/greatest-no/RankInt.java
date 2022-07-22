/*-----------------------------------------------------------------------------------------------------------------------
Exercise no: 3
Author: 2117066
RMI program to display nth largest number
----------------------------------------------------------------------------------------------------------------------- */
//RankInt.java
import java.rmi.*;

public interface RankInt extends Remote
{
    public int rankOf(Integer[] a,int b) throws RemoteException;
}