package org.example.base.config;

import org.example.entity.Student;
import org.example.repository.AdminRepository;
import org.example.repository.StudentRepository;
//import org.example.repository.impl.AdminRepositoryImpl;
import org.example.repository.impl.StudentRepositoryImpl;
import org.example.service.AdminService;
import org.example.service.StudentService;
import org.example.service.impl.StudentServiceImpl;

import java.sql.Connection;

public class ApplicationContext {
    //private static Connection CONNECTION;
    //private static final AdminRepository ADMINREPOSITORY;
    //private static final AdminService ADMINSERVICE;

    private static final Class<Student> studentClass;
    private static final StudentRepository STUDENTREPOSITORY;
    private static final StudentService STUDENTSERVICE;

    static {
        //CONNECTION = DatabaseConnection.getConnection();
        //ADMINREPOSITORY =new AdminRepositoryImpl(CONNECTION);
        //ADMINSERVICE=new AdminServiceImpl(ADMINREPOSITORY);

        studentClass = Student.class;
        STUDENTREPOSITORY = new StudentRepositoryImpl(studentClass);
        STUDENTSERVICE = new StudentServiceImpl(STUDENTREPOSITORY);


    }
    //public static AdminService getAdminService() {
        //return ADMINSERVICE;
    //}

    public static StudentService getStudentService() {
        return STUDENTSERVICE;
    }
    public static StudentRepository getStudentRepository() {return STUDENTREPOSITORY; }


}
