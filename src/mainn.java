import java.sql.*;
public class mainn {
    public void admin() throws SQLException{
        Connection con;
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","admin");
        System.out.println("connected with admin");   
        adminnstudent as = new adminnstudent();
        as.adminstu();
        
        }
        
        catch(ClassNotFoundException e){
            System.out.println("Cant able to load the driver");
        }
        catch(SQLException e){
            System.out.println("cant able to connect with admin");
            regis rg = new regis();
            rg.regg();
                     
        }
        
    }
}
