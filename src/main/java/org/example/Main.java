package org.example;

import org.example.base.config.ApplicationContext;
import org.example.dto.StudentDTO;
import org.example.entity.Student;
import org.example.service.StudentService;

public class Main {

    static StudentService studentService = ApplicationContext.getStudentService();
    /*private static StudentRepositoryImpl studentRepositoryImpl;
    static StudentServiceImpl studentServiceimpl = new StudentServiceImpl(studentRepositoryImpl);*/
    public static void main(String[] args) {

        try {
            Student student1 = new Student();
            student1.setEmail("sattar@gmail.com");
            student1.setName("Sattar");
            //studentService.save(student1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(studentService.findAll().toString());
        System.out.println(studentService.findById(1L).toString());


        try {
            StudentDTO studentDTO = new StudentDTO("John", "invalid-email", null);
            studentDTO.validate(); // This will throw an IllegalArgumentException for invalid email
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }

    }
}