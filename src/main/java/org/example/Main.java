package org.example;

import org.example.base.config.ApplicationContext;
import org.example.entity.Student;
import org.example.service.StudentService;

public class Main {

    static StudentService studentService = ApplicationContext.getStudentService();

    public static void main(String[] args) {

/*        AdminService adminService= ApplicationContext.getAdminService();
        Admin admin=new Admin();
        admin.setFirstName("Shari");
        admin.setLastName("Yahyaei");
        adminService.save(admin);*/

        Student student1 = new Student();
        student1.setEmail("sattar@gmail.com");
        student1.setName("Sattar");
        studentService.save(student1);


    }
}