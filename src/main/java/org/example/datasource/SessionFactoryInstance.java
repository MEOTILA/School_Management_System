package org.example.datasource;

import org.example.entity.Course;
import org.example.entity.Enrollment;
import org.example.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryInstance {
    public static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Enrollment.class)
                .buildSessionFactory();
    }
}
