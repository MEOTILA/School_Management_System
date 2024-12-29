package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.base.model.BaseEntity;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@ToString(exclude = "enrollments")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Course extends BaseEntity<Long> {

    @NotBlank
    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    Integer credits;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Enrollment> enrollments;
}
