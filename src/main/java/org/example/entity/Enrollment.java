package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.base.model.BaseEntity;

@Getter
@Setter
@SuperBuilder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Enrollment extends BaseEntity<Long> {

    @Column(nullable = false)
    Double grade;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    Student student;


    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    Course course;

}
