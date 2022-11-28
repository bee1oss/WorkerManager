import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//SELECT * FROM worker K INNER JOIN worker_inf KY ON K.id_worker=KY.id_worker; (Veri cekme)
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
    
    public ArrayList<Woker> workerExtraction(){
        ArrayList<Woker> output = new ArrayList<Woker>();
        try{
            statement = con.createStatement();
            String query = "SELECT * FROM worker K INNER JOIN worker_inf KY ON K.id_worker=KY.id_worker";
            
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id_worker");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String departmant = rs.getString("departmant");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                String adres = rs.getString("adress");
                String tel_no = rs.getString("tel_no");
                
                output.add(new Woker(id,name,surname,departmant,gender,age,adres,tel_no));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    
    public Boolean logIn(int id , String password , String departmant){
        
        String query = "Select * From worker where id_worker = ? and password = ? and departmant=?";
        
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
