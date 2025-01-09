package org.example.service;

import org.example.base.service.BaseService;
import org.example.dto.StudentDTO;
import org.example.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService  extends BaseService<Long, Student> {
    Student save(Student student);
    Student save(StudentDTO studentDTO);
    @Override
    default Student update(Student student) {
        return null;
    }

    @Override
    default List<Student> findAll() {
        return List.of();
    }

    @Override
    default Optional<Student> findById(Long studentId) {
        return Optional.empty();
    }

    @Override
    default void delete(Long studentId) {

    }
}
