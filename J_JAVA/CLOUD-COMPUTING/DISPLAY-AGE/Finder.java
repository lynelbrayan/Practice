/*-----------------------------------------------------------------------------------------------------------------------
Exercise no: 2
Author: 2117066
RMI program to to display your age
(
    input:dob yyyy-mm-dd
    output: 18 years 2 months 5 days
)
----------------------------------------------------------------------------------------------------------------------- */
//Finder.java
import java.rmi.*;

public interface Finder extends Remote
{
    public String age(String a) throws RemoteException;
} 