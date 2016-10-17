import java.sql.*;
class conn
{
    Connection c;
    Statement s;//query chalane ke liye
    conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//driver name
            c=DriverManager.getConnection("jdbc:mysql:///college_portal","root","");//url..jdbc...htpp protocl
            
            s=c.createStatement();
        }
        catch(Exception e)
            {}
    
    }
}