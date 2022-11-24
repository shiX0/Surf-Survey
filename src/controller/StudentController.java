package controller;

import database.Dbconnection;
import model.StudentModel;

public class StudentController{
    Dbconnection dbconnection;
    public int insertStudent(StudentModel student){
    int id = student.getStudentId();
    String name= student.getStudentName();
    int age= student.getStudentAge();
    String address= student.getStudentAddress();
    int contact= student.getStudentContact();
    String insertQuery = String.format("insert into tbl_student(std_id, std_name, std_age, std_address, std_contact) values (%d,'%s',%d,'%s',%d)",id,name,age,address,contact);
    System.out.println(insertQuery);
    dbconnection = new Dbconnection();
    int result = dbconnection.manipulate(insertQuery);
    return result;
}


}