import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
    JTextField t1;
    JPasswordField t2;//design
    JButton b1;
    Login()
    {
        t1=new JTextField(15);
        t2=new JPasswordField(15);
        b1=new JButton("Submit");
        setLayout(new FlowLayout());
        add(new JLabel("Username"));
        add(t1);
        add(new JLabel("Password"));
        add(t2);
        add(b1);
        b1.addActionListener(this);//actin activate
    }
    public void actionPerformed(ActionEvent ae)
    {
        String u= t1.getText();//variable me dalna
        String p= t2.getText();
        String q="select * from login where username='"+u+"'  and password='"+p+"'";
        try
        {
            conn c1=new conn();
            ResultSet rs= c1.s.executeQuery(q);
            if(rs.next())
                //JOptionPane.showMessageDialog(null,"User is valid");
                new project().setVisible(true);
            else
                JOptionPane.showMessageDialog(null,"Invalid user");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Login f1=new Login();
        f1.setSize(200,200);
        f1.setVisible(true);
    }
}
    