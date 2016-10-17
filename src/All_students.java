import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class All_students extends JFrame implements ActionListener{
  JTable t1;
  
    All_students()
    {
String col[]={"Rollno","name","dob","gender","branch","semester","session","contact","email"};

String data[][]=new String[20][9];
int i=0,j=0;
try
{
    conn c  = new conn();
    ResultSet rs = c.s.executeQuery("select * from student");
    
    // data = new String[rs.count][3];
    while(rs.next())
    {
        data[i][j++]=rs.getString("univ_Rollno");
        data[i][j++]=rs.getString("name");
        data[i][j++]=rs.getString("Dob");
        data[i][j++]=rs.getString("Gender");
       data[i][j++]=rs.getString("Branch");
       data[i][j++]=rs.getString("Semester");
      data[i][j++]=rs.getString("Session");
      data[i][j++]=rs.getString("Contect");
      data[i][j++]=rs.getString("Email");
  
       j=0; i++;
    }
}catch(Exception e){}
t1 = new JTable(data,col);
JScrollPane js = new JScrollPane(t1);
add(js);
JButton b1 = new JButton("Print Details");
b1.addActionListener(this);
add(b1,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent ae)
    {
    try
    {
        t1.print();
    }catch(Exception e){}
    }
    }
      
