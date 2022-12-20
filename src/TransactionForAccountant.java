import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begench
 */
public class TransactionForAccountant {
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public void workerUpadateAcc(int id,float hours,float deposit){
        String query = "Update workers set hours=? , deposit=? where id_worker=?";
        
        try{
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setFloat(1, hours);
            preparedStatement.setFloat(2, deposit);
            preparedStatement.setInt(3, id);
            
            preparedStatement.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(TransactionForAccountant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<ModulForAccountant> workerExtraction(){
        ArrayList<ModulForAccountant> output = new ArrayList<ModulForAccountant>();
        try{
            statement = con.createStatement();
            String query = "SELECT * FROM workers";
            
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
                float hours = rs.getFloat("hours");
                float deposit = rs.getFloat("deposit");
                float hourly_earning = rs.getFloat("hourly_earning");
                
                
                output.add(new ModulForAccountant(id, name, surname,departmant, gender, age, adres, tel_no, hours, deposit, hourly_earning));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(TransactionForAccountant.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    public TransactionForAccountant(){
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
