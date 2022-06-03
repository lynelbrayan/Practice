import java.rmi.*;

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
public class ClientApp extends JFrame implements ActionListener{
    ClientApp()
    {
        JTextField d=new JTextField("yyyy-mm-dd",20);
        JButton b=new JButton("Submit");
        JLabel l1=new JLabel("");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try{
                    Finder f=(Finder) Naming.lookup("rmi://localhost/age");
                    String j=f.age(d.getText().toString());
                    l1.setText(j);

                }catch(Exception f){
                    System.out.println(f);
                }
            }

        });
        getContentPane().add(d);
        getContentPane().add(l1);
        getContentPane().add(b);
        setLayout(new GridLayout(3,1));
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new ClientApp();
        
    }
    
}
