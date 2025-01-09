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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(studentService.findAll().toString());
        System.out.println(studentService.findById(1L).toString());

        try {
            Student student2 = new Student();
            student2.setEmail("camel@yahoo.com");
            student2.setName("Camel");
            student2.setId(1L);
            //studentService.update(student2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        StudentDTO studentDTO1 = new StudentDTO(
                "Jimmy",
                "Jimmy@yahoo.com",
                null
        );

        try {
            studentService.save(studentDTO1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}