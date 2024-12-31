package org.example.dto;

import org.example.entity.Enrollment;

import java.util.List;

public record StudentDTO(
        String name,
        String email,
        List<Enrollment> enrollments
) {
    public void validate() {
        validateName();
        validateEmail();
        validateEnrollments();
    }

    private void validateName() {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (name.length() < 2 || name.length() > 100) {
            throw new IllegalArgumentException("Name must be between 2 and 100 characters");
        }
    }

    private void validateEmail() {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank");
        }
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            throw new IllegalArgumentException("Email is not valid");
        }
    }

    private void validateEnrollments() {
        if (enrollments != null) {
            for (Enrollment enrollment : enrollments) {
                if (enrollment == null) {
                    throw new IllegalArgumentException("Enrollment list contains a null value");
                }
                // Add further validation for `Enrollment` entity if required
            }
        }
    }
}
