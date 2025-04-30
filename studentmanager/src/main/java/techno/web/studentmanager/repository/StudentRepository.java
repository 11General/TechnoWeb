package techno.web.studentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import techno.web.studentmanager.model.Student;

import java.util.Optional;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentById(Long id);

    Optional<Student> findStudentById(Long id);
}
