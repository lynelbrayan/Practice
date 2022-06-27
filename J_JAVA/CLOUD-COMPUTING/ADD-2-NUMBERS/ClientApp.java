//ClientApp.java
import java.rmi.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ClientApp extends JFrame
{
    public JTextField t1,t2;
    public JLabel l1,l2,res;
    public JButton sub;

    ClientApp()
    {
        super("our app");
        t1=new JTextField(20);
        t2=new JTextField(20);
        l1=new JLabel("1st Number ");
        l2=new JLabel("2nd Number ");
        res=new JLabel(" ");
        sub=new JButton("click");

sub.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
        try{
        int m=Integer.parseInt(t1.getText().toString());
        int n=Integer.parseInt(t2.getText().toString());
        Adder sum=(Adder) Naming.lookup("rmi://localhost/sum");
        res.setText(""+sum.add(m,n));    
        }
        catch(Exception s)
        {
            System.out.println(s);
        }
    }
});


getContentPane().add(l1);
getContentPane().add(t1);
getContentPane().add(l2);
getContentPane().add(t2);
getContentPane().add(sub);
getContentPane().add(res);
setLayout(new GridLayout(3,2));
pack();
setVisible(true);//making the frame visible 

    }


    public static void main(String args[])
    {
       new ClientApp();
    }

}