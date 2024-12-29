package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.hibernate.Session;

public class StudentRepositoryImpl extends BaseRepositoryImpl<Long, Student>
        implements StudentRepository {
    public StudentRepositoryImpl(Class<Student> studentClass) {
        super(studentClass);
    }

    @Override
    public Student save(Session session, Student student) {
        session.persist(student);
        return student;
    }
}
