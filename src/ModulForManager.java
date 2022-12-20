/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begench
 */
public class ModulForManager extends ModulForAccountant{
    private String passw;
    public ModulForManager(int id, String name, String surname,String passw, String departmant, String gender, int age, String adress, String tel_no, float hours, float deposit, float hourly_earning) {
        super(id, name, surname, departmant, gender, age, adress, tel_no, hours, deposit, hourly_earning);
        this.passw = passw;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
    
}
