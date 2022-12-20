/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begench
 */
public class ModulHistory {
    private int id_history;
    private float withdraw;
    private float hourly_earning;
    private float hours;
    private int id_worker;

    public ModulHistory(int id_history, float withdraw, float hourly_earning, float hours, int id_worker) {
        this.id_history = id_history;
        this.withdraw = withdraw;
        this.hourly_earning = hourly_earning;
        this.hours = hours;
        this.id_worker = id_worker;
    }

    public int getId_history() {
        return id_history;
    }

    public void setId_history(int id_history) {
        this.id_history = id_history;
    }

    public float getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(float withdraw) {
        this.withdraw = withdraw;
    }

    public float getHourly_earning() {
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

    public int getId_worker() {
        return id_worker;
    }

    public void setId_worker(int id_worker) {
        this.id_worker = id_worker;
    }
    
    
}
