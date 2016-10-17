import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class updteacher extends JFrame implements ActionListener,ItemListener {
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1;
    Choice g= new Choice();
    
    updteacher()
    {
        super("Teacher Updation Form");
        setSize(200,500);
        setLayout(new FlowLayout());
        
        try {
            conn c = new conn();
            
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                g.add(rs.getString("id"));
            }
            
        }catch(Exception e){}
        add(g);
        g.addItemListener(this);
      
        add(new JLabel("id"));
        t1=new JTextField(10);
        add(t1);
                add(new JLabel("name"));
                t2=new JTextField(15);
                 add(t2);
        add(new JLabel("dob"));
                        t3=new JTextField(15);
                        add(t3);
       add(new JLabel("gender"));
                t4=new JTextField(8);
                add(t4);
        add(new JLabel("subject"));
                        t5=new JTextField(15);
        add(t5);
        add(new JLabel("semester"));
         t6=new JTextField(10);
add(t6);
        add(new JLabel("session"));
        t7=new JTextField(10);
add(t7);
                   add(new JLabel("contact"));
                        t8=new JTextField(10);
                        add(t8);
        add(new JLabel("email"));
                t9=new JTextField(20);
add(t9);
b1=new JButton("update");
add(b1);
b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {  
  
                String q="update teacher set name='"+t2.getText()+"',dob='"+t3.getText()+"',gender='"+t4.getText()+"',subject='"+t5.getText()+"',semester='"+t6.getText()+"',session='"+t7.getText()+"',contact='"+t8.getText()+"',email='"+t9.getText()+"' where id='"+t1.getText()+"'";

    
        System.out.println(q);
        try
        {
            conn c1=new conn();
            c1.s.executeUpdate(q);
JOptionPane.showMessageDialog(null,"updated");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
    try
    {
        conn c = new conn();
        ResultSet rs = c.s.executeQuery("select * from teacher where id='"+g.getSelectedItem()+"'");
        rs.next();
        
         t1.setText(rs.getString("id"));
         
       t2.setText(rs.getString("name"));
        t3.setText(rs.getString("dob"));
        t4.setText(rs.getString("gender"));
      t5.setText(rs.getString("subject"));
       t6.setText(rs.getString("semester"));
      t7.setText(rs.getString("session"));
      t8.setText(rs.getString("contact"));
      t9.setText(rs.getString("email"));
  
    }catch(Exception e){}
      
    }
   
}
