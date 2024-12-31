package org.example.service.impl;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.example.validation.Validation;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl extends BaseServiceImpl<Long, Student, StudentRepository>
        implements StudentService {
    public StudentServiceImpl(StudentRepository studentRepository) {
        super(studentRepository);
    }

    @Override
    public StudentRepository getRepository() {
        return super.getRepository();
    }

    @Override
    public Validation<Long, Student> getValidation() {
        return super.getValidation();
    }

    @Override
    public Student save(Student student) {
        return super.save(student);
    }

    @Override
    public Student update(Student student) {
        return super.update(student);
    }

    @Override
    public List<Student> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Student> findById(Long studentId) {
        return super.findById(studentId);
    }

    @Override
    public void delete(Long studentId) {
        super.delete(studentId);
    }

    @Override
    public void updateColumns(Student entity, Student student) {

    }

    @Override
    public void infoLogicCheck(Session session, Student student) {

    }

    /*public Student saveStudent(Student student) {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            try {
                session.beginTransaction();
                Validation<Student> userValidation = new Validation<>();
                Validation<Student> studentValidation = new Validation<>();
                Set<String> validationUser = userValidation.valid(student.getUser());
                validationUser.addAll(studentValidation.valid(student));
                if (!validationUser.isEmpty()) {
                    validationUser.forEach(System.out::println);
                    return null;
                }
                studentRepo.saveStudent(session, student);
                return student;
            } catch (Exception e) {
                session.getTransaction().rollback();
                throw new RuntimeException(e);
            }
        }

    }*/

    /*public Student studentUpdate(Student student) {
        try (var session = SessionFactoryInstance.sessionFactory.openSession()) {
            session.beginTransaction();
            Validation<User> userValidation = new Validation<>();
            Validation<Student> studentValidation = new Validation<>();
            Set<String> validationUser = userValidation.valid(student.getUser());
            validationUser.addAll(studentValidation.valid(student));
            if (!validationUser.isEmpty()) {
                validationUser.forEach(System.out::println);
            }
            studentRepo.updatestudent(session, student);
            return student;
        }
    }*/
}
