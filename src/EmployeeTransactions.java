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
    public void workerUpdate(int id,String new_name,String new_surname,String new_passw,String new_departmant,String new_gender,int new_age,String new_adress,String new_tel_no){
        String query1 = "Update workers set name=? , surname=? , password=? , departmant=? ,gender=? , age=? , adress=? , tel_no=? where id_worker=?";
        
        try {
            preparedStatement = con.prepareStatement(query1);
            
            preparedStatement.setString(1, new_name);
            preparedStatement.setString(2, new_surname);
            preparedStatement.setString(3, new_passw);
            preparedStatement.setString(4, new_departmant);
            preparedStatement.setString(5, new_gender);
            preparedStatement.setInt(6, new_age);
            preparedStatement.setString(7, new_adress);
            preparedStatement.setString(8, new_tel_no);
            preparedStatement.setInt(9, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*String query2 = "Update worker_inf set  where id_worker=?";
        
        try {
            preparedStatement = con.prepareStatement(query2);
            

            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    
    
   /*public void worker_InfAdd(){
        
        String query2 = "Insert Into worker_inf(gender,age,adress,tel_no) VALUES(?,?,?,?)";
        
       try{
           
           preparedStatement = con.prepareStatement(query2);

           
           preparedStatement.setString(1, gender);
           preparedStatement.setInt(2, age);
           preparedStatement.setString(3, adress);
           preparedStatement.setString(4, tel_no);
           
           preparedStatement.executeUpdate();
           
       }catch(SQLException ex){
           Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE,null,ex);
       }
    }*/
    public void workerAdd(String name,String surname,String password,String departmant,String gender,int age,String adress,String tel_no){
        String query1 = "Insert Into workers(name,surname,password,departmant,gender,age,adress,tel_no) VALUES(?,?,?,?,?,?,?,?)";
        
        
       try{
           preparedStatement = con.prepareStatement(query1);
           
           
           preparedStatement.setString(1, name);
           preparedStatement.setString(2, surname);
           preparedStatement.setString(3, password);
           preparedStatement.setString(4, departmant);
           preparedStatement.setString(5,gender);
           preparedStatement.setInt(6,age);
           preparedStatement.setString(7,adress);
           preparedStatement.setString(8,tel_no);

           preparedStatement.executeUpdate();
           
       }catch(SQLException ex){
           Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE,null,ex);
       }

    }


    //Showing all workers
    public ArrayList<Worker> workerExtraction(){
        ArrayList<Worker> output = new ArrayList<Worker>();
        try{
            statement = con.createStatement();
            String query = "SELECT * FROM workers";
            
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id_worker");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String passw = rs.getString("password");
                String departmant = rs.getString("departmant");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                String adres = rs.getString("adress");
                String tel_no = rs.getString("tel_no");
                
                output.add(new Worker(id,name,surname,passw,departmant,gender,age,adres,tel_no));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(EmployeeTransactions.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    //for Login
    public Boolean logIn(int id , String password , String departmant){
        
        String query = "Select * From workers where id_worker = ? and password = ? and departmant=?";
        
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
    //connection
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
