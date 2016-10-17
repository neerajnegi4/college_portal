import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class newstudent extends JFrame implements ActionListener
{
  JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
  JButton b1;
  
    newstudent()
    {
        super("student Registration form");
        setLayout(new FlowLayout());
        setSize(200,500);
        add(new JLabel("Univ_Rollno"));
        t1=new JTextField(10);
        add(t1);
        
        add(new JLabel("name"));
        t2=new JTextField(15);
        add(t2);
          add(new JLabel("Dob"));
        t3=new JTextField(15);
        add(t3);
          add(new JLabel("Gender"));
        t4=new JTextField(15);
        add(t4);
          add(new JLabel("Branch"));
        t5=new JTextField(15);
        add(t5);
          add(new JLabel("Semester"));
        t6=new JTextField(15);
        add(t6);
          add(new JLabel("Session"));
        t7=new JTextField(15);
        add(t7);
          add(new JLabel("Contect"));
        t8=new JTextField(15);
        add(t8);
          add(new JLabel("Email"));
        t9=new JTextField(15);
        add(t9);
        b1= new JButton("Insert");
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String q="insert into student values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"')";
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
        
        
      
        
        
        
        
      