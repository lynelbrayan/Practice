//Client.java
import java.rmi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Client extends JFrame implements ActionListener{
    JLabel l1,l2,res;
    JButton sub;
    JTextField t1,t2;
    Client()
    {
        l1=new JLabel("Enter time in hh:mm::ss format");
        l2=new JLabel("Enter time in hh:mm::ss format");
        res=new JLabel("");
        t1=new JTextField(20);
        t2=new JTextField(20);
        sub=new JButton("submit");
        sub.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        setLayout(new GridLayout(3,2));

        add(sub);
        add(res);
        pack();
        setVisible(true);

        


    }

    public void actionPerformed(ActionEvent e)
    {
        try{
            String a=t1.getText().toString();
            String b=t2.getText().toString();
            TimeInt t=(TimeInt)Naming.lookup("rmi://localhost/TimeDiference");
            res.setText(t.timeDif(a, b).toString());

        }
        catch(Exception er){}
    }

    public static void main(String[] args) {
        try{
            new Client();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
