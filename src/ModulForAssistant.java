/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author begench
 */


public class ModulForAssistant {
    private int id;
    private String name;
    private String surname;
    
    private String departmant;
    private String gender;
    private int age;
    private String adress;
    private String tel_no;

    public ModulForAssistant(int id, String name, String surname,String departmant, String gender, int age,  String adress, String tel_no) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        
        this.gender = gender;
        this.age = age;
        this.departmant = departmant;
        this.adress = adress;
        this.tel_no = tel_no;
    }

    

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }
    
    
            
}
