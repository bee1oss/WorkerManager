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
public class TransactionForManager {
     private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    public void workerAddManager(String name,String surname,String password,String departmant,String gender,int age,String adress,String tel_no,float hours,float deposit,float hourlyearning){
        String query = "Insert Into workers(name,surname,password,departmant,gender,age,adress,tel_no,hours,deposit,hourly_earning) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
           preparedStatement = con.prepareStatement(query);
           
           
           preparedStatement.setString(1, name);
           preparedStatement.setString(2, surname);
           preparedStatement.setString(3, surname);
           preparedStatement.setString(4, departmant);
           preparedStatement.setString(5,gender);
           preparedStatement.setInt(6,age);
           preparedStatement.setString(7,adress);
           preparedStatement.setString(8,tel_no);
           preparedStatement.setFloat(9, hours);
           preparedStatement.setFloat(10, deposit);
           preparedStatement.setFloat(11, hourlyearning);

           preparedStatement.executeUpdate();
           
       }catch(SQLException ex){
           Logger.getLogger(TransactionForManager.class.getName()).log(Level.SEVERE,null,ex);
       }
        
    }
    
    
    public void workerUpdateManager(int id , String new_name,String new_surname,String new_password,String new_departmant,String new_gender,int new_age,String new_adress,String new_tel_no,float new_hours,float new_deposit,float new_hourlyearning){
        String query = "Update workers set name=? , surname=? ,password=?, departmant=? ,gender=? , age=? , adress=? , tel_no=? , hours=? , deposit=? , hourly_earning=? where id_worker=?";
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, new_name);
            preparedStatement.setString(2, new_surname);
            preparedStatement.setString(3, new_password);
            preparedStatement.setString(4, new_departmant);
            preparedStatement.setString(5, new_gender);
            preparedStatement.setInt(6, new_age);
            preparedStatement.setString(7, new_adress);
            preparedStatement.setString(8, new_tel_no);
            preparedStatement.setFloat(9, new_hours);
            preparedStatement.setFloat(10, new_deposit);
            preparedStatement.setFloat(11,new_hourlyearning);
            preparedStatement.setInt(12, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TransactionForManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<ModulHistory> workerHistory(){
        
        
        ArrayList<ModulHistory> output = new ArrayList<ModulHistory>();
        String query = "Select * From worker_withdraw_history";
        
        try{
            
        statement = con.createStatement();
            
           ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                 
            
                int id_history = rs.getInt("id_history");
                float withdraw = rs.getFloat("withdraw");
                float hourly_earning = rs.getFloat("hourly_earning");
                float hours = rs.getFloat("hours");
                int id_worker = rs.getInt("id_worker");
                
                output.add(new ModulHistory(id_history,withdraw,hourly_earning,hours,id_worker));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(TransactionForManager.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    
    public ArrayList<ModulForManager> workerExtraction(){
        ArrayList<ModulForManager> output = new ArrayList<ModulForManager>();
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
                float hours = rs.getFloat("hours");
                float deposit = rs.getFloat("deposit");
                float hourly_earning = rs.getFloat("hourly_earning");
                
                
                output.add(new ModulForManager(id, name, surname, passw,departmant, gender, age, adres, tel_no, hours, deposit, hourly_earning));
            }
            return output;
        }catch(SQLException ex){
            
            Logger.getLogger(TransactionForManager.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
    }
    
    public TransactionForManager(){
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
