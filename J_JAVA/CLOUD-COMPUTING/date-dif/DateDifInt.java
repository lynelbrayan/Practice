/*-----------------------------------------------------------------------------------------------------------------------
Exercise no: 4
Author: 2117066
RMI program to diference between two dates (in days)
----------------------------------------------------------------------------------------------------------------------- */
//DateDifInt.java

import java.rmi.*;

public interface DateDifInt extends Remote
{
    public String dateDif(String a,String b) throws RemoteException;
} 