/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begench
 */
public class ModulForAccountant extends ModulForAssistant{
    private float hours;
    private float deposit;
    private float hourly_earning;
    
    
    public ModulForAccountant(int id, String name, String surname, String departmant, String gender, int age, String adress, String tel_no,float hours,float deposit, float hourly_earning) {
        super(id, name, surname, departmant, gender, age, adress, tel_no);
        this.hours = hours;
        this.deposit = deposit;
        this.hourly_earning = hourly_earning;
        
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public double getHourly_earning() {
        return hourly_earning;
    }

    public void setHourly_earning(float hourly_earning) {
        this.hourly_earning = hourly_earning;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

   
    
}
