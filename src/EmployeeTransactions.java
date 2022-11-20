import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


//CalisanIslemleri
/**
 *
 * @author begench
 */
//Burada ise calisan islemleri gerceklesecektir
//bir de burada connection islemleri de gerceklesmesi gerekiyor + like CalisanIslemleri.java
//Adding in library jarConnector for connection database
//veritabani baglantisini yapabilmek icin Connection uzerinden bir obje uretecegiz ve bu obje uzerinden ilerleyecegiz
public class EmployeeTransactions {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public Boolean logIn(int id , String password , String departmant){
        
        String query = "Select  * From workers where id = ? and password = ? and departmant = ?";
        
        try{
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, departmant);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        }catch(SQLException ex){
            Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    public EmployeeTransactions(){
        //constructor for connection
         String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_name;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Driver Bulunamadi...");
        }
        try{
            con = DriverManager.getConnection(url,Database.username,Database.password);
            System.out.println("sql.Baglanti Basarili...");
        }
        catch(SQLException e){
            System.out.println("sql.Baglanti Basarisiz...");
        }
    }
}
