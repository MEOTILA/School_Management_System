package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Student;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends BaseRepository<Long, Student> {
    Student save (Session session, Student student);

    @Override
    default List<Student> findAll(Session session) {
        return List.of();
    }

    @Override
    default Optional<Student> findById(Session session, Long studentId) {
        return Optional.empty();
    }

    @Override
    default int delete(Session session, Long studentId) {
        return 0;
    }
}
