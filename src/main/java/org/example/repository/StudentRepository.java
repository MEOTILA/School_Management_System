package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Student;
import org.hibernate.Session;

public interface StudentRepository extends BaseRepository<Long, Student> {
    Student save (Session session, Student student);
}
