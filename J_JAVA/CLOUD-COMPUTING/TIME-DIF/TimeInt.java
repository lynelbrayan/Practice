/*-----------------------------------------------------------------------------------------------------------------------
Exercise no: 5
Author: 2117066
RMI program to diference between between two times(24 hrs)
----------------------------------------------------------------------------------------------------------------------- */
//TimeInt.java

import java.rmi.*;

public interface TimeInt extends Remote
{
    public String timeDif(String a,String b) throws RemoteException;
}