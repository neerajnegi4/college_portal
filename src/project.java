import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class project extends JFrame implements ActionListener
{
    project()
    {
        super("college portal System");
        JMenuBar mb =new JMenuBar();
        setJMenuBar(mb);
        JMenu m1= new JMenu("masters");
        JMenu m2= new JMenu("Updation");
        JMenu m3= new JMenu("Reports");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
          JMenuItem t1= new JMenuItem("New Student");
            JMenuItem t2= new JMenuItem("New Teacher");
              JMenuItem t3= new JMenuItem("New Transport");
              JMenu t4= new JMenu("Send Email");
              JMenuItem tt1= new JMenuItem("Class wise");
              JMenuItem tt2= new JMenuItem("All Student");
              JMenuItem tt3= new JMenuItem("To Specific Students");
              t4.add(tt1);
              t4.add(tt2);
              t4.add(tt3);
              m1.add(t1);
              m1.add(t2);
              m1.add(t3);
              m1.add(t4);
              t1.addActionListener(this);
                t2.addActionListener(this);
                  t3.addActionListener(this);
                    t4.addActionListener(this);
                    ImageIcon c1= new ImageIcon("c:/aa/real.jpg");
                    JLabel mm2=new JLabel(c1);
                    setLayout(new BorderLayout());
                    add(mm2,BorderLayout.CENTER);
                    JMenu r1 =new JMenu("Students");
                    m3.add(r1);
                    JMenuItem r2= new JMenuItem("All Students");
                    r1.add(r2);
                    JMenuItem r3= new JMenuItem("Year Wise");
                    r1.add(r3);
                    r2.addActionListener(this);
                    r3.addActionListener(this);
                     JMenu rt1 =new JMenu("Teachers");
                    m3.add(rt1);
                    JMenuItem rt2= new JMenuItem("All Teachers");
                    rt1.add(rt2);
                    JMenuItem rt3= new JMenuItem("Year Wise");
                    rt1.add(rt3);
                    rt2.addActionListener(this);
                    rt3.addActionListener(this);
                  
                    JMenuItem th= new JMenuItem("Update Students");
                    m2.add(th);
                         JMenuItem th1= new JMenuItem("Update Teachers");
                     m2.add(th1);
                    th.addActionListener(this);
                     th1.addActionListener(this);
    
    
                
                 
    
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        if(msg.equals("New Student"))
        {
            newstudent b1= new newstudent();
             b1.setVisible(true);
            b1.setLocation(200,200);
        }
         if(msg.equals("New Teacher"))
        {
            newteacher b1= new newteacher();
             b1.setVisible(true);
            b1.setLocation(200,200);
        }
              if(msg.equals("All Students"))
        {
            All_students b1= new All_students();
           
             b1.setVisible(true);
            b1.setLocation(200,200);
        }
                      if(msg.equals("All Teachers"))
        {
            allteacher b1= new allteacher();
                       b1.setVisible(true);
            b1.setLocation(200,200);
        }
              if(msg.equals("Update Students"))
     {
         updstudent b1 = new updstudent();
           b1.setVisible(true);
        b1.setLocation(200,200);
      }
                       if(msg.equals("Update Teachers"))
     {
         updteacher b1 = new updteacher();
           b1.setVisible(true);
        b1.setLocation(200,200);
      }
                                    if(msg.equals("New Transport"))
     {
         newtransport b1 = new newtransport();
           b1.setVisible(true);
        b1.setLocation(200,200);
      }
        
              
        }
        }
    


            
        
                    
              
        
    
