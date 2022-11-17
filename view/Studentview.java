package view;
import model.StudentModel;
import controller.StudentController;

public class Studentview {
    public static void main(String[] args) {
        StudentModel sa1= new StudentModel(2,"SHiSHIjfr", 40, "kathmafjndu", 94843);
        StudentController sc = new StudentController();
        sc.insertStudent(sa1);
    }
    
    
}
