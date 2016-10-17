import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class allteacher extends JFrame implements ActionListener{
  JTable t1;
  
    allteacher()
    {
String col[]={"id","name","dob","gender","subject","semester","session","contact","email"};

String data[][]=new String[20][9];
int i=0,j=0;
try
{
    conn c  = new conn();
    ResultSet rs = c.s.executeQuery("select * from teacher");
    
    // data = new String[rs.count][3];
    while(rs.next())
    {
        data[i][j++]=rs.getString("id");
        data[i][j++]=rs.getString("name");
        data[i][j++]=rs.getString("dob");
        data[i][j++]=rs.getString("gender");
       data[i][j++]=rs.getString("subject");
       data[i][j++]=rs.getString("semester");
      data[i][j++]=rs.getString("session");
      data[i][j++]=rs.getString("contact");
      data[i][j++]=rs.getString("email");
  
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
      
