import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class updstudent extends JFrame implements ActionListener,ItemListener {
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1;
    Choice g= new Choice();
    
    updstudent()
    {
        super("Student Updation Form");
        setSize(200,500);
        setLayout(new FlowLayout());
        
        try {
            conn c = new conn();
            
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next())
            {
                g.add(rs.getString("univ_Rollno"));
            }
            
        }catch(Exception e){}
        add(g);
        g.addItemListener(this);
      
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
                t4=new JTextField(8);
                add(t4);
        add(new JLabel("Branch"));
                        t5=new JTextField(15);
        add(t5);
        add(new JLabel("Semester"));
         t6=new JTextField(10);
add(t6);
        add(new JLabel("Session"));
        t7=new JTextField(10);
add(t7);
                   add(new JLabel("Contect"));
                        t8=new JTextField(10);
                        add(t8);
        add(new JLabel("Email"));
                t9=new JTextField(20);
add(t9);
b1=new JButton("update");
add(b1);
b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {  
  
                String q="update student set name='"+t2.getText()+"',Dob='"+t3.getText()+"',Gender='"+t4.getText()+"',Branch='"+t5.getText()+"',Semester='"+t6.getText()+"',Session='"+t7.getText()+"',Contect='"+t8.getText()+"',Email='"+t9.getText()+"' where univ_Rollno='"+t1.getText()+"'";

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
        ResultSet rs = c.s.executeQuery("select * from student where univ_Rollno='"+g.getSelectedItem()+"'");
        rs.next();
        
         t1.setText(rs.getString("univ_Rollno"));
         
       t2.setText(rs.getString("name"));
        t3.setText(rs.getString("Dob"));
        t4.setText(rs.getString("Gender"));
      t5.setText(rs.getString("Branch"));
       t6.setText(rs.getString("Semester"));
      t7.setText(rs.getString("Session"));
      t8.setText(rs.getString("Contect"));
      t9.setText(rs.getString("Email"));
  
    }catch(Exception e){}
      
    }
   
}
