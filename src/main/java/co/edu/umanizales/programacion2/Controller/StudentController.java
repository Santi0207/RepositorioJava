package co.edu.umanizales.programacion2.Controller;


import co.edu.umanizales.programacion2.Model.StudentModel;
import co.edu.umanizales.programacion2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getmessage()
    {
        return "Hello world";
    }
    @GetMapping("/all")
    public List<StudentModel>getAllStudentModel()
    {
        return studentService.getAllStudents();
    }
}
