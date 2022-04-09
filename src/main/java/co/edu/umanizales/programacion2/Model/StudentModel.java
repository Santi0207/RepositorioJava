package co.edu.umanizales.programacion2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentModel {
    private String identification;
    private byte gender;
    private double salary;
    private boolean job;
    private String name;
}
