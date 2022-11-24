package model;

public class StudentModel {
private int  std_id;
private String  std_name;    
private int  std_age;
private String  std_address;
private int  std_contact;

// creation of constructtr
public StudentModel(int std_id, String std_name,int std_age,String std_address,int std_contact){
this.std_id = std_id;    
this.std_name     = std_name;
this.std_age     = std_age;
this.std_address  = std_address;
this.std_contact= std_contact;
}
public void setStudentId(int newStudentId){
    this.std_id=newStudentId;
    }
    
    public int getStudentId(){
    return this.std_id;
    }
    public void setStudentName(String newStudentName){
    this.std_name=newStudentName;
    }
    
    public String getStudentName(){
    return this.std_name;
    }
    public void setStudentAge(int newStudentAge){
    this.std_age=newStudentAge;
    }
    
    public int getStudentAge(){
    return this.std_age;
    }
    public void setStudentAddress(String newStudentAddress){
    this.std_address=newStudentAddress;
    }
    
    public String getStudentAddress(){
    return this.std_address;
    }
    public void setStudentContact(int newStudentContact){
    this.std_id=newStudentContact;
    }
    
    public int getStudentContact(){
    return this.std_contact;
    }
    }


    

