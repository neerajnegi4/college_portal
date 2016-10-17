import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class newtransport extends JFrame implements ActionListener
{
  JTextField t1,t2,t3,t4,t5,t6;
  JButton b1;
  
    newtransport()
    {
        super("transport Registration form");
        setLayout(new FlowLayout());
        setSize(200,500);
        add(new JLabel("vehical_no"));
        t1=new JTextField(10);
        add(t1);
        
        add(new JLabel("Rout"));
        t2=new JTextField(15);
        add(t2);
          add(new JLabel("Timing"));
        t3=new JTextField(15);
        add(t3);
          add(new JLabel("Driver_name"));
        t4=new JTextField(15);
        add(t4);
          add(new JLabel("no_of_sheet"));
        t5=new JTextField(15);
        add(t5);
          add(new JLabel("Type"));
        t6=new JTextField(15);
        add(t6);
         b1= new JButton("Insert");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String q="insert into transport values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"')";
        System.out.println(q); 
        try
        {
            conn c1= new conn();
            c1.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Registered");
        }
        catch(Exception e)
        {
        e.printStackTrace();
    }
}
}
        
        
      
        
        
        
        
      