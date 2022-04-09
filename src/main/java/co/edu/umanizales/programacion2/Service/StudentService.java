package co.edu.umanizales.programacion2.Service;


import co.edu.umanizales.programacion2.Model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<StudentModel> students;


    public List<StudentModel> getAllStudents()
    {
        students = new ArrayList<>();
        students.add(new StudentModel("1002634668",(byte)1,
                20000.23,true,"Santiago Lopez"));
        students.add(new StudentModel("1002645112",(byte)2,
                3000000,false,"Alejandro Libreros"));
        return students;
    }
}
