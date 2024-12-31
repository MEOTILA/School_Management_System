package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Student> findAll(Session session) {
        return super.findAll(session);
    }

    @Override
    public Optional<Student> findById(Session session, Long studentId) {
        return super.findById(session, studentId);
    }

    @Override
    public int delete(Session session, Long studentId) {
        return super.delete(session, studentId);
    }
}
