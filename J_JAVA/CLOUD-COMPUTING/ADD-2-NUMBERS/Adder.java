/*-----------------------------------------------------------------------------------------------------------------------
Exercise no: 1
Author: 2117066
RMI program to add two numbers
----------------------------------------------------------------------------------------------------------------------- */
//Adder.java
import java.rmi.*;

public interface Adder extends Remote
{
    public int add(int a,int b) throws RemoteException;
}

