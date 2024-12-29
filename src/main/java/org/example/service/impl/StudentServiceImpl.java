package org.example.service.impl;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.hibernate.Session;

public class StudentServiceImpl extends BaseServiceImpl<Long, Student, StudentRepository>
        implements StudentService {
    public StudentServiceImpl(StudentRepository studentRepository) {
        super(studentRepository);
    }

    @Override
    public void updateColumns(Student entity, Student foundEntity) {

    }

    @Override
    public void infoLogicCheck(Session session, Student entity) {

    }
}
